package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public static String getRandomColor() {
        int randomIndex = random.nextInt(Colors.values().length);
        return Colors.values()[randomIndex].name();
    }
}