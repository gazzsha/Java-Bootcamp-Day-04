package edu.school21.printer.logic;

public class Printer {
    public static void print(edu.school21.printer.logic.Matrix pixels, char symbolWhite, char symbolBlack) {
        for (int i = 0; i != pixels.rows; i++) {
            for (int j = 0; j != pixels.cols; j++) {
                if (pixels.matrix[i][j] == 255) System.out.print(symbolWhite);
                else System.out.print(symbolBlack);
            }
            System.out.println();
        }
    }
}
