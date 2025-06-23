public class ScoreReport {
    public static void main(String[] args) {

        String[] students = {"Titi", "Sade", "Zainab", "Kehinde", "Tayo", "Femi"};
        int[] scores = {75, 88, 66, 90, 45, 82};

        System.out.println("----STUDENT SCORE REPORT----\n");

        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;
        int passedCount = 0, failedCount = 0;
        int sum = 0;

        for (int i = 0; i < students.length; i++) {
            String name = students[i];
            int score = scores[i];
            String grade;
            String status;

            if (score >= 70 && score <= 100) {
                grade = "A";
                countA++;
            } else if (score >= 60 && score <= 69) {
                grade = "B";
                countB++;
            } else if (score >= 50 && score <= 59) {
                grade = "C";
                countC++;
            } else if (score >= 40 && score <= 49) {
                grade = "D";
                countD++;
            } else {
                grade = "F";
                countF++;
            }

            if (score >= 50) {
                passedCount++;
                status = "Pass";
            } else {
                failedCount++;
                status = "Failed";
            }

            sum += score;

            System.out.println(name + " scored " + score + " - Grade: " + grade + " - " + status);
        }

        // Average of the class
        int average = sum / scores.length;
        System.out.println("\nThe average of the class is " + average);

        // Top scorer of the class
        int topScore = scores[0];
        int topIndex = 0;

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > topScore) {
                topScore = scores[i];
                topIndex = i;
            }
        }

        System.out.println("The top student is " + students[topIndex] + " with a score of " + topScore);

        // Grade Summary
        System.out.println("\n----GRADE SUMMARY----");
        System.out.println(countA + " students scored A");
        System.out.println(countB + " students scored B");
        System.out.println(countC + " students scored C");
        System.out.println(countD + " students scored D");
        System.out.println(countF + " students scored F");

        // Pass/Fail Summary
        System.out.println("\n----PASS/FAIL SUMMARY----");
        System.out.println(passedCount + " students passed");
        System.out.println(failedCount + " students failed");
    }
}
