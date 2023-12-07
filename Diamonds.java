package CompetitiveProgramming;

public class Diamonds {
    public static void main(String[] args) {
        System.out.print(diamonds(27));
    }

    public static String diamonds(int n) {

        String result = "";

        if (n % 2 == 0 || n < 0) {
            return null;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            }
            result += " ".repeat((n - i) / 2);
            result += "*".repeat(i);
            result += "\n";
        }
        for (int i = n - 1; i >= 1; i--) {
            if (i % 2 == 0) {
                continue;
            }
            result += " ".repeat((n - i) / 2);
            result += "*".repeat(i);

            result += "\n";
        }
        return result;
    }
}
