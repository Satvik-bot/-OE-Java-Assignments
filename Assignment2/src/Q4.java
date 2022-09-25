public class Q4 {
    static void main() {
        double initialPopulation = 80000;
        int years = 0;

        // Increasing population at the rate of 5% annually and checking
        while (initialPopulation <= 150000) {
            initialPopulation = 1.05 * initialPopulation;
            years = years + 1;
        }

        System.out.println("Number of years: " + years);
    }
}
