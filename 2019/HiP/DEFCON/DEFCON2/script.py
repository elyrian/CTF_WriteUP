import base64
import string

def print_as_char(input_str):
    res = ""
    for i in input_str:
        res += chr(i)
    print(res)
    return res

def str_to_intlist(input_str):
    res = list()
    for i in input_str:
        res.append(i)
    return res

def dechiffre_9(input_str):
    final = list()
    for i in input_str:
        final.append(0)
    final[5] = input_str[0] ^ 0x8D
    final[98] = input_str[1] ^ 0x4B
    final[123] = input_str[2] ^ 0x36
    final[26] = input_str[3] ^ 0x30
    final[103] = input_str[4] ^ 0x55
    final[102] = input_str[5] ^ 0x70
    final[28] = input_str[6] ^ 0xE
    final[50] = input_str[7] ^ 0x90
    final[75] = input_str[8] ^ 0xA5
    final[115] = input_str[9] ^ 0xB7
    final[13] = input_str[10] ^ 0x11
    final[31] = input_str[11] ^ 0x47
    final[97] = input_str[12] ^ 0xE8
    final[59] = input_str[13] ^ 0x3B
    final[119] = input_str[14] ^ 0x2B
    final[91] = input_str[15] ^ 0xA3
    final[44] = input_str[16] ^ 0x99
    final[7] = input_str[17] ^ 0x6A
    final[96] = input_str[18] ^ 0xFF
    final[4] = input_str[19] ^ 0x1
    final[29] = input_str[20] ^ 0xDE
    final[89] = input_str[21] ^ 0xEC
    final[35] = input_str[22] ^ 0xF4
    final[15] = input_str[23] ^ 0xD8
    final[27] = input_str[24] ^ 0xC6
    final[16] = input_str[25] ^ 0xE7
    final[87] = input_str[26] ^ 0x3E
    final[100] = input_str[27] ^ 0x5E
    final[99] = input_str[28] ^ 0x1F
    final[24] = input_str[29] ^ 0x6C
    final[51] = input_str[30] ^ 0x7B
    final[67] = input_str[31] ^ 0x49
    final[6] = input_str[32] ^ 0x54
    final[62] = input_str[33] ^ 0x45
    final[0] = input_str[34] ^ 0xD4
    final[9] = input_str[35] ^ 0x79
    final[33] = input_str[36] ^ 0x1A
    final[38] = input_str[37] ^ 0xBF
    final[17] = input_str[38] ^ 0xF
    final[10] = input_str[39] ^ 0xBA
    final[8] = input_str[40] ^ 0x4A
    final[12] = input_str[41] ^ 0x3D
    final[73] = input_str[42] ^ 0xD4
    final[72] = input_str[43] ^ 0x3F
    final[63] = input_str[44] ^ 0xBF
    final[90] = input_str[45] ^ 0x2C
    final[54] = input_str[46] ^ 0xA0
    final[66] = input_str[47] ^ 0x40
    final[116] = input_str[48] ^ 0x93
    final[118] = input_str[49] ^ 0xFD
    final[82] = input_str[50] ^ 0x59
    final[81] = input_str[51] ^ 0x1
    final[36] = input_str[52] ^ 0xD4
    final[23] = input_str[53] ^ 0x44
    final[48] = input_str[54] ^ 0x3D
    final[19] = input_str[55] ^ 0x2
    final[74] = input_str[56] ^ 0x68
    final[41] = input_str[57] ^ 0x7A
    final[101] = input_str[58] ^ 0xC2
    final[109] = input_str[59] ^ 0xA4
    final[85] = input_str[60] ^ 0x8F
    final[92] = input_str[61] ^ 0xE
    final[117] = input_str[62] ^ 0x86
    final[106] = input_str[63] ^ 0x11
    final[122] = input_str[64] ^ 0x28
    final[121] = input_str[65] ^ 0xFF
    final[78] = input_str[66] ^ 0x97
    final[21] = input_str[67] ^ 0x46
    final[46] = input_str[68] ^ 0x77
    final[53] = input_str[69] ^ 0x6
    final[111] = input_str[70] ^ 0xF1
    final[47] = input_str[71] ^ 0x70
    final[79] = input_str[72] ^ 0x5
    final[3] = input_str[73] ^ 0xCE
    final[65] = input_str[74] ^ 0xDB
    final[40] = input_str[75] ^ 0xED
    final[84] = input_str[76] ^ 0xD6
    final[104] = input_str[77] ^ 0xC2
    final[108] = input_str[78] ^ 0x9D
    final[64] = input_str[79] ^ 0x6A
    final[93] = input_str[80] ^ 0xD0
    final[110] = input_str[81] ^ 0x57
    final[45] = input_str[82] ^ 0x15
    final[58] = input_str[83] ^ 0x68
    final[56] = input_str[84] ^ 0xD
    final[112] = input_str[85] ^ 0xC9
    final[80] = input_str[86] ^ 0xB8
    final[88] = input_str[87] ^ 0xF0
    final[32] = input_str[88] ^ 0x1B
    final[22] = input_str[89] ^ 0x76
    final[42] = input_str[90] ^ 0xAA
    final[57] = input_str[91] ^ 0x26
    final[94] = input_str[92] ^ 0x7C
    final[60] = input_str[93] ^ 0x44
    final[61] = input_str[94] ^ 0x4E
    final[43] = input_str[95] ^ 0x61
    final[71] = input_str[96] ^ 0xF4
    final[18] = input_str[97] ^ 0x48
    final[34] = input_str[98] ^ 0x8F
    final[68] = input_str[99] ^ 0xD0
    final[52] = input_str[100] ^ 0x8E
    final[83] = input_str[101] ^ 0xD3
    final[95] = input_str[102] ^ 0x66
    final[113] = input_str[103] ^ 0xD7
    final[107] = input_str[104] ^ 0x18
    final[30] = input_str[105] ^ 0x1B
    final[14] = input_str[106] ^ 0x77
    final[114] = input_str[107] ^ 0x70
    final[49] = input_str[108] ^ 0xD5
    final[55] = input_str[109] ^ 0x3E
    final[77] = input_str[110] ^ 0x28
    final[37] = input_str[111] ^ 0x88
    final[105] = input_str[112] ^ 0xCB
    final[11] = input_str[113] ^ 0x2E
    final[25] = input_str[114] ^ 0xC6
    final[70] = input_str[115] ^ 0xAC
    final[2] = input_str[116] ^ 0xDE
    final[76] = input_str[117] ^ 0x9
    final[69] = input_str[118] ^ 0x4E
    final[39] = input_str[119] ^ 0xDC
    final[86] = input_str[120] ^ 0xF
    final[1] = input_str[121] ^ 0x15
    final[20] = input_str[122] ^ 0xC1
    final[120] = input_str[123] ^ 0x0
    return(final)

