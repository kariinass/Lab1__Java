import java.util.Scanner;

public class lab1_4 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количетсво точек: ");
        int x = in.nextInt();

        System.out.print("Введите радиус окружности: ");
        int r = in.nextInt();

        byte k = 0;
        byte i = 1;
        while (i <= x) {
            System.out.print("Введите X " + i +  " точки: ");
            int x1 = in.nextInt();
            System.out.print("Введите Y " + i +  " точки: ");
            int y1 = in.nextInt();
            if ((x1*x1 + y1*y1) <= r*r) {
                k++;
            }
            i++;
        }
        System.out.print(k + " точек попали в окружность");
    }
}
