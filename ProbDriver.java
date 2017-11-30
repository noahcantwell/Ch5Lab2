public class ProbDriver {
    public static void main(String[] args) {
        Probability p1 = new Probability(1,10);
        Probability p2 = new Probability(1,10);
        System.out.println(p1.probabilityAND(p2));
        System.out.println(p1.probabilityOR(p2, p1.probabilityAND(p2)));
    }
}