def dechiffre_8(input_str):
    final = list()
    for i in input_str:
        final.append(0)
    final[44] = input_str[0] ^ 0xEB
    final[111] = input_str[1] ^ 0xCB
    final[123] = input_str[2] ^ 0x32
    final[74] = input_str[3] ^ 0xC0
    final[13] = input_str[4] ^ 0x7F
    final[17] = input_str[5] ^ 0x29
    final[0] = input_str[6] ^ 0xC3
    final[16] = input_str[7] ^ 0x5A
    final[103] = input_str[8] ^ 0x17
    final[14] = input_str[9] ^ 0xA2
    final[4] = input_str[10] ^ 0xC8
    final[47] = input_str[11] ^ 0x9
    final[38] = input_str[12] ^ 0x57
    final[34] = input_str[13] ^ 0x2E
    final[28] = input_str[14] ^ 0xE1
    final[92] = input_str[15] ^ 0x7E
    final[91] = input_str[16] ^ 0x8
    final[93] = input_str[17] ^ 0x27
    final[23] = input_str[18] ^ 0xEB
    final[22] = input_str[19] ^ 0x58
    final[61] = input_str[20] ^ 0x49
    final[117] = input_str[21] ^ 0x9
    final[79] = input_str[22] ^ 0xE3
    final[76] = input_str[23] ^ 0x1E
    final[72] = input_str[24] ^ 0x66
    final[100] = input_str[25] ^ 0xFF
    final[107] = input_str[26] ^ 0x49
    final[81] = input_str[27] ^ 0x9E
    final[64] = input_str[28] ^ 0xEA
    final[1] = input_str[29] ^ 0xD9
    final[18] = input_str[30] ^ 0x6D
    final[65] = input_str[31] ^ 0x8A
    final[46] = input_str[32] ^ 0x17
    final[116] = input_str[33] ^ 0xBE
    final[109] = input_str[34] ^ 0x51
    final[41] = input_str[35] ^ 0xB5
    final[71] = input_str[36] ^ 0x1
    final[59] = input_str[37] ^ 0x79
    final[11] = input_str[38] ^ 0x16
    final[68] = input_str[39] ^ 0x4C
    final[7] = input_str[40] ^ 0xD
    final[114] = input_str[41] ^ 0xF7
    final[80] = input_str[42] ^ 0xB9
    final[97] = input_str[43] ^ 0x62
    final[58] = input_str[44] ^ 0x4D
    final[85] = input_str[45] ^ 0xFA
    final[86] = input_str[46] ^ 0xB3
    final[33] = input_str[47] ^ 0x68
    final[42] = input_str[48] ^ 0x63
    final[26] = input_str[49] ^ 0x18
    final[73] = input_str[50] ^ 0x13
    final[95] = input_str[51] ^ 0xB1
    final[51] = input_str[52] ^ 0xF1
    final[9] = input_str[53] ^ 0x82
    final[52] = input_str[54] ^ 0xC0
    final[30] = input_str[55] ^ 0xF3
    final[82] = input_str[56] ^ 0xDE
    final[90] = input_str[57] ^ 0xD1
    final[55] = input_str[58] ^ 0xCB
    final[121] = input_str[59] ^ 0xC2
    final[67] = input_str[60] ^ 0x84
    final[3] = input_str[61] ^ 0xE2
    final[66] = input_str[62] ^ 0x3
    final[56] = input_str[63] ^ 0xFC
    final[32] = input_str[64] ^ 0xA7
    final[12] = input_str[65] ^ 0xEA
    final[75] = input_str[66] ^ 0xEC
    final[57] = input_str[67] ^ 0x3D
    final[94] = input_str[68] ^ 0x6
    final[5] = input_str[69] ^ 0xAC
    final[120] = input_str[70] ^ 0x16
    final[15] = input_str[71] ^ 0xF0
    final[98] = input_str[72] ^ 0xD0
    final[27] = input_str[73] ^ 0x77
    final[105] = input_str[74] ^ 0x5A
    final[25] = input_str[75] ^ 0x32
    final[60] = input_str[76] ^ 0x9A
    final[39] = input_str[77] ^ 0xD1
    final[106] = input_str[78] ^ 0x9C
    final[48] = input_str[79] ^ 0x4A
    final[88] = input_str[80] ^ 0x31
    final[35] = input_str[81] ^ 0xD0
    final[87] = input_str[82] ^ 0x13
    final[62] = input_str[83] ^ 0x34
    final[83] = input_str[84] ^ 0x1B
    final[43] = input_str[85] ^ 0x14
    final[21] = input_str[86] ^ 0x3E
    final[36] = input_str[87] ^ 0xB1
    final[49] = input_str[88] ^ 0xEE
    final[110] = input_str[89] ^ 0x62
    final[113] = input_str[90] ^ 0xE1
    final[24] = input_str[91] ^ 0x6B
    final[78] = input_str[92] ^ 0x70
    final[31] = input_str[93] ^ 0xCA
    final[122] = input_str[94] ^ 0x97
    final[8] = input_str[95] ^ 0xF8
    final[50] = input_str[96] ^ 0x4E
    final[112] = input_str[97] ^ 0x1D
    final[70] = input_str[98] ^ 0xDF
    final[40] = input_str[99] ^ 0x76
    final[45] = input_str[100] ^ 0x9E
    final[54] = input_str[101] ^ 0x37
    final[96] = input_str[102] ^ 0xF8
    final[102] = input_str[103] ^ 0x67
    final[63] = input_str[104] ^ 0xB3
    final[84] = input_str[105] ^ 0xD
    final[2] = input_str[106] ^ 0x2B
    final[118] = input_str[107] ^ 0x70
    final[99] = input_str[108] ^ 0x59
    final[69] = input_str[109] ^ 0x4B
    final[119] = input_str[110] ^ 0x8D
    final[6] = input_str[111] ^ 0x58
    final[29] = input_str[112] ^ 0x7F
    final[101] = input_str[113] ^ 0x9D
    final[77] = input_str[114] ^ 0x32
    final[104] = input_str[115] ^ 0x6
    final[37] = input_str[116] ^ 0x4B
    final[108] = input_str[117] ^ 0x59
    final[10] = input_str[118] ^ 0x33
    final[19] = input_str[119] ^ 0x43
    final[20] = input_str[120] ^ 0x95
    final[89] = input_str[121] ^ 0xD5
    final[115] = input_str[122] ^ 0xC2
    final[53] = input_str[123] ^ 0x4A
    return final

