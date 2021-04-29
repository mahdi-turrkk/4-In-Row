package com.example.a4inrow;

import com.example.a4inrow.Taw;

public class Board {

    /*
    Taw.BLUE = XX
    Taw.RED  = OO

   this class include bordes and taws
     */

    public Taw[][] tawBoard = new Taw[6][7];

    public Board() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                tawBoard[i][j] = Taw.NULL;
            }
        }
    }

    /*
    to change variables manually
     */
    public void changeValue(int row, int col, Taw taw) {
        tawBoard[row][col] = taw;
    }

    /*
    check if the game is end or not and return boolean
     */
    public boolean scoreCheck() {

        // row score check
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if ((tawBoard[i][j] != Taw.NULL) &&
                        (tawBoard[i][j] == tawBoard[i][j + 1]) &&
                        (tawBoard[i][j] == tawBoard[i][j + 2]) &&
                        (tawBoard[i][j] == tawBoard[i][j + 3])) {
                    return true;
                }
            }
        }

        // column score check
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                if ((tawBoard[j][i] != Taw.NULL)
                        && (tawBoard[j][i] == tawBoard[j + 1][i])
                        && (tawBoard[j][i] == tawBoard[j + 2][i])
                        && (tawBoard[j][i] == tawBoard[j + 3][i])) {
                    return true;
                }
            }
        }

        // right-diagonal score check
        if ((tawBoard[2][0] != Taw.NULL) &&
                (tawBoard[2][0] == tawBoard[3][1]) &&
                (tawBoard[2][0] == tawBoard[4][2]) &&
                (tawBoard[2][0] == tawBoard[5][3])) {
            return true;
        }

        if ((tawBoard[0][3] != Taw.NULL) &&
                (tawBoard[0][3] == tawBoard[1][4]) &&
                (tawBoard[0][3] == tawBoard[2][5]) &&
                (tawBoard[0][3] == tawBoard[3][6])) {
            return true;
        }

        if ((tawBoard[0][1] != Taw.NULL) &&
                (tawBoard[0][1] == tawBoard[1][2]) &&
                (tawBoard[0][1] == tawBoard[2][3]) &&
                (tawBoard[0][1] == tawBoard[3][4])) {
            return true;
        }

        if ((tawBoard[1][2] != Taw.NULL) &&
                (tawBoard[1][2] == tawBoard[2][3]) &&
                (tawBoard[1][2] == tawBoard[3][4]) &&
                (tawBoard[1][2] == tawBoard[4][5])) {
            return true;
        }

        if ((tawBoard[0][2] != Taw.NULL) &&
                (tawBoard[0][2] == tawBoard[1][3]) &&
                (tawBoard[0][2] == tawBoard[2][4]) &&
                (tawBoard[0][2] == tawBoard[3][5])) {
            return true;
        }

        if ((tawBoard[1][3] != Taw.NULL) &&
                (tawBoard[1][3] == tawBoard[2][4]) &&
                (tawBoard[1][3] == tawBoard[3][5]) &&
                (tawBoard[1][3] == tawBoard[4][6])) {
            return true;
        }

        for (int i = 0; i < 3; i++) {
            if ((tawBoard[i][i] != Taw.NULL) &&
                    (tawBoard[i][i] == tawBoard[i + 1][i + 1]) &&
                    (tawBoard[i][i] == tawBoard[i + 2][i + 2]) &&
                    (tawBoard[i][i] == tawBoard[i + 3][i + 3])) {
                return true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if ((tawBoard[i][i + 1] != Taw.NULL) &&
                    (tawBoard[i][i + 1] == tawBoard[i + 1][i + 2]) &&
                    (tawBoard[i][i + 1] == tawBoard[i + 2][i + 3]) &&
                    (tawBoard[i][i + 1] == tawBoard[i + 3][i + 4])) {
                return true;
            }
        }

        // left-diagonal score check
        if ((tawBoard[5][3] != Taw.NULL) &&
                (tawBoard[5][3] == tawBoard[4][4]) &&
                (tawBoard[5][3] == tawBoard[3][5]) &&
                (tawBoard[5][3] == tawBoard[2][6])) {
            return true;
        }

        if ((tawBoard[3][0] != Taw.NULL) &&
                (tawBoard[3][0] == tawBoard[2][1]) &&
                (tawBoard[3][0] == tawBoard[1][2]) &&
                (tawBoard[3][0] == tawBoard[0][3])) {
            return true;
        }

        if ((tawBoard[5][2] != Taw.NULL) &&
                (tawBoard[5][2] == tawBoard[4][3]) &&
                (tawBoard[5][2] == tawBoard[3][4]) &&
                (tawBoard[5][2] == tawBoard[2][5])) {
            return true;
        }

        if ((tawBoard[4][3] != Taw.NULL) &&
                (tawBoard[4][3] == tawBoard[3][4]) &&
                (tawBoard[4][3] == tawBoard[2][5]) &&
                (tawBoard[4][3] == tawBoard[1][6])) {
            return true;
        }

        if ((tawBoard[4][0] != Taw.NULL) &&
                (tawBoard[4][0] == tawBoard[3][1]) &&
                (tawBoard[4][0] == tawBoard[2][2]) &&
                (tawBoard[4][0] == tawBoard[1][3])) {
            return true;
        }

        if ((tawBoard[3][1] != Taw.NULL) &&
                (tawBoard[3][1] == tawBoard[2][2]) &&
                (tawBoard[3][1] == tawBoard[1][3]) &&
                (tawBoard[3][1] == tawBoard[0][4])) {
            return true;
        }

        for (int i = 0; i < 3; i++) {
            if ((tawBoard[5 - i][i] != Taw.NULL) &&
                    (tawBoard[5 - i][i] == tawBoard[5 - i - 1][i + 1]) &&
                    (tawBoard[5 - i][i] == tawBoard[5 - i - 2][i + 2]) &&
                    (tawBoard[5 - i][i] == tawBoard[5 - i - 3][i + 3])) {
                return true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if ((tawBoard[5 - i][i + 1] != Taw.NULL) &&
                    (tawBoard[5 - i][i + 1] == tawBoard[5 - i - 1][i + 2]) &&
                    (tawBoard[5 - i][i + 1] == tawBoard[5 - i - 2][i + 3]) &&
                    (tawBoard[5 - i][i + 1] == tawBoard[5 - i - 3][i + 4])) {
                return true;
            }
        }

        return false;
    }

    /*
    set bottom row as the taw color
     */
    public boolean putTawBottom(int col, Taw taw) {
        for (int i = 5; i >= 0; i--) {
            if (tawBoard[i][col] == Taw.NULL) {
                tawBoard[i][col] = taw;
                return true;
            }
        }
        return false;
    }

    /*
    return bottom row index to fill that in ui
     */
    public int bottomRowIndex(int col) {
        for (int i = 5; i >= 0; i--) {
            if (tawBoard[i][col] == Taw.NULL) {
                return i;
            }
        }
        return -1;
    }

    /*
    printing the board and its not necceserry in final app
     */
//    public void printArea() {
//        String template = """
//
//                      C0   C1   C2   C3   C4   C5   C6
//                     ------------------------------------
//                 R0  | %s | %s | %s | %s | %s | %s | %s |
//                     ------------------------------------
//                 R1  | %s | %s | %s | %s | %s | %s | %s |
//                     ------------------------------------
//                 R2  | %s | %s | %s | %s | %s | %s | %s |
//                     ------------------------------------
//                 R3  | %s | %s | %s | %s | %s | %s | %s |
//                     ------------------------------------
//                 R4  | %s | %s | %s | %s | %s | %s | %s |
//                     ------------------------------------
//                 R5  | %s | %s | %s | %s | %s | %s | %s |
//                     ------------------------------------
//                                                """;
//        String[] values = new String[42];
//        int index = 0;
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 7; j++) {
//                if (tawBoard[i][j] == Taw.BLUE) {
//                    values[index] = "XX";
//                } else if (tawBoard[i][j] == Taw.RED) {
//                    values[index] = "OO";
//                } else {
//                    values[index] = "  ";
//                }
//                index++;
//            }
//        }
//        System.out.printf(template, values);
//    }
}
