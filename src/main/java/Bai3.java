import java.util.Scanner;

public class Bai3 {
    int readMonthNumber() throws MonthException {
        Scanner input = new Scanner(System.in);
        int month = 0;

        System.out.println("Nhập vào 1 tháng:");
        try {
            month = input.nextInt();
            if (month <= 0 || month > 12)
                throw new MonthException();
        } catch (Exception e) {
            throw new MonthException();
        }
        System.out.println(maximumDay(month));
        return month;

    }

    public static int maximumDay(int monthNumber) {

        switch (monthNumber) {
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
}