def dechiffre_7(input_str):
    final = list()
    for i in input_str:
        final.append(0)
    final[94] = input_str[0] ^ 0xE3
    final[38] = input_str[1] ^ 0xFD
    final[86] = input_str[2] ^ 0x53
    final[93] = input_str[3] ^ 0x94
    final[24] = input_str[4] ^ 0xE5
    final[102] = input_str[5] ^ 0x3F
    final[118] = input_str[6] ^ 0x6A
    final[77] = input_str[7] ^ 0x61
    final[10] = input_str[8] ^ 0x58
    final[16] = input_str[9] ^ 0xF8
    final[76] = input_str[10] ^ 0x34
    final[90] = input_str[11] ^ 0x7
    final[30] = input_str[12] ^ 0x34
    final[3] = input_str[13] ^ 0x6
    final[88] = input_str[14] ^ 0x9E
    final[1] = input_str[15] ^ 0xF8
    final[81] = input_str[16] ^ 0x3B
    final[45] = input_str[17] ^ 0xAC
    final[80] = input_str[18] ^ 0xF9
    final[36] = input_str[19] ^ 0x33
    final[31] = input_str[20] ^ 0x5C
    final[59] = input_str[21] ^ 0xCB
    final[18] = input_str[22] ^ 0xC0
    final[61] = input_str[23] ^ 0x25
    final[17] = input_str[24] ^ 0xF8
    final[52] = input_str[25] ^ 0xBD
    final[25] = input_str[26] ^ 0x5A
    final[112] = input_str[27] ^ 0x8C
    final[8] = input_str[28] ^ 0xFA
    final[43] = input_str[29] ^ 0x73
    final[35] = input_str[30] ^ 0x4C
    final[11] = input_str[31] ^ 0x10
    final[22] = input_str[32] ^ 0x20
    final[64] = input_str[33] ^ 0xAA
    final[87] = input_str[34] ^ 0x34
    final[111] = input_str[35] ^ 0xEB
    final[95] = input_str[36] ^ 0xA3
    final[15] = input_str[37] ^ 0xC7
    final[107] = input_str[38] ^ 0x80
    final[121] = input_str[39] ^ 0x7C
    final[13] = input_str[40] ^ 0xAC
    final[108] = input_str[41] ^ 0xE8
    final[119] = input_str[42] ^ 0x81
    final[68] = input_str[43] ^ 0xA2
    final[9] = input_str[44] ^ 0xD6
    final[85] = input_str[45] ^ 0x83
    final[51] = input_str[46] ^ 0x3F
    final[20] = input_str[47] ^ 0xF9
    final[123] = input_str[48] ^ 0x2
    final[109] = input_str[49] ^ 0x97
    final[69] = input_str[50] ^ 0xD8
    final[7] = input_str[51] ^ 0x3F
    final[19] = input_str[52] ^ 0x9B
    final[27] = input_str[53] ^ 0x44
    final[98] = input_str[54] ^ 0xF1
    final[67] = input_str[55] ^ 0x4E
    final[92] = input_str[56] ^ 0x7D
    final[72] = input_str[57] ^ 0x6C
    final[74] = input_str[58] ^ 0x36
    final[57] = input_str[59] ^ 0x6D
    final[34] = input_str[60] ^ 0x5E
    final[6] = input_str[61] ^ 0xFF
    final[58] = input_str[62] ^ 0x55
    final[97] = input_str[63] ^ 0xCF
    final[14] = input_str[64] ^ 0xFB
    final[89] = input_str[65] ^ 0x89
    final[83] = input_str[66] ^ 0xBF
    final[65] = input_str[67] ^ 0x82
    final[122] = input_str[68] ^ 0x1F
    final[41] = input_str[69] ^ 0x46
    final[115] = input_str[70] ^ 0x38
    final[96] = input_str[71] ^ 0xF4
    final[105] = input_str[72] ^ 0xE5
    final[110] = input_str[73] ^ 0x4C
    final[4] = input_str[74] ^ 0xF6
    final[116] = input_str[75] ^ 0xC
    final[49] = input_str[76] ^ 0x6
    final[70] = input_str[77] ^ 0xA3
    final[114] = input_str[78] ^ 0xCC
    final[63] = input_str[79] ^ 0xB5
    final[53] = input_str[80] ^ 0xBA
    final[2] = input_str[81] ^ 0xC7
    final[66] = input_str[82] ^ 0x86
    final[82] = input_str[83] ^ 0x20
    final[40] = input_str[84] ^ 0x49
    final[37] = input_str[85] ^ 0x9F
    final[99] = input_str[86] ^ 0xEB
    final[106] = input_str[87] ^ 0xD9
    final[0] = input_str[88] ^ 0xD6
    final[12] = input_str[89] ^ 0xBA
    final[33] = input_str[90] ^ 0x3D
    final[5] = input_str[91] ^ 0xF8
    final[117] = input_str[92] ^ 0x15
    final[28] = input_str[93] ^ 0xC0
    final[84] = input_str[94] ^ 0xD3
    final[39] = input_str[95] ^ 0x94
    final[103] = input_str[96] ^ 0xB6
    final[120] = input_str[97] ^ 0xAE
    final[75] = input_str[98] ^ 0xE9
    final[55] = input_str[99] ^ 0x8F
    final[47] = input_str[100] ^ 0x90
    final[73] = input_str[101] ^ 0x70
    final[26] = input_str[102] ^ 0x29
    final[50] = input_str[103] ^ 0x1E
    final[104] = input_str[104] ^ 0xAF
    final[48] = input_str[105] ^ 0x54
    final[78] = input_str[106] ^ 0xB5
    final[32] = input_str[107] ^ 0xD6
    final[101] = input_str[108] ^ 0xA0
    final[60] = input_str[109] ^ 0x3
    final[42] = input_str[110] ^ 0x60
    final[23] = input_str[111] ^ 0x3A
    final[46] = input_str[112] ^ 0xB8
    final[62] = input_str[113] ^ 0xE6
    final[29] = input_str[114] ^ 0x7F
    final[71] = input_str[115] ^ 0xC5
    final[79] = input_str[116] ^ 0xF6
    final[21] = input_str[117] ^ 0xA1
    final[54] = input_str[118] ^ 0xAD
    final[100] = input_str[119] ^ 0x10
    final[113] = input_str[120] ^ 0xE9
    final[44] = input_str[121] ^ 0x97
    final[56] = input_str[122] ^ 0xCD
    final[91] = input_str[123] ^ 0xBE
    return final

