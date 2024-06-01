public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int newDay) {
        if (newDay >= 1 && newDay <= 31) {
            this.day = newDay;

        } else System.out.println("Day is not valid");
    }

    public void setMonth(int newMonth) {
        if (newMonth >= 1 && newMonth <= 12) {
            this.month = newMonth;
        } else System.out.println("Month is not valid");
    }

    public void setYear(int newYear) {
        if (newYear >= 1900 && newYear <= 9999) {
            this.year = newYear;
        } else System.out.println("Year is not valid");
    }

    public void setDate(int newDay, int newMonth, int newYear) {
        if (newDay >= 1 && newDay <= 31) {
            if (newMonth >= 1 && newMonth <= 12) {
                if (newYear >= 1900 && newYear <= 9999) {
                    this.day = newDay;
                    this.month = newMonth;
                    this.year = newYear;
                }
            }
        } else System.out.println("Date is not valid");
    }

    public String toString() {
        return String.format("%02d/%02d/%4d", month, day, year);
    }
}
