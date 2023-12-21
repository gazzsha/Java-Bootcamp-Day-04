package edu.school21.printer.logic;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Logic {
    public static Matrix convertToMatrix(String path) throws IOException {
        BufferedImage bufferedImage;
        bufferedImage = ImageIO.read(new File(path));
        Matrix pixels = new Matrix(bufferedImage.getHeight(), bufferedImage.getWidth());
        for (int i = 0; i != bufferedImage.getWidth(); i++) {
            for (int j = 0; j != bufferedImage.getHeight(); j++) {
                pixels.matrix[i][j] = (bufferedImage.getRGB(j, i)) & 0xFF; // RGB. getRgb() -> 4 байтное, где первый
                // байт на альфа канал, т.к изображение ч/б можно брать любой канал, здесь B
            }
        }
        return pixels;
    }
}