def base64_6(input_str):
    std_alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
    custom_alphabet = "V-GCxZTakQFBs1oRUEtySWOiYJ0rwghfmpqub7394dejc58_AzIlDH6MNvLX2PnK"
    DECODE_TRANS = str.maketrans(custom_alphabet, std_alphabet)
    aux = print_as_char(input_str).translate(DECODE_TRANS)
    print("aux = %s" % aux)
    final = base64.b64decode(aux)
    return str_to_intlist(final)

def dechiffre_5(input_str):
    final = list()
    for i in input_str:
        final.append(0)
    final[7] = input_str[0] ^ 0x19
    final[8] = input_str[1] ^ 0x76
    final[64] = input_str[2] ^ 0x7C
    final[44] = input_str[3] ^ 0x5F
    final[85] = input_str[4] ^ 0x7
    final[37] = input_str[5] ^ 0x58
    final[79] = input_str[6] ^ 0x97
    final[77] = input_str[7] ^ 0xD3
    final[21] = input_str[8] ^ 0xBE
    final[87] = input_str[9] ^ 0x88
    final[61] = input_str[10] ^ 0x27
    final[59] = input_str[11] ^ 0x1F
    final[18] = input_str[12] ^ 0x1
    final[16] = input_str[13] ^ 0xD1
    final[51] = input_str[14] ^ 0x85
    final[36] = input_str[15] ^ 0xAC
    final[80] = input_str[16] ^ 0x84
    final[17] = input_str[17] ^ 0x98
    final[40] = input_str[18] ^ 0xB7
    final[91] = input_str[19] ^ 0xBF
    final[88] = input_str[20] ^ 0x9E
    final[71] = input_str[21] ^ 0xE7
    final[27] = input_str[22] ^ 0xE5
    final[24] = input_str[23] ^ 0x85
    final[58] = input_str[24] ^ 0x67
    final[11] = input_str[25] ^ 0xE9
    final[22] = input_str[26] ^ 0x47
    final[19] = input_str[27] ^ 0xFA
    final[66] = input_str[28] ^ 0x95
    final[82] = input_str[29] ^ 0x90
    final[62] = input_str[30] ^ 0xDC
    final[13] = input_str[31] ^ 0xF6
    final[69] = input_str[32] ^ 0x58
    final[70] = input_str[33] ^ 0x4F
    final[26] = input_str[34] ^ 0xBD
    final[81] = input_str[35] ^ 0xB9
    final[42] = input_str[36] ^ 0x23
    final[46] = input_str[37] ^ 0x10
    final[41] = input_str[38] ^ 0xAD
    final[47] = input_str[39] ^ 0x2C
    final[83] = input_str[40] ^ 0xAF
    final[60] = input_str[41] ^ 0x5A
    final[57] = input_str[42] ^ 0xAF
    final[76] = input_str[43] ^ 0x70
    final[43] = input_str[44] ^ 0x12
    final[32] = input_str[45] ^ 0x38
    final[23] = input_str[46] ^ 0xE2
    final[12] = input_str[47] ^ 0x4F
    final[31] = input_str[48] ^ 0x42
    final[25] = input_str[49] ^ 0x8E
    final[74] = input_str[50] ^ 0x8C
    final[67] = input_str[51] ^ 0xC5
    final[78] = input_str[52] ^ 0xB9
    final[30] = input_str[53] ^ 0xD7
    final[75] = input_str[54] ^ 0x6
    final[55] = input_str[55] ^ 0x39
    final[2] = input_str[56] ^ 0x31
    final[49] = input_str[57] ^ 0x1A
    final[90] = input_str[58] ^ 0x7E
    final[34] = input_str[59] ^ 0xFA
    final[6] = input_str[60] ^ 0x16
    final[10] = input_str[61] ^ 0x4
    final[84] = input_str[62] ^ 0x27
    final[45] = input_str[63] ^ 0xFD
    final[48] = input_str[64] ^ 0xF3
    final[9] = input_str[65] ^ 0x3F
    final[86] = input_str[66] ^ 0x6E
    final[38] = input_str[67] ^ 0xB8
    final[3] = input_str[68] ^ 0x55
    final[39] = input_str[69] ^ 0xF0
    final[89] = input_str[70] ^ 0x25
    final[73] = input_str[71] ^ 0xD9
    final[68] = input_str[72] ^ 0x2B
    final[63] = input_str[73] ^ 0x74
    final[5] = input_str[74] ^ 0xD9
    final[52] = input_str[75] ^ 0xBB
    final[54] = input_str[76] ^ 0xDA
    final[35] = input_str[77] ^ 0x1
    final[56] = input_str[78] ^ 0x52
    final[0] = input_str[79] ^ 0xD9
    final[72] = input_str[80] ^ 0xC4
    final[15] = input_str[81] ^ 0x8C
    final[1] = input_str[82] ^ 0xA0
    final[33] = input_str[83] ^ 0xB2
    final[29] = input_str[84] ^ 0xED
    final[28] = input_str[85] ^ 0xB6
    final[14] = input_str[86] ^ 0xD6
    final[53] = input_str[87] ^ 0x6E
    final[20] = input_str[88] ^ 0xAF
    final[4] = input_str[89] ^ 0xD5
    final[50] = input_str[90] ^ 0x45
    final[65] = input_str[91] ^ 0xE3
    return final

