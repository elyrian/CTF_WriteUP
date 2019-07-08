// Current level and timer
var level = 0;
var levelTimeout = null;

// Social media messages
var tweets = [];
var accessDeniedTweets = [
  "I was just informed that someone is trying to start a nuclear war with MY weapons! Yet the FAKE NEWS are not talking about it. Not good!",
  "Our army is the most secure in the WORLD! Hackers tried but can't break into our DEFCON system. Tremendous!",
  "There are a lot of HACKERS from #Russia trying do destroy our amazing country. We need mode funding for our Army instead of #ObamaCare, and NOW!",
  "U.S.A. are stronger than ever thanks to me. I just protected our DEFCON system against another attack. You're welcome!",
]

// Chemtrail
var chemtrails = ["europe", "usa", "uk", "middle-east", "asia-pacific"];

// Modal state
var modalLevel = null;

function showModal(level) {
  modalLevel = level;

  // Reset form and display modal
  $("#modal form").trigger("reset");
  $("#modal").css("display", "flex");
  $("#modal-password").trigger("focus");
}

function check1(pwd) {
  return checkcheck1(pwd);
}

(function() {
  var mfs = new BrowserFS.FileSystem.MountableFileSystem();
  BrowserFS.initialize(mfs);
  mfs.mount('/tmp', new BrowserFS.FileSystem.InMemory());
  mfs.mount('/home', new BrowserFS.FileSystem.LocalStorage());
  mfs.mount('/sys', new BrowserFS.FileSystem.XmlHttpRequest('listings.json', '/static/java/'));
})();

function check2(pwd) {
    return new Promise((resolve, reject) => {
        const timeout = setTimeout(() => reject(new Error('Timeout while executing JVM')), 200000);
        new Doppio.VM.JVM({
            doppioHomePath: '/sys',
            classpath: ['/sys/classes'],
        }, function (err, jvm) {
            if (err) {
                return reject(err);
            }

            const process = BrowserFS.BFSRequire('process');
            process.initializeTTYs();
            process.stdout.on('data', function (data) {
                const messageStr = data.toString();
                if (messageStr.startsWith('result=')) {
                    process.removeAllListeners();
                    process.stdout.removeAllListeners();
                    resolve(messageStr.slice('result='.length) === 'true');
                    clearTimeout(timeout);
                }
            });

            jvm.runClass('App', [pwd], function (exitCode) {
                console.log('JVM started successfully');
                if (exitCode !== 0) {
                    reject(new Error('Script execution failed'));
                }
            });
        });
    });
}

function check3(pwd) {
  var score = 0;
  var final = 624986;
  var up = 0;
  var b = 0;
  if (pwd.length > 20) {
    return false;
  }
  for (i = 0; i < pwd.length; i++) {
    if (b % 10 === 0) {
      score = 0;
      b = b + 1;
      up = up + 1;
    } else if (up % 5 === 0) {
      score = score + 1;
      b = b + 1;
      up = up + 1;
    } else if (pwd.charAt(i) === "1") {
      score = score + 1;
      b = b + 1;
      up = up + 1;
    } else if (pwd.charAt(i) === "2") {
      score = score * 2;
      b = b + 1;
      up = up + 1;
    } else if (pwd.charAt(i) === "5") {
      score = score * 5;
      b = b + 1;
      up = up + 1;
    } else if (pwd.charAt(i) === "8") {
      b = b + 2;
    } else if (pwd.charAt(i) === "9") {
      up = up + 3;
    } else {
      score = score;
    }
  }
  return score === final + b;
}

function check4(pwd) {
  var input = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
  var output = "NOPQRSTUVWXYZABCDEFGHIJKLMnopqrstuvwxyzabcdefghijklm";
  var index = x => input.indexOf(x);
  var translate = x => (index(x) > -1 ? output[index(x)] : x);
  return (
    pwd
      .split("")
      .map(translate)
      .join("") === "ebgEBGeBgEbgEBGEBgEBGEBGEBGebgeBgEbGebg"
  );
}

function check5(pwd) {
  return pwd === "STRONGPASSWORD";
}

async function validate() {
  if (modalLevel === "defcon-1") {
    return check1($("#modal-password").val());
  } else if (modalLevel === "defcon-2") {
    return await check2($("#modal-password").val());
  } else if (modalLevel === "defcon-3") {
    return check3($("#modal-password").val());
  } else if (modalLevel === "defcon-4") {
    return check4($("#modal-password").val());
  } else if (modalLevel === "defcon-5") {
    return check5($("#modal-password").val());
  } else {
    return false;
  }
}

