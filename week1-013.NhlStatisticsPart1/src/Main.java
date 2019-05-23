
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        System.out.println("Top 10 based on goals:");
        NHLStatistics.sortByGoals(); 
        NHLStatistics.top(10);

        System.out.println("Top 25 based on penalties:");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("Sidney Crosby stats: ");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("Philadelphia Flyers: ");
        NHLStatistics.teamStatistics("PHI");

        System.out.println("Anageim Ducks ordered by points: ");
        NHLStatistics.sortByPoints(); 
        NHLStatistics.teamStatistics("ANA");
    }
}