def base64_4(input_str):
    std_alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
    custom_alphabet = "Bq_kT8haNFewAgfIxJycd37oOYXiSRvlP2tU1WmE5MCKnVr-psGjL60uZ4zDQHb9"
    DECODE_TRANS = str.maketrans(custom_alphabet, std_alphabet)
    aux = print_as_char(input_str).translate(DECODE_TRANS)
    print("aux = %s" % aux)
    final = base64.b64decode(aux)
    return str_to_intlist(final)

def dechiffre_3(input_str):
    final = list()
    for i in input_str:
        final.append(0)
    final[19] = input_str[0] ^ 0x65
    final[37] = input_str[1] ^ 0xBF
    final[58] = input_str[2] ^ 0x61
    final[44] = input_str[3] ^ 0xE2
    final[66] = input_str[4] ^ 0xFA
    final[64] = input_str[5] ^ 0x81
    final[3] = input_str[6] ^ 0x42
    final[18] = input_str[7] ^ 0xE3
    final[14] = input_str[8] ^ 0xCA
    final[33] = input_str[9] ^ 0x2A
    final[0] = input_str[10] ^ 0x2E
    final[60] = input_str[11] ^ 0x72
    final[9] = input_str[12] ^ 0xAB
    final[16] = input_str[13] ^ 0x70
    final[52] = input_str[14] ^ 0xB
    final[41] = input_str[15] ^ 0x38
    final[22] = input_str[16] ^ 0x30
    final[56] = input_str[17] ^ 0xD6
    final[63] = input_str[18] ^ 0xE3
    final[62] = input_str[19] ^ 0x30
    final[49] = input_str[20] ^ 0x2D
    final[17] = input_str[21] ^ 0x97
    final[25] = input_str[22] ^ 0xF1
    final[8] = input_str[23] ^ 0xD8
    final[43] = input_str[24] ^ 0x95
    final[4] = input_str[25] ^ 0x53
    final[27] = input_str[26] ^ 0x80
    final[6] = input_str[27] ^ 0xFE
    final[28] = input_str[28] ^ 0xAD
    final[46] = input_str[29] ^ 0xA
    final[61] = input_str[30] ^ 0xCA
    final[34] = input_str[31] ^ 0x2F
    final[20] = input_str[32] ^ 0xB3
    final[5] = input_str[33] ^ 0xAF
    final[39] = input_str[34] ^ 0xC4
    final[12] = input_str[35] ^ 0x6C
    final[55] = input_str[36] ^ 0x4B
    final[11] = input_str[37] ^ 0x81
    final[65] = input_str[38] ^ 0xD2
    final[23] = input_str[39] ^ 0x84
    final[13] = input_str[40] ^ 0xD4
    final[7] = input_str[41] ^ 0x6C
    final[59] = input_str[42] ^ 0xC0
    final[53] = input_str[43] ^ 0xA5
    final[35] = input_str[44] ^ 0x97
    final[42] = input_str[45] ^ 0x72
    final[2] = input_str[46] ^ 0xC7
    final[24] = input_str[47] ^ 0xD4
    final[51] = input_str[48] ^ 0x60
    final[67] = input_str[49] ^ 0x3B
    final[31] = input_str[50] ^ 0x19
    final[21] = input_str[51] ^ 0xF8
    final[45] = input_str[52] ^ 0x25
    final[54] = input_str[53] ^ 0xDE
    final[47] = input_str[54] ^ 0x41
    final[1] = input_str[55] ^ 0x96
    final[40] = input_str[56] ^ 0x1B
    final[36] = input_str[57] ^ 0x7E
    final[29] = input_str[58] ^ 0xA8
    final[10] = input_str[59] ^ 0x21
    final[50] = input_str[60] ^ 0xE2
    final[30] = input_str[61] ^ 0x38
    final[48] = input_str[62] ^ 0x28
    final[57] = input_str[63] ^ 0x0
    final[15] = input_str[64] ^ 0xFC
    final[32] = input_str[65] ^ 0xD9
    final[26] = input_str[66] ^ 0xDC
    final[38] = input_str[67] ^ 0xF3
    return final

