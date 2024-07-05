package core.basesyntax;

import java.util.Random;

public class Lottery extends  ColorSupplier {
    public static void getRandomBall() {
        Random random = new Random();
        int number = new Random().nextInt(100);
        ColorSupplier supplier = new ColorSupplier();
        System.out.println("Ball with color: " + supplier.getRandomColor() + " and with number: " + number);
    }
}