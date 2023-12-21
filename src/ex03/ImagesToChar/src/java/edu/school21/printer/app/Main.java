package edu.school21.printer.app;
import com.beust.jcommander.JCommander;
import com.diogonunes.jcolor.AnsiFormat;
import edu.school21.printer.logic.Logic;
import edu.school21.printer.logic.Matrix;
import edu.school21.printer.logic.Printer;
import java.awt.*;
import java.io.IOException;
import java.util.Map;
import static com.diogonunes.jcolor.Attribute.*;

public class Main {

    static Map<String, Color> ColorMap() {
        return Map.of("black", Color.BLACK, "red", Color.RED,
                "green", Color.green, "yellow", Color.yellow, "blue", Color.blue, "pink", Color.pink, "white", Color.white);
    }

    public static void main(String[] args) throws IOException {
        Args argv = new Args();
        JCommander.newBuilder()
                .addObject(argv)
                .build()
                .parse(args);
        final Matrix pixels = Logic.convertToMatrix("./target/resources/it.bmp");
        AnsiFormat fWhite = new AnsiFormat(NONE(), BACK_COLOR(ColorMap().get(argv.white.toLowerCase()).getRed(),ColorMap().get(argv.white.toLowerCase()).getGreen(),ColorMap().get(argv.white.toLowerCase()).getBlue()),BOLD());
        AnsiFormat fBlack = new AnsiFormat(NONE(), BACK_COLOR(ColorMap().get(argv.black.toLowerCase()).getRed(),ColorMap().get(argv.black.toLowerCase()).getGreen(),ColorMap().get(argv.black.toLowerCase()).getBlue()),BOLD());
        Printer.print(pixels,fWhite,fBlack);
    }
}

