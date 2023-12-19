package edu.school21.printer.logic;

public class Matrix {
    public int[][] matrix;
    public final int rows;
    public final int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
    }
}
