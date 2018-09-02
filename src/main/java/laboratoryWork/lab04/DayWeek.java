package laboratoryWork.lab04;

public class DayWeek {
    public static void main(String[] args) {

    }

    public static String getDayOfTheWeek(int dayNum) {
        if (dayNum == 1) {
            return "Monday";
        } else if (dayNum == 2) {
            return "Tuesday";
        } else if (dayNum == 3) {
            return "Wednesday";
        } else if (dayNum == 4) {
            return "Thursday";
        } else if (dayNum == 5) {
            return "Friday";
        } else if (dayNum == 6) {
            return "Saturday";
        } else if (dayNum == 7) {
            return "Sunday";
        } else return "";
    }
}
