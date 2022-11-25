import java.util.Scanner;

public class lab1_3 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число х: ");
        int x2 = in.nextInt();

        System.out.print("Введите число n (степень числа х): ");
        int n = in.nextInt();

        double x = 1;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                x *= x2;
            }
        } else if (n == 0) {
            x = 1;
        }

        byte power = -1;
        if (n < 0) {
            while (power >= n) {
                x *= x2;
                power--;
            }
            x = 1/x;
        }
        System.out.println("Полученный результат: "+x);
    }
}
