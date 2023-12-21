package edu.school21.printer.logic;

import com.diogonunes.jcolor.AnsiFormat;

public class Printer {
    public static void print(edu.school21.printer.logic.Matrix pixels, AnsiFormat fWhite, AnsiFormat fBlack) {
        for (int i = 0; i != pixels.rows; i++) {
            for (int j = 0; j != pixels.cols; j++) {
                if (pixels.matrix[i][j] == 255) System.out.print(fWhite.format("  "));
                else System.out.print(fBlack.format("  "));
            }
            System.out.println();
        }
    }
}