def base64_2(input_str):
    std_alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
    custom_alphabet = "QwL9EJuySpO2GUXq4AnK6xRdtjslI_M-vVFHehCcf85gNk3mz0rPBTYib1WZoaD7"
    DECODE_TRANS = str.maketrans(custom_alphabet, std_alphabet)
    aux = print_as_char(input_str).translate(DECODE_TRANS)
    print("aux = %s" % aux)
    final = base64.b64decode(aux)
    return str_to_intlist(final)

def dechiffre_1(input_str):
    final = list()
    for i in input_str:
        final.append(0)
    final[18] = input_str[0] ^ 0xEC
    final[40] = input_str[1] ^ 0xA2
    final[5] = input_str[2] ^ 0x15
    final[29] = input_str[3] ^ 0x2
    final[16] = input_str[4] ^ 0xE4
    final[41] = input_str[5] ^ 0x9D
    final[33] = input_str[6] ^ 0x86
    final[6] = input_str[7] ^ 0x53
    final[43] = input_str[8] ^ 0x27
    final[44] = input_str[9] ^ 0x3B
    final[0] = input_str[10] ^ 0x24
    final[9] = input_str[11] ^ 0x46
    final[11] = input_str[12] ^ 0xB6
    final[20] = input_str[13] ^ 0x12
    final[47] = input_str[14] ^ 0xBC
    final[30] = input_str[15] ^ 0xC3
    final[4] = input_str[16] ^ 0x5B
    final[24] = input_str[17] ^ 0x2B
    final[10] = input_str[18] ^ 0x99
    final[38] = input_str[19] ^ 0x1C
    final[14] = input_str[20] ^ 0x5F
    final[25] = input_str[21] ^ 0x47
    final[22] = input_str[22] ^ 0xF7
    final[2] = input_str[23] ^ 0xAD
    final[21] = input_str[24] ^ 0x2C
    final[39] = input_str[25] ^ 0x33
    final[42] = input_str[26] ^ 0xDF
    final[1] = input_str[27] ^ 0x39
    final[45] = input_str[28] ^ 0xA5
    final[35] = input_str[29] ^ 0x49
    final[19] = input_str[30] ^ 0x9F
    final[7] = input_str[31] ^ 0x7F
    final[26] = input_str[32] ^ 0xAE
    final[27] = input_str[33] ^ 0x84
    final[12] = input_str[34] ^ 0xB8
    final[32] = input_str[35] ^ 0xB9
    final[15] = input_str[36] ^ 0x98
    final[23] = input_str[37] ^ 0x22
    final[46] = input_str[38] ^ 0x63
    final[13] = input_str[39] ^ 0xB7
    final[3] = input_str[40] ^ 0x8B
    final[17] = input_str[41] ^ 0xB2
    final[34] = input_str[42] ^ 0xBE
    final[31] = input_str[43] ^ 0xFA
    final[36] = input_str[44] ^ 0xE7
    final[8] = input_str[45] ^ 0x1F
    final[28] = input_str[46] ^ 0xF4
    final[37] = input_str[47] ^ 0x14
    return final

