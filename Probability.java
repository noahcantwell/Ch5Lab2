
public class Probability implements ProbabilityCalc
{
    private double probabilityChance;
    private double favorable;
    private double sampleSpace;
    
    public Probability(double fav, double sample) {
        this.favorable = fav;
        this.sampleSpace = sample;
        this.probabilityChance = fav/sample;
    }
    
    public double getterProbChance() {
        return probabilityChance;
    }
    
    public double probabilityAND(Probability prob2) {
        return (probabilityChance * prob2.getterProbChance());
    }
    
    public double probabilityOR(Probability prob2, double overlap) {
        return (probabilityChance + prob2.getterProbChance() - overlap);
    }
}
