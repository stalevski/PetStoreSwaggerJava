package randomDataGenerator;

import java.util.List;
import java.util.Random;

public class RandomDataGenerator {
    private static final Random random = new Random();

    public static int generateRandomInt(int bound) {
        return random.nextInt(bound);
    }

    public static int generateRandomIntBetween(int minInclusive, int maxExclusive) {
        if (minInclusive >= maxExclusive) {
            throw new IllegalArgumentException("Min value must be less than max value");
        }
        return random.nextInt(maxExclusive - minInclusive) + minInclusive;
    }

    public static double generateRandomDouble() {
        return random.nextDouble();
    }

    public static String generateRandomString(int length) {
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char randomChar = (char) ('a' + random.nextInt(26));
            stringBuilder.append(randomChar);
        }
        return stringBuilder.toString();
    }

    public static boolean generateRandomBoolean() {
        return random.nextBoolean();
    }

    public static String generateRandomAlphanumericString(int length) {
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char randomChar;
            if (random.nextBoolean()) {
                // Generate a random digit
                randomChar = (char) ('0' + random.nextInt(10));
            } else {
                // Generate a random uppercase or lowercase letter
                randomChar = (char) ('a' + random.nextInt(26));
                if (random.nextBoolean()) {
                    randomChar = Character.toUpperCase(randomChar);
                }
            }
            stringBuilder.append(randomChar);
        }
        return stringBuilder.toString();
    }

    public static <T> T getRandomListItem(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex);
    }

    // Method to generate a random long
    public static long generateRandomLong() {
        Random random = new Random();
        return random.nextLong();
    }

    // Method to generate a random long within a specified range
    public static long generateRandomLongInRange(long min, long max) {
        Random random = new Random();
        return min + ((long) (random.nextDouble() * (max - min + 1)));
    }
}
