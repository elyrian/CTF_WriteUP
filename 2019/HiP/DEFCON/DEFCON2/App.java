import java.io.PrintStream;

public class App
{
  public App() {}
  
  public static byte[] base64_0(byte[] paramArrayOfByte) {
    String str = "B_p072neYwLU-MW94xZHahRsEO5VJPrgiFyu1Dk3ltIdvcCGmKSjb8Nqo6zQTfXA";
    byte[] arrayOfByte1 = new byte[paramArrayOfByte.length + 3 - paramArrayOfByte.length % 3];
    
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      arrayOfByte1[i] = paramArrayOfByte[i];
    }
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length * 4 / 3];
    for (int j = 0; j < arrayOfByte1.length; j += 3) {
      arrayOfByte2[(j * 4 / 3)] = ((byte)str.charAt((arrayOfByte1[j] & 0xFF) >> 2));
      arrayOfByte2[(1 + j * 4 / 3)] = ((byte)str.charAt((arrayOfByte1[j] & 0xFF & 0x3) << 4 | (arrayOfByte1[(j + 1)] & 0xFF) >> 4));
      arrayOfByte2[(2 + j * 4 / 3)] = ((byte)str.charAt((arrayOfByte1[(j + 1)] & 0xFF & 0xF) << 2 | (arrayOfByte1[(j + 2)] & 0xFF) >> 6));
      arrayOfByte2[(3 + j * 4 / 3)] = ((byte)str.charAt(arrayOfByte1[(j + 2)] & 0xFF & 0x3F));
    }
    
    return arrayOfByte2;
  }
  

  public static byte[] password_enchiffragement_1(byte[] paramArrayOfByte)
  {
    int i = 0;
    int j = 97;
    for (;;) {
      try {
        j = paramArrayOfByte[i];
      } catch (Exception localException) {
        break;
      }
      i++;
    }
    if (i * i * 40000L + i * 78L != 92163744L) {
      System.out.println("result=false");
      System.exit(0);
    }
    
    byte[] arrayOfByte = new byte[48];
    
    arrayOfByte[0] = ((byte)(paramArrayOfByte[18] ^ 0xEC));
    arrayOfByte[1] = ((byte)(paramArrayOfByte[40] ^ 0xA2));
    arrayOfByte[2] = ((byte)(paramArrayOfByte[5] ^ 0x15));
    arrayOfByte[3] = ((byte)(paramArrayOfByte[29] ^ 0x2));
    arrayOfByte[4] = ((byte)(paramArrayOfByte[16] ^ 0xE4));
    arrayOfByte[5] = ((byte)(paramArrayOfByte[41] ^ 0x9D));
    arrayOfByte[6] = ((byte)(paramArrayOfByte[33] ^ 0x86));
    arrayOfByte[7] = ((byte)(paramArrayOfByte[6] ^ 0x53));
    arrayOfByte[8] = ((byte)(paramArrayOfByte[43] ^ 0x27));
    arrayOfByte[9] = ((byte)(paramArrayOfByte[44] ^ 0x3B));
    arrayOfByte[10] = ((byte)(paramArrayOfByte[0] ^ 0x24));
    arrayOfByte[11] = ((byte)(paramArrayOfByte[9] ^ 0x46));
    arrayOfByte[12] = ((byte)(paramArrayOfByte[11] ^ 0xB6));
    arrayOfByte[13] = ((byte)(paramArrayOfByte[20] ^ 0x12));
    arrayOfByte[14] = ((byte)(paramArrayOfByte[47] ^ 0xBC));
    arrayOfByte[15] = ((byte)(paramArrayOfByte[30] ^ 0xC3));
    arrayOfByte[16] = ((byte)(paramArrayOfByte[4] ^ 0x5B));
    arrayOfByte[17] = ((byte)(paramArrayOfByte[24] ^ 0x2B));
    arrayOfByte[18] = ((byte)(paramArrayOfByte[10] ^ 0x99));
    arrayOfByte[19] = ((byte)(paramArrayOfByte[38] ^ 0x1C));
    arrayOfByte[20] = ((byte)(paramArrayOfByte[14] ^ 0x5F));
    arrayOfByte[21] = ((byte)(paramArrayOfByte[25] ^ 0x47));
    arrayOfByte[22] = ((byte)(paramArrayOfByte[22] ^ 0xF7));
    arrayOfByte[23] = ((byte)(paramArrayOfByte[2] ^ 0xAD));
    arrayOfByte[24] = ((byte)(paramArrayOfByte[21] ^ 0x2C));
    arrayOfByte[25] = ((byte)(paramArrayOfByte[39] ^ 0x33));
    arrayOfByte[26] = ((byte)(paramArrayOfByte[42] ^ 0xDF));
    arrayOfByte[27] = ((byte)(paramArrayOfByte[1] ^ 0x39));
    arrayOfByte[28] = ((byte)(paramArrayOfByte[45] ^ 0xA5));
    arrayOfByte[29] = ((byte)(paramArrayOfByte[35] ^ 0x49));
    arrayOfByte[30] = ((byte)(paramArrayOfByte[19] ^ 0x9F));
    arrayOfByte[31] = ((byte)(paramArrayOfByte[7] ^ 0x7F));
    arrayOfByte[32] = ((byte)(paramArrayOfByte[26] ^ 0xAE));
    arrayOfByte[33] = ((byte)(paramArrayOfByte[27] ^ 0x84));
    arrayOfByte[34] = ((byte)(paramArrayOfByte[12] ^ 0xB8));
    arrayOfByte[35] = ((byte)(paramArrayOfByte[32] ^ 0xB9));
    arrayOfByte[36] = ((byte)(paramArrayOfByte[15] ^ 0x98));
    arrayOfByte[37] = ((byte)(paramArrayOfByte[23] ^ 0x22));
    arrayOfByte[38] = ((byte)(paramArrayOfByte[46] ^ 0x63));
    arrayOfByte[39] = ((byte)(paramArrayOfByte[13] ^ 0xB7));
    arrayOfByte[40] = ((byte)(paramArrayOfByte[3] ^ 0x8B));
    arrayOfByte[41] = ((byte)(paramArrayOfByte[17] ^ 0xB2));
    arrayOfByte[42] = ((byte)(paramArrayOfByte[34] ^ 0xBE));
    arrayOfByte[43] = ((byte)(paramArrayOfByte[31] ^ 0xFA));
    arrayOfByte[44] = ((byte)(paramArrayOfByte[36] ^ 0xE7));
    arrayOfByte[45] = ((byte)(paramArrayOfByte[8] ^ 0x1F));
    arrayOfByte[46] = ((byte)(paramArrayOfByte[28] ^ 0xF4));
    arrayOfByte[47] = ((byte)(paramArrayOfByte[37] ^ 0x14));
    return arrayOfByte;
  }
  
  public static byte[] base64_2(byte[] paramArrayOfByte)
  {
    String str = "QwL9EJuySpO2GUXq4AnK6xRdtjslI_M-vVFHehCcf85gNk3mz0rPBTYib1WZoaD7";
    byte[] arrayOfByte1 = new byte[paramArrayOfByte.length + 3 - paramArrayOfByte.length % 3];
    
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      arrayOfByte1[i] = paramArrayOfByte[i];
    }
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length * 4 / 3];
    for (int j = 0; j < arrayOfByte1.length; j += 3) {
      arrayOfByte2[(j * 4 / 3)] = ((byte)str.charAt((arrayOfByte1[j] & 0xFF) >> 2));
      arrayOfByte2[(1 + j * 4 / 3)] = ((byte)str.charAt((arrayOfByte1[j] & 0xFF & 0x3) << 4 | (arrayOfByte1[(j + 1)] & 0xFF) >> 4));
      arrayOfByte2[(2 + j * 4 / 3)] = ((byte)str.charAt((arrayOfByte1[(j + 1)] & 0xFF & 0xF) << 2 | (arrayOfByte1[(j + 2)] & 0xFF) >> 6));
      arrayOfByte2[(3 + j * 4 / 3)] = ((byte)str.charAt(arrayOfByte1[(j + 2)] & 0xFF & 0x3F));
    }
    
    return arrayOfByte2;
  }
  

  public static byte[] password_enchiffragement_3(byte[] paramArrayOfByte)
  {
    int i = 0;
    int j = 97;
    for (;;) {
      try {
        j = paramArrayOfByte[i];
      } catch (Exception localException) {
        break;
      }
      i++;
    }
    if (i * i * 40000L + i * 78L != 184965304L) {
      System.out.println("result=false");
      System.exit(0);
    }
    
    byte[] arrayOfByte = new byte[68];
    
    arrayOfByte[0] = ((byte)(paramArrayOfByte[19] ^ 0x65));
    arrayOfByte[1] = ((byte)(paramArrayOfByte[37] ^ 0xBF));
    arrayOfByte[2] = ((byte)(paramArrayOfByte[58] ^ 0x61));
    arrayOfByte[3] = ((byte)(paramArrayOfByte[44] ^ 0xE2));
    arrayOfByte[4] = ((byte)(paramArrayOfByte[66] ^ 0xFA));
    arrayOfByte[5] = ((byte)(paramArrayOfByte[64] ^ 0x81));
    arrayOfByte[6] = ((byte)(paramArrayOfByte[3] ^ 0x42));
    arrayOfByte[7] = ((byte)(paramArrayOfByte[18] ^ 0xE3));
    arrayOfByte[8] = ((byte)(paramArrayOfByte[14] ^ 0xCA));
    arrayOfByte[9] = ((byte)(paramArrayOfByte[33] ^ 0x2A));
    arrayOfByte[10] = ((byte)(paramArrayOfByte[0] ^ 0x2E));
    arrayOfByte[11] = ((byte)(paramArrayOfByte[60] ^ 0x72));
    arrayOfByte[12] = ((byte)(paramArrayOfByte[9] ^ 0xAB));
    arrayOfByte[13] = ((byte)(paramArrayOfByte[16] ^ 0x70));
    arrayOfByte[14] = ((byte)(paramArrayOfByte[52] ^ 0xB));
    arrayOfByte[15] = ((byte)(paramArrayOfByte[41] ^ 0x38));
    arrayOfByte[16] = ((byte)(paramArrayOfByte[22] ^ 0x30));
    arrayOfByte[17] = ((byte)(paramArrayOfByte[56] ^ 0xD6));
    arrayOfByte[18] = ((byte)(paramArrayOfByte[63] ^ 0xE3));
    arrayOfByte[19] = ((byte)(paramArrayOfByte[62] ^ 0x30));
    arrayOfByte[20] = ((byte)(paramArrayOfByte[49] ^ 0x2D));
    arrayOfByte[21] = ((byte)(paramArrayOfByte[17] ^ 0x97));
    arrayOfByte[22] = ((byte)(paramArrayOfByte[25] ^ 0xF1));
    arrayOfByte[23] = ((byte)(paramArrayOfByte[8] ^ 0xD8));
    arrayOfByte[24] = ((byte)(paramArrayOfByte[43] ^ 0x95));
    arrayOfByte[25] = ((byte)(paramArrayOfByte[4] ^ 0x53));
    arrayOfByte[26] = ((byte)(paramArrayOfByte[27] ^ 0x80));
    arrayOfByte[27] = ((byte)(paramArrayOfByte[6] ^ 0xFE));
    arrayOfByte[28] = ((byte)(paramArrayOfByte[28] ^ 0xAD));
    arrayOfByte[29] = ((byte)(paramArrayOfByte[46] ^ 0xA));
    arrayOfByte[30] = ((byte)(paramArrayOfByte[61] ^ 0xCA));
    arrayOfByte[31] = ((byte)(paramArrayOfByte[34] ^ 0x2F));
    arrayOfByte[32] = ((byte)(paramArrayOfByte[20] ^ 0xB3));
    arrayOfByte[33] = ((byte)(paramArrayOfByte[5] ^ 0xAF));
    arrayOfByte[34] = ((byte)(paramArrayOfByte[39] ^ 0xC4));
    arrayOfByte[35] = ((byte)(paramArrayOfByte[12] ^ 0x6C));
    arrayOfByte[36] = ((byte)(paramArrayOfByte[55] ^ 0x4B));
    arrayOfByte[37] = ((byte)(paramArrayOfByte[11] ^ 0x81));
    arrayOfByte[38] = ((byte)(paramArrayOfByte[65] ^ 0xD2));
    arrayOfByte[39] = ((byte)(paramArrayOfByte[23] ^ 0x84));
    arrayOfByte[40] = ((byte)(paramArrayOfByte[13] ^ 0xD4));
    arrayOfByte[41] = ((byte)(paramArrayOfByte[7] ^ 0x6C));
    arrayOfByte[42] = ((byte)(paramArrayOfByte[59] ^ 0xC0));
    arrayOfByte[43] = ((byte)(paramArrayOfByte[53] ^ 0xA5));
    arrayOfByte[44] = ((byte)(paramArrayOfByte[35] ^ 0x97));
    arrayOfByte[45] = ((byte)(paramArrayOfByte[42] ^ 0x72));
    arrayOfByte[46] = ((byte)(paramArrayOfByte[2] ^ 0xC7));
    arrayOfByte[47] = ((byte)(paramArrayOfByte[24] ^ 0xD4));
    arrayOfByte[48] = ((byte)(paramArrayOfByte[51] ^ 0x60));
    arrayOfByte[49] = ((byte)(paramArrayOfByte[67] ^ 0x3B));
    arrayOfByte[50] = ((byte)(paramArrayOfByte[31] ^ 0x19));
    arrayOfByte[51] = ((byte)(paramArrayOfByte[21] ^ 0xF8));
    arrayOfByte[52] = ((byte)(paramArrayOfByte[45] ^ 0x25));
    arrayOfByte[53] = ((byte)(paramArrayOfByte[54] ^ 0xDE));
    arrayOfByte[54] = ((byte)(paramArrayOfByte[47] ^ 0x41));
    arrayOfByte[55] = ((byte)(paramArrayOfByte[1] ^ 0x96));
    arrayOfByte[56] = ((byte)(paramArrayOfByte[40] ^ 0x1B));
    arrayOfByte[57] = ((byte)(paramArrayOfByte[36] ^ 0x7E));
    arrayOfByte[58] = ((byte)(paramArrayOfByte[29] ^ 0xA8));
    arrayOfByte[59] = ((byte)(paramArrayOfByte[10] ^ 0x21));
    arrayOfByte[60] = ((byte)(paramArrayOfByte[50] ^ 0xE2));
    arrayOfByte[61] = ((byte)(paramArrayOfByte[30] ^ 0x38));
    arrayOfByte[62] = ((byte)(paramArrayOfByte[48] ^ 0x28));
    arrayOfByte[63] = ((byte)(paramArrayOfByte[57] ^ 0x0));
    arrayOfByte[64] = ((byte)(paramArrayOfByte[15] ^ 0xFC));
    arrayOfByte[65] = ((byte)(paramArrayOfByte[32] ^ 0xD9));
    arrayOfByte[66] = ((byte)(paramArrayOfByte[26] ^ 0xDC));
    arrayOfByte[67] = ((byte)(paramArrayOfByte[38] ^ 0xF3));
    return arrayOfByte;
  }
  
  public static byte[] base64_4(byte[] paramArrayOfByte)
  {
    String str = "Bq_kT8haNFewAgfIxJycd37oOYXiSRvlP2tU1WmE5MCKnVr-psGjL60uZ4zDQHb9";
    byte[] arrayOfByte1 = new byte[paramArrayOfByte.length + 3 - paramArrayOfByte.length % 3];
    
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      arrayOfByte1[i] = paramArrayOfByte[i];
    }
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length * 4 / 3];
    for (int j = 0; j < arrayOfByte1.length; j += 3) {
      arrayOfByte2[(j * 4 / 3)] = ((byte)str.charAt((arrayOfByte1[j] & 0xFF) >> 2));
      arrayOfByte2[(1 + j * 4 / 3)] = ((byte)str.charAt((arrayOfByte1[j] & 0xFF & 0x3) << 4 | (arrayOfByte1[(j + 1)] & 0xFF) >> 4));
      arrayOfByte2[(2 + j * 4 / 3)] = ((byte)str.charAt((arrayOfByte1[(j + 1)] & 0xFF & 0xF) << 2 | (arrayOfByte1[(j + 2)] & 0xFF) >> 6));
      arrayOfByte2[(3 + j * 4 / 3)] = ((byte)str.charAt(arrayOfByte1[(j + 2)] & 0xFF & 0x3F));
    }
    
    return arrayOfByte2;
  }
  

  public static byte[] password_enchiffragement_5(byte[] paramArrayOfByte)
  {
    int i = 0;
    int j = 97;
    for (;;) {
      try {
        j = paramArrayOfByte[i];
      } catch (Exception localException) {
        break;
      }
      i++;
    }
    if (i * i * 40000L + i * 78L != 338567176L) {
      System.out.println("result=false");
      System.exit(0);
    }
    
    byte[] arrayOfByte = new byte[92];
    
    arrayOfByte[0] = ((byte)(paramArrayOfByte[7] ^ 0x19));
    arrayOfByte[1] = ((byte)(paramArrayOfByte[8] ^ 0x76));
    arrayOfByte[2] = ((byte)(paramArrayOfByte[64] ^ 0x7C));
    arrayOfByte[3] = ((byte)(paramArrayOfByte[44] ^ 0x5F));
    arrayOfByte[4] = ((byte)(paramArrayOfByte[85] ^ 0x7));
    arrayOfByte[5] = ((byte)(paramArrayOfByte[37] ^ 0x58));
    arrayOfByte[6] = ((byte)(paramArrayOfByte[79] ^ 0x97));
    arrayOfByte[7] = ((byte)(paramArrayOfByte[77] ^ 0xD3));
    arrayOfByte[8] = ((byte)(paramArrayOfByte[21] ^ 0xBE));
    arrayOfByte[9] = ((byte)(paramArrayOfByte[87] ^ 0x88));
    arrayOfByte[10] = ((byte)(paramArrayOfByte[61] ^ 0x27));
    arrayOfByte[11] = ((byte)(paramArrayOfByte[59] ^ 0x1F));
    arrayOfByte[12] = ((byte)(paramArrayOfByte[18] ^ 0x1));
    arrayOfByte[13] = ((byte)(paramArrayOfByte[16] ^ 0xD1));
    arrayOfByte[14] = ((byte)(paramArrayOfByte[51] ^ 0x85));
    arrayOfByte[15] = ((byte)(paramArrayOfByte[36] ^ 0xAC));
    arrayOfByte[16] = ((byte)(paramArrayOfByte[80] ^ 0x84));
    arrayOfByte[17] = ((byte)(paramArrayOfByte[17] ^ 0x98));
    arrayOfByte[18] = ((byte)(paramArrayOfByte[40] ^ 0xB7));
    arrayOfByte[19] = ((byte)(paramArrayOfByte[91] ^ 0xBF));
    arrayOfByte[20] = ((byte)(paramArrayOfByte[88] ^ 0x9E));
    arrayOfByte[21] = ((byte)(paramArrayOfByte[71] ^ 0xE7));
    arrayOfByte[22] = ((byte)(paramArrayOfByte[27] ^ 0xE5));
    arrayOfByte[23] = ((byte)(paramArrayOfByte[24] ^ 0x85));
    arrayOfByte[24] = ((byte)(paramArrayOfByte[58] ^ 0x67));
    arrayOfByte[25] = ((byte)(paramArrayOfByte[11] ^ 0xE9));
    arrayOfByte[26] = ((byte)(paramArrayOfByte[22] ^ 0x47));
    arrayOfByte[27] = ((byte)(paramArrayOfByte[19] ^ 0xFA));
    arrayOfByte[28] = ((byte)(paramArrayOfByte[66] ^ 0x95));
    arrayOfByte[29] = ((byte)(paramArrayOfByte[82] ^ 0x90));
    arrayOfByte[30] = ((byte)(paramArrayOfByte[62] ^ 0xDC));
    arrayOfByte[31] = ((byte)(paramArrayOfByte[13] ^ 0xF6));
    arrayOfByte[32] = ((byte)(paramArrayOfByte[69] ^ 0x58));
    arrayOfByte[33] = ((byte)(paramArrayOfByte[70] ^ 0x4F));
    arrayOfByte[34] = ((byte)(paramArrayOfByte[26] ^ 0xBD));
    arrayOfByte[35] = ((byte)(paramArrayOfByte[81] ^ 0xB9));
    arrayOfByte[36] = ((byte)(paramArrayOfByte[42] ^ 0x23));
    arrayOfByte[37] = ((byte)(paramArrayOfByte[46] ^ 0x10));
    arrayOfByte[38] = ((byte)(paramArrayOfByte[41] ^ 0xAD));
    arrayOfByte[39] = ((byte)(paramArrayOfByte[47] ^ 0x2C));
    arrayOfByte[40] = ((byte)(paramArrayOfByte[83] ^ 0xAF));
    arrayOfByte[41] = ((byte)(paramArrayOfByte[60] ^ 0x5A));
    arrayOfByte[42] = ((byte)(paramArrayOfByte[57] ^ 0xAF));
    arrayOfByte[43] = ((byte)(paramArrayOfByte[76] ^ 0x70));
    arrayOfByte[44] = ((byte)(paramArrayOfByte[43] ^ 0x12));
    arrayOfByte[45] = ((byte)(paramArrayOfByte[32] ^ 0x38));
    arrayOfByte[46] = ((byte)(paramArrayOfByte[23] ^ 0xE2));
    arrayOfByte[47] = ((byte)(paramArrayOfByte[12] ^ 0x4F));
    arrayOfByte[48] = ((byte)(paramArrayOfByte[31] ^ 0x42));
    arrayOfByte[49] = ((byte)(paramArrayOfByte[25] ^ 0x8E));
    arrayOfByte[50] = ((byte)(paramArrayOfByte[74] ^ 0x8C));
    arrayOfByte[51] = ((byte)(paramArrayOfByte[67] ^ 0xC5));
    arrayOfByte[52] = ((byte)(paramArrayOfByte[78] ^ 0xB9));
    arrayOfByte[53] = ((byte)(paramArrayOfByte[30] ^ 0xD7));
    arrayOfByte[54] = ((byte)(paramArrayOfByte[75] ^ 0x6));
    arrayOfByte[55] = ((byte)(paramArrayOfByte[55] ^ 0x39));
    arrayOfByte[56] = ((byte)(paramArrayOfByte[2] ^ 0x31));
    arrayOfByte[57] = ((byte)(paramArrayOfByte[49] ^ 0x1A));
    arrayOfByte[58] = ((byte)(paramArrayOfByte[90] ^ 0x7E));
    arrayOfByte[59] = ((byte)(paramArrayOfByte[34] ^ 0xFA));
    arrayOfByte[60] = ((byte)(paramArrayOfByte[6] ^ 0x16));
    arrayOfByte[61] = ((byte)(paramArrayOfByte[10] ^ 0x4));
    arrayOfByte[62] = ((byte)(paramArrayOfByte[84] ^ 0x27));
    arrayOfByte[63] = ((byte)(paramArrayOfByte[45] ^ 0xFD));
    arrayOfByte[64] = ((byte)(paramArrayOfByte[48] ^ 0xF3));
    arrayOfByte[65] = ((byte)(paramArrayOfByte[9] ^ 0x3F));
    arrayOfByte[66] = ((byte)(paramArrayOfByte[86] ^ 0x6E));
    arrayOfByte[67] = ((byte)(paramArrayOfByte[38] ^ 0xB8));
    arrayOfByte[68] = ((byte)(paramArrayOfByte[3] ^ 0x55));
    arrayOfByte[69] = ((byte)(paramArrayOfByte[39] ^ 0xF0));
    arrayOfByte[70] = ((byte)(paramArrayOfByte[89] ^ 0x25));
    arrayOfByte[71] = ((byte)(paramArrayOfByte[73] ^ 0xD9));
    arrayOfByte[72] = ((byte)(paramArrayOfByte[68] ^ 0x2B));
    arrayOfByte[73] = ((byte)(paramArrayOfByte[63] ^ 0x74));
    arrayOfByte[74] = ((byte)(paramArrayOfByte[5] ^ 0xD9));
    arrayOfByte[75] = ((byte)(paramArrayOfByte[52] ^ 0xBB));
    arrayOfByte[76] = ((byte)(paramArrayOfByte[54] ^ 0xDA));
    arrayOfByte[77] = ((byte)(paramArrayOfByte[35] ^ 0x1));
    arrayOfByte[78] = ((byte)(paramArrayOfByte[56] ^ 0x52));
    arrayOfByte[79] = ((byte)(paramArrayOfByte[0] ^ 0xD9));
    arrayOfByte[80] = ((byte)(paramArrayOfByte[72] ^ 0xC4));
    arrayOfByte[81] = ((byte)(paramArrayOfByte[15] ^ 0x8C));
    arrayOfByte[82] = ((byte)(paramArrayOfByte[1] ^ 0xA0));
    arrayOfByte[83] = ((byte)(paramArrayOfByte[33] ^ 0xB2));
    arrayOfByte[84] = ((byte)(paramArrayOfByte[29] ^ 0xED));
    arrayOfByte[85] = ((byte)(paramArrayOfByte[28] ^ 0xB6));
    arrayOfByte[86] = ((byte)(paramArrayOfByte[14] ^ 0xD6));
    arrayOfByte[87] = ((byte)(paramArrayOfByte[53] ^ 0x6E));
    arrayOfByte[88] = ((byte)(paramArrayOfByte[20] ^ 0xAF));
    arrayOfByte[89] = ((byte)(paramArrayOfByte[4] ^ 0xD5));
    arrayOfByte[90] = ((byte)(paramArrayOfByte[50] ^ 0x45));
    arrayOfByte[91] = ((byte)(paramArrayOfByte[65] ^ 0xE3));
    return arrayOfByte;
  }
  
  public static byte[] base64_6(byte[] paramArrayOfByte)
  {
    // len(str)==64
    String str = "V-GCxZTakQFBs1oRUEtySWOiYJ0rwghfmpqub7394dejc58_AzIlDH6MNvLX2PnK";
    // len(arrayOfByte1) == 93
    byte[] arrayOfByte1 = new byte[paramArrayOfByte.length + 3 - paramArrayOfByte.length % 3];
    // Recopier chaque byte de l'input dans arrayOfByte1
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      arrayOfByte1[i] = paramArrayOfByte[i];
    }
    // len(arrayOfByte3) == 124
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length * 4 / 3];
    // Tour 0
    // arrayOfByte2[0] = str.charAt(input_str[0]>>2)
    // arrayOfByte2[1] = str.charAt(input_str[0]&0x3 << 4)
    // arrayOfByte2[2] = str.charAt(input_str[1]&0xf << 2)
    // arrayOfByte2[3] = str.charAt(input_str[2]&0x3f)
    for (int j = 0; j < arrayOfByte1.length; j += 3) {
      arrayOfByte2[(j * 4 / 3)] = ((byte)str.charAt((arrayOfByte1[j] & 0xFF) >> 2));
      arrayOfByte2[(1 + j * 4 / 3)] = ((byte)str.charAt((arrayOfByte1[j] & 0xFF & 0x3) << 4 | (arrayOfByte1[(j + 1)] & 0xFF) >> 4));
      arrayOfByte2[(2 + j * 4 / 3)] = ((byte)str.charAt((arrayOfByte1[(j + 1)] & 0xFF & 0xF) << 2 | (arrayOfByte1[(j + 2)] & 0xFF) >> 6));
      arrayOfByte2[(3 + j * 4 / 3)] = ((byte)str.charAt(arrayOfByte1[(j + 2)] & 0xFF & 0x3F));
    }
    
    return arrayOfByte2;
  }
  

  public static byte[] password_enchiffragement_7(byte[] paramArrayOfByte)
  {
    int i = 0;
    int j = 97;
    for (;;) {
      try {
        j = paramArrayOfByte[i];
      } catch (Exception localException) {
        break;
      }
      i++;
    }
    if (i * i * 40000L + i * 78L != 615049672L) {
      System.out.println("result=false");
      System.exit(0);
    }
    
    byte[] arrayOfByte = new byte[124];
    
    arrayOfByte[0] = ((byte)(paramArrayOfByte[94] ^ 0xE3));
    arrayOfByte[1] = ((byte)(paramArrayOfByte[38] ^ 0xFD));
    arrayOfByte[2] = ((byte)(paramArrayOfByte[86] ^ 0x53));
    arrayOfByte[3] = ((byte)(paramArrayOfByte[93] ^ 0x94));
    arrayOfByte[4] = ((byte)(paramArrayOfByte[24] ^ 0xE5));
    arrayOfByte[5] = ((byte)(paramArrayOfByte[102] ^ 0x3F));
    arrayOfByte[6] = ((byte)(paramArrayOfByte[118] ^ 0x6A));
    arrayOfByte[7] = ((byte)(paramArrayOfByte[77] ^ 0x61));
    arrayOfByte[8] = ((byte)(paramArrayOfByte[10] ^ 0x58));
    arrayOfByte[9] = ((byte)(paramArrayOfByte[16] ^ 0xF8));
    arrayOfByte[10] = ((byte)(paramArrayOfByte[76] ^ 0x34));
    arrayOfByte[11] = ((byte)(paramArrayOfByte[90] ^ 0x7));
    arrayOfByte[12] = ((byte)(paramArrayOfByte[30] ^ 0x34));
    arrayOfByte[13] = ((byte)(paramArrayOfByte[3] ^ 0x6));
    arrayOfByte[14] = ((byte)(paramArrayOfByte[88] ^ 0x9E));
    arrayOfByte[15] = ((byte)(paramArrayOfByte[1] ^ 0xF8));
    arrayOfByte[16] = ((byte)(paramArrayOfByte[81] ^ 0x3B));
    arrayOfByte[17] = ((byte)(paramArrayOfByte[45] ^ 0xAC));
    arrayOfByte[18] = ((byte)(paramArrayOfByte[80] ^ 0xF9));
    arrayOfByte[19] = ((byte)(paramArrayOfByte[36] ^ 0x33));
    arrayOfByte[20] = ((byte)(paramArrayOfByte[31] ^ 0x5C));
    arrayOfByte[21] = ((byte)(paramArrayOfByte[59] ^ 0xCB));
    arrayOfByte[22] = ((byte)(paramArrayOfByte[18] ^ 0xC0));
    arrayOfByte[23] = ((byte)(paramArrayOfByte[61] ^ 0x25));
    arrayOfByte[24] = ((byte)(paramArrayOfByte[17] ^ 0xF8));
    arrayOfByte[25] = ((byte)(paramArrayOfByte[52] ^ 0xBD));
    arrayOfByte[26] = ((byte)(paramArrayOfByte[25] ^ 0x5A));
    arrayOfByte[27] = ((byte)(paramArrayOfByte[112] ^ 0x8C));
    arrayOfByte[28] = ((byte)(paramArrayOfByte[8] ^ 0xFA));
    arrayOfByte[29] = ((byte)(paramArrayOfByte[43] ^ 0x73));
    arrayOfByte[30] = ((byte)(paramArrayOfByte[35] ^ 0x4C));
    arrayOfByte[31] = ((byte)(paramArrayOfByte[11] ^ 0x10));
    arrayOfByte[32] = ((byte)(paramArrayOfByte[22] ^ 0x20));
    arrayOfByte[33] = ((byte)(paramArrayOfByte[64] ^ 0xAA));
    arrayOfByte[34] = ((byte)(paramArrayOfByte[87] ^ 0x34));
    arrayOfByte[35] = ((byte)(paramArrayOfByte[111] ^ 0xEB));
    arrayOfByte[36] = ((byte)(paramArrayOfByte[95] ^ 0xA3));
    arrayOfByte[37] = ((byte)(paramArrayOfByte[15] ^ 0xC7));
    arrayOfByte[38] = ((byte)(paramArrayOfByte[107] ^ 0x80));
    arrayOfByte[39] = ((byte)(paramArrayOfByte[121] ^ 0x7C));
    arrayOfByte[40] = ((byte)(paramArrayOfByte[13] ^ 0xAC));
    arrayOfByte[41] = ((byte)(paramArrayOfByte[108] ^ 0xE8));
    arrayOfByte[42] = ((byte)(paramArrayOfByte[119] ^ 0x81));
    arrayOfByte[43] = ((byte)(paramArrayOfByte[68] ^ 0xA2));
    arrayOfByte[44] = ((byte)(paramArrayOfByte[9] ^ 0xD6));
    arrayOfByte[45] = ((byte)(paramArrayOfByte[85] ^ 0x83));
    arrayOfByte[46] = ((byte)(paramArrayOfByte[51] ^ 0x3F));
    arrayOfByte[47] = ((byte)(paramArrayOfByte[20] ^ 0xF9));
    arrayOfByte[48] = ((byte)(paramArrayOfByte[123] ^ 0x2));
    arrayOfByte[49] = ((byte)(paramArrayOfByte[109] ^ 0x97));
    arrayOfByte[50] = ((byte)(paramArrayOfByte[69] ^ 0xD8));
    arrayOfByte[51] = ((byte)(paramArrayOfByte[7] ^ 0x3F));
    arrayOfByte[52] = ((byte)(paramArrayOfByte[19] ^ 0x9B));
    arrayOfByte[53] = ((byte)(paramArrayOfByte[27] ^ 0x44));
    arrayOfByte[54] = ((byte)(paramArrayOfByte[98] ^ 0xF1));
    arrayOfByte[55] = ((byte)(paramArrayOfByte[67] ^ 0x4E));
    arrayOfByte[56] = ((byte)(paramArrayOfByte[92] ^ 0x7D));
    arrayOfByte[57] = ((byte)(paramArrayOfByte[72] ^ 0x6C));
    arrayOfByte[58] = ((byte)(paramArrayOfByte[74] ^ 0x36));
    arrayOfByte[59] = ((byte)(paramArrayOfByte[57] ^ 0x6D));
    arrayOfByte[60] = ((byte)(paramArrayOfByte[34] ^ 0x5E));
    arrayOfByte[61] = ((byte)(paramArrayOfByte[6] ^ 0xFF));
    arrayOfByte[62] = ((byte)(paramArrayOfByte[58] ^ 0x55));
    arrayOfByte[63] = ((byte)(paramArrayOfByte[97] ^ 0xCF));
    arrayOfByte[64] = ((byte)(paramArrayOfByte[14] ^ 0xFB));
    arrayOfByte[65] = ((byte)(paramArrayOfByte[89] ^ 0x89));
    arrayOfByte[66] = ((byte)(paramArrayOfByte[83] ^ 0xBF));
    arrayOfByte[67] = ((byte)(paramArrayOfByte[65] ^ 0x82));
    arrayOfByte[68] = ((byte)(paramArrayOfByte[122] ^ 0x1F));
    arrayOfByte[69] = ((byte)(paramArrayOfByte[41] ^ 0x46));
    arrayOfByte[70] = ((byte)(paramArrayOfByte[115] ^ 0x38));
    arrayOfByte[71] = ((byte)(paramArrayOfByte[96] ^ 0xF4));
    arrayOfByte[72] = ((byte)(paramArrayOfByte[105] ^ 0xE5));
    arrayOfByte[73] = ((byte)(paramArrayOfByte[110] ^ 0x4C));
    arrayOfByte[74] = ((byte)(paramArrayOfByte[4] ^ 0xF6));
    arrayOfByte[75] = ((byte)(paramArrayOfByte[116] ^ 0xC));
    arrayOfByte[76] = ((byte)(paramArrayOfByte[49] ^ 0x6));
    arrayOfByte[77] = ((byte)(paramArrayOfByte[70] ^ 0xA3));
    arrayOfByte[78] = ((byte)(paramArrayOfByte[114] ^ 0xCC));
    arrayOfByte[79] = ((byte)(paramArrayOfByte[63] ^ 0xB5));
    arrayOfByte[80] = ((byte)(paramArrayOfByte[53] ^ 0xBA));
    arrayOfByte[81] = ((byte)(paramArrayOfByte[2] ^ 0xC7));
    arrayOfByte[82] = ((byte)(paramArrayOfByte[66] ^ 0x86));
    arrayOfByte[83] = ((byte)(paramArrayOfByte[82] ^ 0x20));
    arrayOfByte[84] = ((byte)(paramArrayOfByte[40] ^ 0x49));
    arrayOfByte[85] = ((byte)(paramArrayOfByte[37] ^ 0x9F));
    arrayOfByte[86] = ((byte)(paramArrayOfByte[99] ^ 0xEB));
    arrayOfByte[87] = ((byte)(paramArrayOfByte[106] ^ 0xD9));
    arrayOfByte[88] = ((byte)(paramArrayOfByte[0] ^ 0xD6));
    arrayOfByte[89] = ((byte)(paramArrayOfByte[12] ^ 0xBA));
    arrayOfByte[90] = ((byte)(paramArrayOfByte[33] ^ 0x3D));
    arrayOfByte[91] = ((byte)(paramArrayOfByte[5] ^ 0xF8));
    arrayOfByte[92] = ((byte)(paramArrayOfByte[117] ^ 0x15));
    arrayOfByte[93] = ((byte)(paramArrayOfByte[28] ^ 0xC0));
    arrayOfByte[94] = ((byte)(paramArrayOfByte[84] ^ 0xD3));
    arrayOfByte[95] = ((byte)(paramArrayOfByte[39] ^ 0x94));
    arrayOfByte[96] = ((byte)(paramArrayOfByte[103] ^ 0xB6));
    arrayOfByte[97] = ((byte)(paramArrayOfByte[120] ^ 0xAE));
    arrayOfByte[98] = ((byte)(paramArrayOfByte[75] ^ 0xE9));
    arrayOfByte[99] = ((byte)(paramArrayOfByte[55] ^ 0x8F));
    arrayOfByte[100] = ((byte)(paramArrayOfByte[47] ^ 0x90));
    arrayOfByte[101] = ((byte)(paramArrayOfByte[73] ^ 0x70));
    arrayOfByte[102] = ((byte)(paramArrayOfByte[26] ^ 0x29));
    arrayOfByte[103] = ((byte)(paramArrayOfByte[50] ^ 0x1E));
    arrayOfByte[104] = ((byte)(paramArrayOfByte[104] ^ 0xAF));
    arrayOfByte[105] = ((byte)(paramArrayOfByte[48] ^ 0x54));
    arrayOfByte[106] = ((byte)(paramArrayOfByte[78] ^ 0xB5));
    arrayOfByte[107] = ((byte)(paramArrayOfByte[32] ^ 0xD6));
    arrayOfByte[108] = ((byte)(paramArrayOfByte[101] ^ 0xA0));
    arrayOfByte[109] = ((byte)(paramArrayOfByte[60] ^ 0x3));
    arrayOfByte[110] = ((byte)(paramArrayOfByte[42] ^ 0x60));
    arrayOfByte[111] = ((byte)(paramArrayOfByte[23] ^ 0x3A));
    arrayOfByte[112] = ((byte)(paramArrayOfByte[46] ^ 0xB8));
    arrayOfByte[113] = ((byte)(paramArrayOfByte[62] ^ 0xE6));
    arrayOfByte[114] = ((byte)(paramArrayOfByte[29] ^ 0x7F));
    arrayOfByte[115] = ((byte)(paramArrayOfByte[71] ^ 0xC5));
    arrayOfByte[116] = ((byte)(paramArrayOfByte[79] ^ 0xF6));
    arrayOfByte[117] = ((byte)(paramArrayOfByte[21] ^ 0xA1));
    arrayOfByte[118] = ((byte)(paramArrayOfByte[54] ^ 0xAD));
    arrayOfByte[119] = ((byte)(paramArrayOfByte[100] ^ 0x10));
    arrayOfByte[120] = ((byte)(paramArrayOfByte[113] ^ 0xE9));
    arrayOfByte[121] = ((byte)(paramArrayOfByte[44] ^ 0x97));
    arrayOfByte[122] = ((byte)(paramArrayOfByte[56] ^ 0xCD));
    arrayOfByte[123] = ((byte)(paramArrayOfByte[91] ^ 0xBE));
    return arrayOfByte;
  }
  
  public static byte[] password_enchiffragement_8(byte[] paramArrayOfByte)
  {
    int i = 0;
    int j = 97;
    for (;;) {
      try {
        j = paramArrayOfByte[i];
      } catch (Exception localException) {
        break;
      }
      i++;
    }
    if (i * i * 40000L + i * 78L != 615049672L) {
      System.out.println("result=false");
      System.exit(0);
    }
    
    byte[] arrayOfByte = new byte[124];
    
    arrayOfByte[0] = ((byte)(paramArrayOfByte[44] ^ 0xEB));
    arrayOfByte[1] = ((byte)(paramArrayOfByte[111] ^ 0xCB));
    arrayOfByte[2] = ((byte)(paramArrayOfByte[123] ^ 0x32));
    arrayOfByte[3] = ((byte)(paramArrayOfByte[74] ^ 0xC0));
    arrayOfByte[4] = ((byte)(paramArrayOfByte[13] ^ 0x7F));
    arrayOfByte[5] = ((byte)(paramArrayOfByte[17] ^ 0x29));
    arrayOfByte[6] = ((byte)(paramArrayOfByte[0] ^ 0xC3));
    arrayOfByte[7] = ((byte)(paramArrayOfByte[16] ^ 0x5A));
    arrayOfByte[8] = ((byte)(paramArrayOfByte[103] ^ 0x17));
    arrayOfByte[9] = ((byte)(paramArrayOfByte[14] ^ 0xA2));
    arrayOfByte[10] = ((byte)(paramArrayOfByte[4] ^ 0xC8));
    arrayOfByte[11] = ((byte)(paramArrayOfByte[47] ^ 0x9));
    arrayOfByte[12] = ((byte)(paramArrayOfByte[38] ^ 0x57));
    arrayOfByte[13] = ((byte)(paramArrayOfByte[34] ^ 0x2E));
    arrayOfByte[14] = ((byte)(paramArrayOfByte[28] ^ 0xE1));
    arrayOfByte[15] = ((byte)(paramArrayOfByte[92] ^ 0x7E));
    arrayOfByte[16] = ((byte)(paramArrayOfByte[91] ^ 0x8));
    arrayOfByte[17] = ((byte)(paramArrayOfByte[93] ^ 0x27));
    arrayOfByte[18] = ((byte)(paramArrayOfByte[23] ^ 0xEB));
    arrayOfByte[19] = ((byte)(paramArrayOfByte[22] ^ 0x58));
    arrayOfByte[20] = ((byte)(paramArrayOfByte[61] ^ 0x49));
    arrayOfByte[21] = ((byte)(paramArrayOfByte[117] ^ 0x9));
    arrayOfByte[22] = ((byte)(paramArrayOfByte[79] ^ 0xE3));
    arrayOfByte[23] = ((byte)(paramArrayOfByte[76] ^ 0x1E));
    arrayOfByte[24] = ((byte)(paramArrayOfByte[72] ^ 0x66));
    arrayOfByte[25] = ((byte)(paramArrayOfByte[100] ^ 0xFF));
    arrayOfByte[26] = ((byte)(paramArrayOfByte[107] ^ 0x49));
    arrayOfByte[27] = ((byte)(paramArrayOfByte[81] ^ 0x9E));
    arrayOfByte[28] = ((byte)(paramArrayOfByte[64] ^ 0xEA));
    arrayOfByte[29] = ((byte)(paramArrayOfByte[1] ^ 0xD9));
    arrayOfByte[30] = ((byte)(paramArrayOfByte[18] ^ 0x6D));
    arrayOfByte[31] = ((byte)(paramArrayOfByte[65] ^ 0x8A));
    arrayOfByte[32] = ((byte)(paramArrayOfByte[46] ^ 0x17));
    arrayOfByte[33] = ((byte)(paramArrayOfByte[116] ^ 0xBE));
    arrayOfByte[34] = ((byte)(paramArrayOfByte[109] ^ 0x51));
    arrayOfByte[35] = ((byte)(paramArrayOfByte[41] ^ 0xB5));
    arrayOfByte[36] = ((byte)(paramArrayOfByte[71] ^ 0x1));
    arrayOfByte[37] = ((byte)(paramArrayOfByte[59] ^ 0x79));
    arrayOfByte[38] = ((byte)(paramArrayOfByte[11] ^ 0x16));
    arrayOfByte[39] = ((byte)(paramArrayOfByte[68] ^ 0x4C));
    arrayOfByte[40] = ((byte)(paramArrayOfByte[7] ^ 0xD));
    arrayOfByte[41] = ((byte)(paramArrayOfByte[114] ^ 0xF7));
    arrayOfByte[42] = ((byte)(paramArrayOfByte[80] ^ 0xB9));
    arrayOfByte[43] = ((byte)(paramArrayOfByte[97] ^ 0x62));
    arrayOfByte[44] = ((byte)(paramArrayOfByte[58] ^ 0x4D));
    arrayOfByte[45] = ((byte)(paramArrayOfByte[85] ^ 0xFA));
    arrayOfByte[46] = ((byte)(paramArrayOfByte[86] ^ 0xB3));
    arrayOfByte[47] = ((byte)(paramArrayOfByte[33] ^ 0x68));
    arrayOfByte[48] = ((byte)(paramArrayOfByte[42] ^ 0x63));
    arrayOfByte[49] = ((byte)(paramArrayOfByte[26] ^ 0x18));
    arrayOfByte[50] = ((byte)(paramArrayOfByte[73] ^ 0x13));
    arrayOfByte[51] = ((byte)(paramArrayOfByte[95] ^ 0xB1));
    arrayOfByte[52] = ((byte)(paramArrayOfByte[51] ^ 0xF1));
    arrayOfByte[53] = ((byte)(paramArrayOfByte[9] ^ 0x82));
    arrayOfByte[54] = ((byte)(paramArrayOfByte[52] ^ 0xC0));
    arrayOfByte[55] = ((byte)(paramArrayOfByte[30] ^ 0xF3));
    arrayOfByte[56] = ((byte)(paramArrayOfByte[82] ^ 0xDE));
    arrayOfByte[57] = ((byte)(paramArrayOfByte[90] ^ 0xD1));
    arrayOfByte[58] = ((byte)(paramArrayOfByte[55] ^ 0xCB));
    arrayOfByte[59] = ((byte)(paramArrayOfByte[121] ^ 0xC2));
    arrayOfByte[60] = ((byte)(paramArrayOfByte[67] ^ 0x84));
    arrayOfByte[61] = ((byte)(paramArrayOfByte[3] ^ 0xE2));
    arrayOfByte[62] = ((byte)(paramArrayOfByte[66] ^ 0x3));
    arrayOfByte[63] = ((byte)(paramArrayOfByte[56] ^ 0xFC));
    arrayOfByte[64] = ((byte)(paramArrayOfByte[32] ^ 0xA7));
    arrayOfByte[65] = ((byte)(paramArrayOfByte[12] ^ 0xEA));
    arrayOfByte[66] = ((byte)(paramArrayOfByte[75] ^ 0xEC));
    arrayOfByte[67] = ((byte)(paramArrayOfByte[57] ^ 0x3D));
    arrayOfByte[68] = ((byte)(paramArrayOfByte[94] ^ 0x6));
    arrayOfByte[69] = ((byte)(paramArrayOfByte[5] ^ 0xAC));
    arrayOfByte[70] = ((byte)(paramArrayOfByte[120] ^ 0x16));
    arrayOfByte[71] = ((byte)(paramArrayOfByte[15] ^ 0xF0));
    arrayOfByte[72] = ((byte)(paramArrayOfByte[98] ^ 0xD0));
    arrayOfByte[73] = ((byte)(paramArrayOfByte[27] ^ 0x77));
    arrayOfByte[74] = ((byte)(paramArrayOfByte[105] ^ 0x5A));
    arrayOfByte[75] = ((byte)(paramArrayOfByte[25] ^ 0x32));
    arrayOfByte[76] = ((byte)(paramArrayOfByte[60] ^ 0x9A));
    arrayOfByte[77] = ((byte)(paramArrayOfByte[39] ^ 0xD1));
    arrayOfByte[78] = ((byte)(paramArrayOfByte[106] ^ 0x9C));
    arrayOfByte[79] = ((byte)(paramArrayOfByte[48] ^ 0x4A));
    arrayOfByte[80] = ((byte)(paramArrayOfByte[88] ^ 0x31));
    arrayOfByte[81] = ((byte)(paramArrayOfByte[35] ^ 0xD0));
    arrayOfByte[82] = ((byte)(paramArrayOfByte[87] ^ 0x13));
    arrayOfByte[83] = ((byte)(paramArrayOfByte[62] ^ 0x34));
    arrayOfByte[84] = ((byte)(paramArrayOfByte[83] ^ 0x1B));
    arrayOfByte[85] = ((byte)(paramArrayOfByte[43] ^ 0x14));
    arrayOfByte[86] = ((byte)(paramArrayOfByte[21] ^ 0x3E));
    arrayOfByte[87] = ((byte)(paramArrayOfByte[36] ^ 0xB1));
    arrayOfByte[88] = ((byte)(paramArrayOfByte[49] ^ 0xEE));
    arrayOfByte[89] = ((byte)(paramArrayOfByte[110] ^ 0x62));
    arrayOfByte[90] = ((byte)(paramArrayOfByte[113] ^ 0xE1));
    arrayOfByte[91] = ((byte)(paramArrayOfByte[24] ^ 0x6B));
    arrayOfByte[92] = ((byte)(paramArrayOfByte[78] ^ 0x70));
    arrayOfByte[93] = ((byte)(paramArrayOfByte[31] ^ 0xCA));
    arrayOfByte[94] = ((byte)(paramArrayOfByte[122] ^ 0x97));
    arrayOfByte[95] = ((byte)(paramArrayOfByte[8] ^ 0xF8));
    arrayOfByte[96] = ((byte)(paramArrayOfByte[50] ^ 0x4E));
    arrayOfByte[97] = ((byte)(paramArrayOfByte[112] ^ 0x1D));
    arrayOfByte[98] = ((byte)(paramArrayOfByte[70] ^ 0xDF));
    arrayOfByte[99] = ((byte)(paramArrayOfByte[40] ^ 0x76));
    arrayOfByte[100] = ((byte)(paramArrayOfByte[45] ^ 0x9E));
    arrayOfByte[101] = ((byte)(paramArrayOfByte[54] ^ 0x37));
    arrayOfByte[102] = ((byte)(paramArrayOfByte[96] ^ 0xF8));
    arrayOfByte[103] = ((byte)(paramArrayOfByte[102] ^ 0x67));
    arrayOfByte[104] = ((byte)(paramArrayOfByte[63] ^ 0xB3));
    arrayOfByte[105] = ((byte)(paramArrayOfByte[84] ^ 0xD));
    arrayOfByte[106] = ((byte)(paramArrayOfByte[2] ^ 0x2B));
    arrayOfByte[107] = ((byte)(paramArrayOfByte[118] ^ 0x70));
    arrayOfByte[108] = ((byte)(paramArrayOfByte[99] ^ 0x59));
    arrayOfByte[109] = ((byte)(paramArrayOfByte[69] ^ 0x4B));
    arrayOfByte[110] = ((byte)(paramArrayOfByte[119] ^ 0x8D));
    arrayOfByte[111] = ((byte)(paramArrayOfByte[6] ^ 0x58));
    arrayOfByte[112] = ((byte)(paramArrayOfByte[29] ^ 0x7F));
    arrayOfByte[113] = ((byte)(paramArrayOfByte[101] ^ 0x9D));
    arrayOfByte[114] = ((byte)(paramArrayOfByte[77] ^ 0x32));
    arrayOfByte[115] = ((byte)(paramArrayOfByte[104] ^ 0x6));
    arrayOfByte[116] = ((byte)(paramArrayOfByte[37] ^ 0x4B));
    arrayOfByte[117] = ((byte)(paramArrayOfByte[108] ^ 0x59));
    arrayOfByte[118] = ((byte)(paramArrayOfByte[10] ^ 0x33));
    arrayOfByte[119] = ((byte)(paramArrayOfByte[19] ^ 0x43));
    arrayOfByte[120] = ((byte)(paramArrayOfByte[20] ^ 0x95));
    arrayOfByte[121] = ((byte)(paramArrayOfByte[89] ^ 0xD5));
    arrayOfByte[122] = ((byte)(paramArrayOfByte[115] ^ 0xC2));
    arrayOfByte[123] = ((byte)(paramArrayOfByte[53] ^ 0x4A));
    return arrayOfByte;
  }
  
  public static byte[] password_enchiffragement_9(byte[] paramArrayOfByte)
  {
    int i = 0;
    int j = 97;
    for (;;) {
      try {
        j = paramArrayOfByte[i];
      } catch (Exception localException) {
        break;
      }
      i++;
    }
    if (i * i * 40000L + i * 78L != 615049672L) {
      System.out.println("result=false");
      System.exit(0);
    }
    
    byte[] arrayOfByte = new byte[124];
    
    arrayOfByte[0] = ((byte)(paramArrayOfByte[5] ^ 0x8D));
    arrayOfByte[1] = ((byte)(paramArrayOfByte[98] ^ 0x4B));
    arrayOfByte[2] = ((byte)(paramArrayOfByte[123] ^ 0x36));
    arrayOfByte[3] = ((byte)(paramArrayOfByte[26] ^ 0x30));
    arrayOfByte[4] = ((byte)(paramArrayOfByte[103] ^ 0x55));
    arrayOfByte[5] = ((byte)(paramArrayOfByte[102] ^ 0x70));
    arrayOfByte[6] = ((byte)(paramArrayOfByte[28] ^ 0xE));
    arrayOfByte[7] = ((byte)(paramArrayOfByte[50] ^ 0x90));
    arrayOfByte[8] = ((byte)(paramArrayOfByte[75] ^ 0xA5));
    arrayOfByte[9] = ((byte)(paramArrayOfByte[115] ^ 0xB7));
    arrayOfByte[10] = ((byte)(paramArrayOfByte[13] ^ 0x11));
    arrayOfByte[11] = ((byte)(paramArrayOfByte[31] ^ 0x47));
    arrayOfByte[12] = ((byte)(paramArrayOfByte[97] ^ 0xE8));
    arrayOfByte[13] = ((byte)(paramArrayOfByte[59] ^ 0x3B));
    arrayOfByte[14] = ((byte)(paramArrayOfByte[119] ^ 0x2B));
    arrayOfByte[15] = ((byte)(paramArrayOfByte[91] ^ 0xA3));
    arrayOfByte[16] = ((byte)(paramArrayOfByte[44] ^ 0x99));
    arrayOfByte[17] = ((byte)(paramArrayOfByte[7] ^ 0x6A));
    arrayOfByte[18] = ((byte)(paramArrayOfByte[96] ^ 0xFF));
    arrayOfByte[19] = ((byte)(paramArrayOfByte[4] ^ 0x1));
    arrayOfByte[20] = ((byte)(paramArrayOfByte[29] ^ 0xDE));
    arrayOfByte[21] = ((byte)(paramArrayOfByte[89] ^ 0xEC));
    arrayOfByte[22] = ((byte)(paramArrayOfByte[35] ^ 0xF4));
    arrayOfByte[23] = ((byte)(paramArrayOfByte[15] ^ 0xD8));
    arrayOfByte[24] = ((byte)(paramArrayOfByte[27] ^ 0xC6));
    arrayOfByte[25] = ((byte)(paramArrayOfByte[16] ^ 0xE7));
    arrayOfByte[26] = ((byte)(paramArrayOfByte[87] ^ 0x3E));
    arrayOfByte[27] = ((byte)(paramArrayOfByte[100] ^ 0x5E));
    arrayOfByte[28] = ((byte)(paramArrayOfByte[99] ^ 0x1F));
    arrayOfByte[29] = ((byte)(paramArrayOfByte[24] ^ 0x6C));
    arrayOfByte[30] = ((byte)(paramArrayOfByte[51] ^ 0x7B));
    arrayOfByte[31] = ((byte)(paramArrayOfByte[67] ^ 0x49));
    arrayOfByte[32] = ((byte)(paramArrayOfByte[6] ^ 0x54));
    arrayOfByte[33] = ((byte)(paramArrayOfByte[62] ^ 0x45));
    arrayOfByte[34] = ((byte)(paramArrayOfByte[0] ^ 0xD4));
    arrayOfByte[35] = ((byte)(paramArrayOfByte[9] ^ 0x79));
    arrayOfByte[36] = ((byte)(paramArrayOfByte[33] ^ 0x1A));
    arrayOfByte[37] = ((byte)(paramArrayOfByte[38] ^ 0xBF));
    arrayOfByte[38] = ((byte)(paramArrayOfByte[17] ^ 0xF));
    arrayOfByte[39] = ((byte)(paramArrayOfByte[10] ^ 0xBA));
    arrayOfByte[40] = ((byte)(paramArrayOfByte[8] ^ 0x4A));
    arrayOfByte[41] = ((byte)(paramArrayOfByte[12] ^ 0x3D));
    arrayOfByte[42] = ((byte)(paramArrayOfByte[73] ^ 0xD4));
    arrayOfByte[43] = ((byte)(paramArrayOfByte[72] ^ 0x3F));
    arrayOfByte[44] = ((byte)(paramArrayOfByte[63] ^ 0xBF));
    arrayOfByte[45] = ((byte)(paramArrayOfByte[90] ^ 0x2C));
    arrayOfByte[46] = ((byte)(paramArrayOfByte[54] ^ 0xA0));
    arrayOfByte[47] = ((byte)(paramArrayOfByte[66] ^ 0x40));
    arrayOfByte[48] = ((byte)(paramArrayOfByte[116] ^ 0x93));
    arrayOfByte[49] = ((byte)(paramArrayOfByte[118] ^ 0xFD));
    arrayOfByte[50] = ((byte)(paramArrayOfByte[82] ^ 0x59));
    arrayOfByte[51] = ((byte)(paramArrayOfByte[81] ^ 0x1));
    arrayOfByte[52] = ((byte)(paramArrayOfByte[36] ^ 0xD4));
    arrayOfByte[53] = ((byte)(paramArrayOfByte[23] ^ 0x44));
    arrayOfByte[54] = ((byte)(paramArrayOfByte[48] ^ 0x3D));
    arrayOfByte[55] = ((byte)(paramArrayOfByte[19] ^ 0x2));
    arrayOfByte[56] = ((byte)(paramArrayOfByte[74] ^ 0x68));
    arrayOfByte[57] = ((byte)(paramArrayOfByte[41] ^ 0x7A));
    arrayOfByte[58] = ((byte)(paramArrayOfByte[101] ^ 0xC2));
    arrayOfByte[59] = ((byte)(paramArrayOfByte[109] ^ 0xA4));
    arrayOfByte[60] = ((byte)(paramArrayOfByte[85] ^ 0x8F));
    arrayOfByte[61] = ((byte)(paramArrayOfByte[92] ^ 0xE));
    arrayOfByte[62] = ((byte)(paramArrayOfByte[117] ^ 0x86));
    arrayOfByte[63] = ((byte)(paramArrayOfByte[106] ^ 0x11));
    arrayOfByte[64] = ((byte)(paramArrayOfByte[122] ^ 0x28));
    arrayOfByte[65] = ((byte)(paramArrayOfByte[121] ^ 0xFF));
    arrayOfByte[66] = ((byte)(paramArrayOfByte[78] ^ 0x97));
    arrayOfByte[67] = ((byte)(paramArrayOfByte[21] ^ 0x46));
    arrayOfByte[68] = ((byte)(paramArrayOfByte[46] ^ 0x77));
    arrayOfByte[69] = ((byte)(paramArrayOfByte[53] ^ 0x6));
    arrayOfByte[70] = ((byte)(paramArrayOfByte[111] ^ 0xF1));
    arrayOfByte[71] = ((byte)(paramArrayOfByte[47] ^ 0x70));
    arrayOfByte[72] = ((byte)(paramArrayOfByte[79] ^ 0x5));
    arrayOfByte[73] = ((byte)(paramArrayOfByte[3] ^ 0xCE));
    arrayOfByte[74] = ((byte)(paramArrayOfByte[65] ^ 0xDB));
    arrayOfByte[75] = ((byte)(paramArrayOfByte[40] ^ 0xED));
    arrayOfByte[76] = ((byte)(paramArrayOfByte[84] ^ 0xD6));
    arrayOfByte[77] = ((byte)(paramArrayOfByte[104] ^ 0xC2));
    arrayOfByte[78] = ((byte)(paramArrayOfByte[108] ^ 0x9D));
    arrayOfByte[79] = ((byte)(paramArrayOfByte[64] ^ 0x6A));
    arrayOfByte[80] = ((byte)(paramArrayOfByte[93] ^ 0xD0));
    arrayOfByte[81] = ((byte)(paramArrayOfByte[110] ^ 0x57));
    arrayOfByte[82] = ((byte)(paramArrayOfByte[45] ^ 0x15));
    arrayOfByte[83] = ((byte)(paramArrayOfByte[58] ^ 0x68));
    arrayOfByte[84] = ((byte)(paramArrayOfByte[56] ^ 0xD));
    arrayOfByte[85] = ((byte)(paramArrayOfByte[112] ^ 0xC9));
    arrayOfByte[86] = ((byte)(paramArrayOfByte[80] ^ 0xB8));
    arrayOfByte[87] = ((byte)(paramArrayOfByte[88] ^ 0xF0));
    arrayOfByte[88] = ((byte)(paramArrayOfByte[32] ^ 0x1B));
    arrayOfByte[89] = ((byte)(paramArrayOfByte[22] ^ 0x76));
    arrayOfByte[90] = ((byte)(paramArrayOfByte[42] ^ 0xAA));
    arrayOfByte[91] = ((byte)(paramArrayOfByte[57] ^ 0x26));
    arrayOfByte[92] = ((byte)(paramArrayOfByte[94] ^ 0x7C));
    arrayOfByte[93] = ((byte)(paramArrayOfByte[60] ^ 0x44));
    arrayOfByte[94] = ((byte)(paramArrayOfByte[61] ^ 0x4E));
    arrayOfByte[95] = ((byte)(paramArrayOfByte[43] ^ 0x61));
    arrayOfByte[96] = ((byte)(paramArrayOfByte[71] ^ 0xF4));
    arrayOfByte[97] = ((byte)(paramArrayOfByte[18] ^ 0x48));
    arrayOfByte[98] = ((byte)(paramArrayOfByte[34] ^ 0x8F));
    arrayOfByte[99] = ((byte)(paramArrayOfByte[68] ^ 0xD0));
    arrayOfByte[100] = ((byte)(paramArrayOfByte[52] ^ 0x8E));
    arrayOfByte[101] = ((byte)(paramArrayOfByte[83] ^ 0xD3));
    arrayOfByte[102] = ((byte)(paramArrayOfByte[95] ^ 0x66));
    arrayOfByte[103] = ((byte)(paramArrayOfByte[113] ^ 0xD7));
    arrayOfByte[104] = ((byte)(paramArrayOfByte[107] ^ 0x18));
    arrayOfByte[105] = ((byte)(paramArrayOfByte[30] ^ 0x1B));
    arrayOfByte[106] = ((byte)(paramArrayOfByte[14] ^ 0x77));
    arrayOfByte[107] = ((byte)(paramArrayOfByte[114] ^ 0x70));
    arrayOfByte[108] = ((byte)(paramArrayOfByte[49] ^ 0xD5));
    arrayOfByte[109] = ((byte)(paramArrayOfByte[55] ^ 0x3E));
    arrayOfByte[110] = ((byte)(paramArrayOfByte[77] ^ 0x28));
    arrayOfByte[111] = ((byte)(paramArrayOfByte[37] ^ 0x88));
    arrayOfByte[112] = ((byte)(paramArrayOfByte[105] ^ 0xCB));
    arrayOfByte[113] = ((byte)(paramArrayOfByte[11] ^ 0x2E));
    arrayOfByte[114] = ((byte)(paramArrayOfByte[25] ^ 0xC6));
    arrayOfByte[115] = ((byte)(paramArrayOfByte[70] ^ 0xAC));
    arrayOfByte[116] = ((byte)(paramArrayOfByte[2] ^ 0xDE));
    arrayOfByte[117] = ((byte)(paramArrayOfByte[76] ^ 0x9));
    arrayOfByte[118] = ((byte)(paramArrayOfByte[69] ^ 0x4E));
    arrayOfByte[119] = ((byte)(paramArrayOfByte[39] ^ 0xDC));
    arrayOfByte[120] = ((byte)(paramArrayOfByte[86] ^ 0xF));
    arrayOfByte[121] = ((byte)(paramArrayOfByte[1] ^ 0x15));
    arrayOfByte[122] = ((byte)(paramArrayOfByte[20] ^ 0xC1));
    arrayOfByte[123] = ((byte)(paramArrayOfByte[120] ^ 0x0));
    return arrayOfByte;
  }
  
  public static void main(String[] paramArrayOfString)
  {
    byte[] arrayOfByte = paramArrayOfString[0].getBytes();
    arrayOfByte = base64_0(arrayOfByte);
    arrayOfByte = password_enchiffragement_1(arrayOfByte);
    arrayOfByte = base64_2(arrayOfByte);
    arrayOfByte = password_enchiffragement_3(arrayOfByte);
    arrayOfByte = base64_4(arrayOfByte);
    arrayOfByte = password_enchiffragement_5(arrayOfByte);
    arrayOfByte = base64_6(arrayOfByte);
    arrayOfByte = password_enchiffragement_7(arrayOfByte);
    arrayOfByte = password_enchiffragement_8(arrayOfByte);
    arrayOfByte = password_enchiffragement_9(arrayOfByte);
    
    boolean bool = java.util.Base64.getEncoder().encodeToString(arrayOfByte).equals("ZvhdxFZGZaN/M1IvAD8qaJI9UQqPluT45250BfOZPygRl68GGZqZ7QS+GTFUGcONT8r7cEkTh8gSgELMXdcURGPb25wfCIrVG6ptrLr6GJ9IpBeLP40Gu1VKwZJtdw75ud+LNgXop0KE4CGm8cCx6eqwnAFioKvBkJQEjQ==");
    System.out.println("result=" + bool);
  }
}
