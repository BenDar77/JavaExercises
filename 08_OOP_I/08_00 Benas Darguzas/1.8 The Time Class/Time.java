public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int newHour) {
        if (newHour >= 0 && newHour <= 23) {
            this.hour = newHour;
        } else System.out.println("Hour is not valid");
    }

    public void setMinute(int newMinute) {
        if (newMinute >= 0 && newMinute <= 59) {
            this.minute = newMinute;
        } else System.out.println("Minute is not valid");
    }

    public void setSecond(int newSecond) {
        if (newSecond >= 0 && newSecond <= 59) {
            this.second = newSecond;
        } else System.out.println("Second is not valid");
    }

    public void setTime(int newHour, int newMinute, int newSecond) {
        if (newHour >= 0 && newHour <= 23) {
            if (newMinute >= 0 && newMinute <= 59) {
                if (newSecond >= 0 && newSecond <= 59) {
                    this.hour = newHour;
                    this.minute = newMinute;
                    this.second = newSecond;
                }
            }
        } else System.out.println("Time is not valid");
    }

    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public void nextSecond(){
        setTime(this.hour, this.minute, this.second +1);
    }

    public void previousSecond(){
        setTime(this.hour, this.minute, this.second -1);
    }
}
