
import java.util.*;
public class Time {
    private int hour;
    private int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public Time addTime(Time t) {
        int h = this.hour + t.hour;
        int m = this.minute + t.minute;

        if (m >= 60) {
            h += m / 60;
            m %= 60;
        }

        return new Time(h, m);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", this.hour, this.minute);
    }

public static void main(String[] args) {
    Time time1 = new Time(2, 30);
    Time time2 = new Time(1, 45);

    Time sum = time1.addTime(time2);

    System.out.println("Time 1: " + time1.toString());
    System.out.println("Time 2: " + time2.toString());
    System.out.println("Sum: " + sum.toString());
}
}
//Define Time class with hour and minute as data member. Also define addition method to add two-time objects.