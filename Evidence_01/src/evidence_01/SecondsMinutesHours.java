package evidence_01;

public class SecondsMinutesHours {

    public static void main(String[] args) {

        long totalMill = System.currentTimeMillis();
        long totalSeconds = totalMill / 1000;
        long curreentSeconds = totalSeconds % 60;
        long totaMinutes = totalSeconds / 60;
        long currentMinute = totaMinutes % 60;
        long totalHours = totaMinutes / 60;
        long currentHour = totalHours % 24;

        System.out.println("Xurrent time is " + currentHour + ":" + currentMinute + ":" + curreentSeconds + " GMT ");
    }
}
