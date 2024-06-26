package devices.NXT;

// C64 font: http://www.dafont.com/commodore-64-pixelized.font?text=D
// Binary to Hexadecimal Converter: 
//   http://www.mathsisfun.com/binary-decimal-hexadecimal-converter.html

public class C64Font {

    static byte[][] fonts =
            {
                    /*0: end mark */
                    {0x00, (byte) 0x7e, (byte) 0x42, (byte) 0x42, (byte) 0x42, (byte) 0x42, (byte) 0x7e, 0x00},

                    /*1: A */ {0x00, (byte) 0xf8, (byte) 0xfc, (byte) 0x16, (byte) 0x16, (byte) 0xfc, (byte) 0xf8, 0x00},
                    /*2: B */ {0x00, (byte) 0xfe, (byte) 0xfe, (byte) 0x92, (byte) 0x92, (byte) 0xfe, (byte) 0x6c, 0x00},
                    /* C */ {0x00, (byte) 0x7c, (byte) 0xfe, (byte) 0x82, (byte) 0x82, (byte) 0xc6, (byte) 0x44, 0x00},
                    /* D */ {0x00, (byte) 0xfe, (byte) 0xfe, (byte) 0x82, (byte) 0xc6, (byte) 0x7c, (byte) 0x38, 0x00},
                    /* E */ {0x00, (byte) 0xfe, (byte) 0xfe, (byte) 0x92, (byte) 0x92, (byte) 0x82, (byte) 0x82, 0x00},
                    /* F */ {0x00, (byte) 0xfe, (byte) 0xfe, (byte) 0x12, (byte) 0x12, (byte) 0x02, (byte) 0x02, 0x00},
                    /* G */ {0x00, (byte) 0x7c, (byte) 0xfe, (byte) 0x82, (byte) 0x92, (byte) 0xf6, (byte) 0x74, 0x00},
                    /* H */ {0x00, (byte) 0xfe, (byte) 0xfe, (byte) 0x10, (byte) 0x10, (byte) 0xfe, (byte) 0xfe, 0x00},

                    /* I */ {0x00, (byte) 0x00, (byte) 0x82, (byte) 0xfe, (byte) 0xfe, (byte) 0x82, (byte) 0x00, 0x00},
                    /* J */ {0x00, (byte) 0x40, (byte) 0xc0, (byte) 0x82, (byte) 0xfe, (byte) 0x7e, (byte) 0x02, 0x00},

                    /* K */ {0x00, (byte) 0xfe, (byte) 0xfe, (byte) 0x38, (byte) 0x6c, (byte) 0xc6, (byte) 0x82, 0x00},
                    /* L */ {0x00, (byte) 0xfe, (byte) 0xfe, (byte) 0x80, (byte) 0x80, (byte) 0x80, (byte) 0x80, 0x00},

                    /* M */ {0x00, (byte) 0xfe, (byte) 0xfe, (byte) 0x0c, (byte) 0x18, (byte) 0x0c, (byte) 0xfe, (byte) 0xfe},
                    /* N */ {0x00, (byte) 0xfe, (byte) 0xfe, (byte) 0x1c, (byte) 0x38, (byte) 0xfe, (byte) 0xfe, 0x00},

                    /* O */ {0x00, (byte) 0x7c, (byte) 0xfe, (byte) 0x82, (byte) 0x82, (byte) 0xfe, (byte) 0x7c, 0x00},
                    /* P */ {0x00, (byte) 0xfe, (byte) 0xfe, (byte) 0x12, (byte) 0x12, (byte) 0x1e, (byte) 0x0c, 0x00},

                    /* Q */ {0x00, (byte) 0x3c, (byte) 0x7e, (byte) 0x42, (byte) 0xc2, (byte) 0xfe, (byte) 0xbc, 0x00},

                    /* R */ {0x00, (byte) 0xfe, (byte) 0xfe, (byte) 0x32, (byte) 0x72, (byte) 0xde, (byte) 0x8c, 0x00},

                    /* S */ {0x00, (byte) 0x4c, (byte) 0xde, (byte) 0x92, (byte) 0x92, (byte) 0xf6, (byte) 0x64, 0x00},

                    /* T */ {0x00, (byte) 0x02, (byte) 0x02, (byte) 0xfe, (byte) 0xfe, (byte) 0x02, (byte) 0x02, 0x00},

                    /* U */ {0x00, (byte) 0x7e, (byte) 0xfe, (byte) 0x80, (byte) 0x80, (byte) 0xfe, (byte) 0x7e, 0x00},

                    /* V */ {0x00, (byte) 0x3e, (byte) 0x7e, (byte) 0xc0, (byte) 0xc0, (byte) 0x7e, (byte) 0x3e, 0x00},

                    /* W */ {0x00, (byte) 0xfe, (byte) 0xfe, (byte) 0x60, (byte) 0x30, (byte) 0x60, (byte) 0xfe, (byte) 0xfe},

                    /* X */ {0x00, (byte) 0xc6, (byte) 0xee, (byte) 0x38, (byte) 0x38, (byte) 0xee, (byte) 0xc6, 0x00},

                    /* Y */ {0x00, (byte) 0x0e, (byte) 0x1e, (byte) 0xf0, (byte) 0xf0, (byte) 0x1e, (byte) 0x0e, 0x00},

                    /*26: Z */ {0x00, (byte) 0xc2, (byte) 0xe2, (byte) 0xb2, (byte) 0x9a, (byte) 0x8e, (byte) 0x86, 0x00},

                    /*27: 0 */ {0x00, (byte) 0x7c, (byte) 0xfe, (byte) 0x92, (byte) 0x8a, (byte) 0xfe, (byte) 0x7c, 0x00},
                    /*    1 */ {0x00, (byte) 0x80, (byte) 0x88, (byte) 0xfe, (byte) 0xfe, (byte) 0x80, (byte) 0x80, 0x00},
                    /*    2 */ {0x00, (byte) 0xc4, (byte) 0xe6, (byte) 0xa2, (byte) 0x92, (byte) 0x9e, (byte) 0x8c, 0x00},
                    /*    3 */ {0x00, (byte) 0x44, (byte) 0xc6, (byte) 0x92, (byte) 0x92, (byte) 0xfe, (byte) 0x6c, 0x00},
                    /*    4 */ {0x00, (byte) 0x30, (byte) 0x38, (byte) 0x2c, (byte) 0xfe, (byte) 0xfe, (byte) 0x20, 0x00},
                    /*    5 */ {0x00, (byte) 0x4e, (byte) 0xce, (byte) 0x8a, (byte) 0x8a, (byte) 0xfa, (byte) 0x72, 0x00},
                    /*    6 */ {0x00, (byte) 0x7c, (byte) 0xfe, (byte) 0x92, (byte) 0x92, (byte) 0xf6, (byte) 0x64, 0x00},
                    /*    7 */ {0x00, (byte) 0x02, (byte) 0x02, (byte) 0xf2, (byte) 0xfa, (byte) 0x0e, (byte) 0x06, 0x00},
                    /*    8 */ {0x00, (byte) 0x6c, (byte) 0xfe, (byte) 0x92, (byte) 0x92, (byte) 0xfe, (byte) 0x6c, 0x00},
                    /*36: 9 */ {0x00, (byte) 0x4c, (byte) 0xde, (byte) 0x92, (byte) 0x92, (byte) 0xfe, (byte) 0x7c, 0x00},

                    /*37: + */ {0x00, (byte) 0x10, (byte) 0x10, (byte) 0x7c, (byte) 0x7c, (byte) 0x10, (byte) 0x10, 0x00},
                    /*    , */ {0x00, (byte) 0x00, (byte) 0x80, (byte) 0xe0, (byte) 0x60, (byte) 0x00, (byte) 0x00, 0x00},
                    /*    - */ {0x00, (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0x10, 0x00},
                    /*    . */ {0x00, (byte) 0x00, (byte) 0x00, (byte) 0x60, (byte) 0x60, (byte) 0x00, (byte) 0x00, 0x00},
                    /*41: / */ {0x00, (byte) 0x80, (byte) 0xc0, (byte) 0x60, (byte) 0x30, (byte) 0x18, (byte) 0x0c, 0x04},

                    /*42 : */ {0x00, (byte) 0x00, (byte) 0x00, (byte) 0x6c, (byte) 0x6c, (byte) 0x00, (byte) 0x00, 0x00},
                    /*   ; */ {0x00, (byte) 0x00, (byte) 0x80, (byte) 0xec, (byte) 0xec, (byte) 0x00, (byte) 0x00, 0x00},
                    /*   < */ {0x00, (byte) 0x10, (byte) 0x38, (byte) 0x6c, (byte) 0xc6, (byte) 0x82, (byte) 0x82, 0x00},
                    /*   = */ {0x00, (byte) 0x00, (byte) 0x28, (byte) 0x28, (byte) 0x28, (byte) 0x28, (byte) 0x00, 0x00},
                    /*46 > */ {0x00, (byte) 0x82, (byte) 0x82, (byte) 0xc6, (byte) 0x6c, (byte) 0x38, (byte) 0x10, 0x00},
                    /*47 ? */ {0x00, (byte) 0x04, (byte) 0x06, (byte) 0xa2, (byte) 0xb2, (byte) 0x1e, (byte) 0x0c, 0x00},

                    /*48 SPACE */
                    {0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 0x00}

            };

    static final byte SPACE = 32;

    static final byte PLUS = 43;
    static final byte COMMA = 44;
    static final byte MINUS = 45;
    static final byte FULLSTOP = 46;
    static final byte SLASH = 47;

    static final byte COLON = 58;
    static final byte SEMICOLON = 59;
    static final byte LESS_THAN = 60;
    static final byte EQUALS_SIGN = 61;
    static final byte GREATER_THAN = 62;
    static final byte QUESTION_MARK = 63;

    public static byte[] get(char c) {
        if (isDigit(c)) {
            return fonts[(byte) (c - '0' + 27)];
        } else if (isLowerCase(c)) {
            return fonts[(byte) (c - 'A' - 32 + 1)];
        } else if (isUpperCase(c)) {
            return fonts[(byte) (c - 'A' + 1)];
        } else {
            switch (c) {
                case PLUS:
                    return fonts[37];
                case COMMA:
                    return fonts[38];
                case MINUS:
                    return fonts[39];
                case FULLSTOP:
                    return fonts[40];
                case SLASH:
                    return fonts[41];

                case COLON:
                    return fonts[42];
                case SEMICOLON:
                    return fonts[43];
                case LESS_THAN:
                    return fonts[44];
                case EQUALS_SIGN:
                    return fonts[45];
                case GREATER_THAN:
                    return fonts[46];
                case QUESTION_MARK:
                    return fonts[47];

                case SPACE:
                    return fonts[48];

                default:
                    return fonts[0];
            }
        }
    }

    public static boolean isDigit(char c) {
        if (48 <= c && c <= 57)
            return true;
        return false;
    }

    public static boolean isLowerCase(char c) {
        if (97 <= c && c <= 122)
            return true;
        return false;
    }

    public static boolean isUpperCase(char c) {
        if (65 <= c && c <= 90)
            return true;
        return false;
    }

}
