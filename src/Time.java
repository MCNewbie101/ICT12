import static java.lang.Math.abs;

public class Time {
    private int hour;
    private int minute;

    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
        secondForward(second);
        minuteForward(minute);
        hourForward(hour);
    }

    public void secondForward(int second) {
        this.second += second;
        if (this.second >= 60) {
            minuteForward(this.second / 60);
            this.second = this.second % 60;
        }
    }

    public void minuteForward(int minute) {
        this.minute += minute;
        if (this.minute >= 60) {
            hourForward(this.minute / 60);
            this.minute = this.minute % 60;
        }
    }

    public void hourForward(int hour) {
        this.hour += hour;
        this.hour = this.hour % 24;
    }

    public void secondBackward(int second) {
        this.second -= second;
        if (this.second < 0) {
            minuteBackward(abs(this.second) % 60);
            while (this.second < 0) {
                this.second += 60;
            }
        }
    }

    public void minuteBackward(int minute) {
        this.minute -= minute;
        if (this.minute < 0) {
            hourBackward(abs(this.minute % 60));
            while (this.minute < 0) {
                this.minute += 60;
            }
        }
    }

    public void hourBackward(int hour) {
        this.hour -= hour;
        while (this.hour < 0) {
            this.hour += 24;
        }
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
        secondForward(second);
        minuteForward(minute);
        hourForward(hour);
    }

    public Time nextSecond() {
        secondForward(1);
        return this;
    }

    public Time previousSecond() {
        secondBackward(1);
        return this;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        String string = "";
        if (hour < 10) {
            string += "0";
        }
        string += hour + ":";
        if (minute < 10) {
            string += "0";
        }
        string += minute + ":";
        if (second < 10) {
            string += "0";
        }
        string += second;
        return string;
    }
}
