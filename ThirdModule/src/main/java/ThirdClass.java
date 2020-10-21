import java.util.Objects;


public class ThirdClass {

    private static final int MIN_DAY = 0;
    private static final int MAX_DAY = 31;
    private static final int MIN_MONTH = 0;
    private static final int MAX_MONTH = 12;
    private static final int MIN_YEAR = 0;

    private int day;
    private int month;
    private int year;

    public ThirdClass(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public ThirdClass() {
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < MIN_DAY || day > MAX_DAY) {
            throw new IllegalArgumentException("Incorrect day range");
        }
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < MIN_MONTH || month > MAX_MONTH) {
            throw new IllegalArgumentException("Incorrect month range");
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < MIN_YEAR) {
            throw new IllegalArgumentException("Incorrect year range");
        }
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThirdClass that = (ThirdClass) o;
        return day == that.day &&
                month == that.month &&
                year == that.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    @Override
    public String toString() {
        return "ThirdClass{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public void printDate() {
        System.out.println("Date: " + day + ":" + month + ":" + year);
    }
}