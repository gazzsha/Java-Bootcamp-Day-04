package edu.school21.printer.app;

import edu.school21.printer.logic.Logic;
import edu.school21.printer.logic.Matrix;
import edu.school21.printer.logic.Printer;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        final Matrix pixels = Logic.convertToMatrix(args[2]);
        Printer.print(pixels, args[0].charAt(0), args[1].charAt(0));
    }
}

