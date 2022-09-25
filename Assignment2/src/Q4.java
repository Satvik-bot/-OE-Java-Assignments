public class Q4 {
    static void getAnswer() {
        double Population = 80000;

        int years = 0;
        while (Population <= 150000) {
            Population = 1.05 * Population;
            years = years + 1;
        }

        System.out.println("Number of years: " + years);
    }
}
