public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        int difference = year - comparedDate.year;
        MyDate biggerDate;
        MyDate smallerDate;
        
        if (difference == 0) {
            return 0;
        } else if (difference > 0) {
            biggerDate = this;
            smallerDate = comparedDate;
        } else {
            biggerDate = comparedDate;
            smallerDate = this;
        }

        difference = Math.abs(difference);

        if (biggerDate.month < smallerDate.month) {
            difference--;
        } else if ((biggerDate.month == smallerDate.month) && biggerDate.day < smallerDate.day) {
            difference--;
        }
        return difference;
    }

}
