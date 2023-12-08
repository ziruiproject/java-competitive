package CompetitiveProgramming;

public class Scramble {
    public static void main(String[] args) {
        System.out.println(scramble("aabbcamaomsccdd", "commas"));
    }

    public static boolean scramble(String random, String expected) {
        char[] arrRandom = new char[random.length()];
        char[] arrExpected = new char[expected.length()];

        for (int i = 0; i < random.length(); i++) {
            arrRandom[i] = random.charAt(i);
        }

        for (int i = 0; i < expected.length(); i++) {
            arrExpected[i] = expected.charAt(i);
        }

        for (int i = 0; i < arrExpected.length; i++) {
            for (int j = 0; j < arrRandom.length; j++) {
                if (!random.contains(String.valueOf(arrExpected[i]))) {
                    System.out.println(random + " doesnt contain " + arrExpected[i]);
                    return false;
                }
            }
        }

        for (int i = 0; i < arrExpected.length; i++) {
            for (int j = 0; j < arrRandom.length; j++) {
                if (arrExpected[i] == arrRandom[j]) {
                    arrRandom[j] = '_';
                    arrExpected[i] = '_';
                }
            }
        }

        for (int i = 0; i < arrExpected.length; i++) {
            if (arrExpected[i] != '_') {
                return false;
            }
        }
        return true;
    }
}