def base64_0(input_str):
    std_alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
    custom_alphabet = "B_p072neYwLU-MW94xZHahRsEO5VJPrgiFyu1Dk3ltIdvcCGmKSjb8Nqo6zQTfXA"
    DECODE_TRANS = str.maketrans(custom_alphabet, std_alphabet)
    aux = print_as_char(input_str).translate(DECODE_TRANS)
    print("aux = %s" % aux)
    final = base64.b64decode(aux)
    return str_to_intlist(final)

final_b64 = "ZvhdxFZGZaN/M1IvAD8qaJI9UQqPluT45250BfOZPygRl68GGZqZ7QS+GTFUGcONT8r7cEkTh8gSgELMXdcURGPb25wfCIrVG6ptrLr6GJ9IpBeLP40Gu1VKwZJtdw75ud+LNgXop0KE4CGm8cCx6eqwnAFioKvBkJQEjQ=="
final_final = [0x66,0xf8,0x5d,0xc4,0x56,0x46,0x65,0xa3,0x7f,0x33,0x52,0x2f,0x00,0x3f,0x2a,0x68,0x92,0x3d,0x51,0x0a,0x8f,0x96,0xe4,0xf8,0xe7,0x6e,0x74,0x05,0xf3,0x99,0x3f,0x28,0x11,0x97,0xaf,0x06,0x19,0x9a,0x99,0xed,0x04,0xbe,0x19,0x31,0x54,0x19,0xc3,0x8d,0x4f,0xca,0xfb,0x70,0x49,0x13,0x87,0xc8,0x12,0x80,0x42,0xcc,0x5d,0xd7,0x14,0x44,0x63,0xdb,0xdb,0x9c,0x1f,0x08,0x8a,0xd5,0x1b,0xaa,0x6d,0xac,0xba,0xfa,0x18,0x9f,0x48,0xa4,0x17,0x8b,0x3f,0x8d,0x06,0xbb,0x55,0x4a,0xc1,0x92,0x6d,0x77,0x0e,0xf9,0xb9,0xdf,0x8b,0x36,0x05,0xe8,0xa7,0x42,0x84,0xe0,0x21,0xa6,0xf1,0xc0,0xb1,0xe9,0xea,0xb0,0x9c,0x01,0x62,0xa0,0xab,0xc1,0x90,0x94,0x04,0x8d]

# Final
print(len(final_final))
# Final 8
final_8 = dechiffre_9(final_final)
print(final_8)
# Final 7
final_7 = dechiffre_8(final_8)
print(final_7)
# Final 6
final_6 = dechiffre_7(final_7)
print(final_6)
# Final 5
final_5 = base64_6(final_6)
print(final_5)
print(len(final_5[:-1]))
print_as_char(final_5)
# Final 4
final_4 = dechiffre_5(final_5[:-1])
print_as_char(final_4)
# Final 3
final_3 = base64_4(final_4)
print(len(final_3[:-1]))
# Final 2
final_2 = dechiffre_3(final_3[:-1])
print_as_char(final_2)
# Finale 1
final_1 = base64_2(final_2)
print(len(final_1))
# Final 0
final_0 = dechiffre_1(final_1)
print_as_char(final_0)
# Input
input_ori = base64_0(final_0)
print()
print("Flag :
print_as_char(input_ori)



#print("0..............")
#print("%s > %s > %s > %s (%s)" % (hex(final_final[0]),hex(final_8[5]),hex(final_7[17]),hex(final_6[45]),chr(final_6[45])))
#print(final_final)
