
public class Bowler extends Player {
    private int ballsBowled;
    private int runsConceded;
    private int wickets;
    public Bowler(String name, int ballsBowled, int runsConceded, int wickets) {
        super(name);
        this.ballsBowled = ballsBowled;
        this.runsConceded = runsConceded;
        this.wickets = wickets;
    }
    public double getAverage() {
        return wickets > 0 ? (double) runsConceded / wickets : runsConceded;
    }
    public double getEconomyRate() {
        return ballsBowled > 0 ? (double)runsConceded / (ballsBowled/6.0) : 0;
    }
}