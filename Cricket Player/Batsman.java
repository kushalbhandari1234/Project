
public class Batsman extends Player {
    private int runs;
    private int balls;
    private int outs;
    public Batsman(String name, int runs, int balls, int outs) {
        super(name);
        this.runs = runs;
        this.balls = balls;
        this.outs = outs;
    }
    public double getAverage() {
        return outs > 0 ? (double)runs / outs : runs;
    }
    public double getStrikeRate() {
        return balls > 0 ? ((double)runs / balls) * 100 : 0;
    }
}