async function modalSubmission(evt) {
  evt.preventDefault();

  $("#modal").css("display", "none");
  let result = false;
  try {
      $("#loading-modal").css("display", "flex");
      result = await validate();
  } finally {
      $("#loading-modal").css("display", "none");
  }

  if (result) {
    $.post("/level/" + modalLevel + "/", {
      password: $("#modal-password").val()
    })
      .fail(function(err) {
        if (err.status == 403) {
          addTweet(true);
        }
      })
      .then(function(result) {
        setLevel(result["level"]);
      });
  } else {
    addTweet(true);
  }
}

function updateChemtrails() {
  var value = chemtrails[Math.floor(Math.random() * chemtrails.length)];
  $("#chemtrails-operations").vide(
    {
      mp4: "/static/planes/" + value + ".mp4"
    },
    {
      posterType: "none"
    }
  );

  $("#chemtrails-operations h3").text(
    "Chemtrail Operations Tracker (" + value + ")"
  );
}

function addTweet(denied) {
  // Choose message
  if (denied) {
    var tweet =
      accessDeniedTweets[Math.floor(Math.random() * accessDeniedTweets.length)];
  } else {
    var tweet = tweets[Math.floor(Math.random() * tweets.length)];
  }

  // Add element
  var el = $("<li></li>").text(tweet);
  if (denied) {
    el.addClass("denied");
  }
  el.append(
    "<span>@RealDonaldTrump &mdash; " + moment().format("ddd Do, HH:mm z")
  );
  el.prependTo("#social-monitor");

  // Only leave 10 tweets
  $("#social-monitor li:gt(10)").remove();
}

function updateTime() {
  // Set local time
  var now = moment();
  var localSections = $("#local-clock .clock-section");
  localSections.eq(0).text(now.format("HH"));
  localSections.eq(1).text(now.format("mm"));
  localSections.eq(2).text(now.format("ss"));

  // Update timezone indicator
  $("#local-clock-title span").text(
    "(" + Intl.DateTimeFormat().resolvedOptions().timeZone + ")"
  );

  // Update UTC time
  var nowUtc = now.utc();
  var utcSections = $("#utc-clock .clock-section");
  utcSections.eq(0).text(nowUtc.format("HH"));
  utcSections.eq(1).text(nowUtc.format("mm"));
  utcSections.eq(2).text(nowUtc.format("ss"));
}

function updateWeapons() {
  var messages = ["Ready", "Alert", "Down"];
  var classes = ["weapons-ok", "weapons-warning", "weapons-error"];

  var value = Math.random() * 20;

  if (value < 16) {
    state = 0;
  } else if (value < 19) {
    state = 1;
  } else {
    state = 2;
  }

  $("#weapons")
    .text(messages[state])
    .removeClass(classes)
    .addClass(classes[state]);
}

function setLevel(newLevel) {
  // Update state
  level = newLevel;

  // Toggle buttons
  var buttons = $("#console button");
  buttons.each(function(idx) {
    $(this).toggleClass("active", idx == level - 1);
  });

  // Update favicon
  $("link[rel=icon]").attr("href", "/static/img/defcon-" + level + ".png");
}

function updateLevel() {
  $.getJSON("/level/").then(function(result) {
    setLevel(result["level"]);
  });

  setTimeout(updateLevel, 1000);
}

$(function() {
  $("#console button").on("click", function(e) {
    e.preventDefault();

    var levelRequested = $(this).attr("id");

    $.post("/level/" + levelRequested + "/")
      .fail(function(err) {
        if (err.status == 403) {
          showModal(levelRequested);
        }
      })
      .then(function(result) {
        setLevel(result["level"]);
      });
  });

  // Update time
  setInterval(updateTime, 1000);
  updateTime();

  // Update weapons
  setInterval(updateWeapons, 10000);

  // Update level
  updateLevel();

  // Load tweets and start updates
  $.getJSON("/static/data/trump.json").then(function(result) {
    tweets = result;
    for (var i = 0; i < 10; i++) {
      addTweet();
    }
    setInterval(addTweet, 15000);
  });

  // Start chemtrails video
  setInterval(updateChemtrails, 60000);
  updateChemtrails();

  // Attach modal form
  $("#modal form").on("submit", modalSubmission);
});
