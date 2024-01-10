import java.time.LocalDate;
import java.util.Scanner;

public class Midterm {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a short date (YYYY-MM-DD): ");
        String shortDate = input.next();

        LocalDate date = LocalDate.parse(shortDate);

        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        String monthName = getMonthName(month);

        String fullDate = monthName + " " + day + ", " + year;
        System.out.println("Full date: " + fullDate);
    }

    private static String getMonthName(int month) {
        String[] monthNames = {
                "", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
                "November", "December"
        };
        return monthNames[month];
    }
}
