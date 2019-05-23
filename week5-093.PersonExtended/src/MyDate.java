
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
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

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differneceInYears(MyDate compared) {
        int difference = year - compared.year;
        MyDate biggerDate;
        MyDate smallerDate;
        
        if (difference == 0) {
            return 0;
        } else if (difference > 0) {
            biggerDate = this;
            smallerDate = compared;
        } else {
            biggerDate = compared;
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
