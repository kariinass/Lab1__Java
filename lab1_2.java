import java.util.Scanner;

public class lab1_2 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите день (число): ");
        int day = in.nextInt();

        System.out.print("Введите месяц (число): ");
        int month = in.nextInt();

        if (month <= 2 || month == 12) {
            System.out.println("зима");
        }
        else if (month <= 5){
            System.out.println("весна");
        }
        else if (month <= 8){
            System.out.println("лето");
        }
        else{
            System.out.println("осень");
        }
        in.close();
    }
}
