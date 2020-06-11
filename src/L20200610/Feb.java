package L20200610;

public class Feb {

    public static void main(String[] args) {
        System.out.println(FebDays(2100));
    }

    public static int FebDays(int year) {
        int days = 28;
        if(year % 4 == 0) {
            days = 29;
        }
        if(year % 100 == 0) {
            days = 28;
        }
        if (year % 400 == 0) {
            days = 29;
        }
        return days;
    }
}
