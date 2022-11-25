import java.util.Scanner;

public class lab1_1 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите день рождения: ");
        int day_hb = in.nextInt();

        System.out.print("Введите месяц рождения: ");
        int month_hb = in.nextInt();

        System.out.print("Введите год рождения: ");
        int year_hb = in.nextInt();

        byte curr_day = 25;
        byte curr_month = 11;
        char curr_year = 2022;

        int years = (curr_year*365 - (12 - curr_month)*30 + curr_day - (year_hb*365 - (12 - month_hb)*30 + day_hb))/365;

        int months = ((curr_month-1)*30 + curr_day - ((month_hb-1)*31+day_hb+15)) / 30;

        if (months < 0) {
            months = ((month_hb-1)*30+day_hb - ((curr_month-1)*30+curr_day))/30+11;
        }
        int days = ((curr_month-1)*30+curr_day-((month_hb-1)*30+day_hb))%30;
        if (days < 0) {
            days = ((month_hb-1)*30+day_hb - (curr_month-1)*30-curr_day)%30;
        }
        in.close();
        System.out.println(years + " лет " + months + " месяцев " + days + " дней");
    }
}
