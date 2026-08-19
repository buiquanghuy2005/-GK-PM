public class StudentScore {

    public static String evaluate(int[] scores) {
        int total = 0;

        for (int score : scores) {
            total += score;
        }

        if (total >= 15) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        int[] scores = {7, 8, 6};
        System.out.println("Result: " + evaluate(scores));
    }
}
