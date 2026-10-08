import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        double a;
        while (true) {
            System.out.print("Сторона квадрата a: ");
            if (in.hasNextDouble()) {
                a = in.nextDouble();
                if (a > 0 && !Double.isInfinite(a)) {
                    break;
                }
                System.out.println("Ошибка: сторона должна быть положительным числом.");
            } else {
                System.out.println("Ошибка: введите число (дробную часть через точку).");
                in.next();
            }
        }

        double s = a * a * (8 - Math.PI) / 16;
        System.out.printf(Locale.US, "Площадь заштрихованной части: %.4f%n", s);
    }
}