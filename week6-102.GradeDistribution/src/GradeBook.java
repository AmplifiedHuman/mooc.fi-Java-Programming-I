public class GradeBook {

    private int[] grades;
    private int numberOfStudents;

    public GradeBook() {
        grades = new int[6];
        numberOfStudents = 0;
    }

    public void addScore(int score) {
        if (score >= 0 && score <= 60) {
            processGrade(score);
            numberOfStudents++;
        }
    }

    public void printSummary() {
        System.out.println("Grade distribution: ");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            printStars(grades[i]);
        }
        System.out.println("Acceptance percentage: " + acceptanceRate());
    }

    private void processGrade(int score) {
        if (score <= 29) {
            grades[0]++;
        } else if (score <= 34) {
            grades[1]++;
        } else if (score <= 39) {
            grades[2]++;
        } else if (score <= 44) {
            grades[3]++;
        } else if (score <= 49) {
            grades[4]++;
        } else {
            grades[5]++;
        }
    }

    private double acceptanceRate() {
        return 100 - (100 * (double) grades[0] / numberOfStudents);
    }

    private void printStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
