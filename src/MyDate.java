public class MyDate {
    private int month;
    private int day;
    private int year;

    public MyDate(int m, int d, int y) {
        setMonth(m);
        setDay(d);
        setYear(y);
    }

    public String toString() {
        return getMonth() + "/" + getDay() + "/" + getYear();
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int m) {
        if(m >= 1 && m <= 12) {
            month = m;
        }
    }

    public int getDay() {
        return day;
    }
    public void setDay(int d) {
        if(d >= 1 && d <= 31) {
            day = d;
        }
    }

    public int getYear() {
        return year;
    }
    public void setYear(int y) {
        year = y;
    }
}
