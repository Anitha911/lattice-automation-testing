package utils;

import java.time.LocalDate;
import java.util.Random;

public class RandomDateUtils {

    static Random random = new Random();

    public static LocalDate getRandomPastDate() {

        LocalDate today = LocalDate.now();

        int randomDays = random.nextInt(365);

        return today.minusDays(randomDays + 30);
    }

}
