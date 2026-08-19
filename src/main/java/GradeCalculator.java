public class GradeCalculator {

    public static String calculateResult(int[] scores) {
        int sum = 0;

        for (int score : scores) {
            sum += score;
        }

        if (sum >= 15) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        int[] scores = {7, 8, 6};

        String result = calculateResult(scores);

        System.out.println("Result: " + result);
    }
}
