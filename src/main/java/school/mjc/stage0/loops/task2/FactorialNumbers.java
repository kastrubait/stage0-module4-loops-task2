package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
//    public static void main(String[] args) {
//        int printToInclusive = 7;
    public void printFactorialRow(int printToInclusive) {
        int factorial = 1;
        int whileCounter = 0;
        while (whileCounter <= printToInclusive) {
            if (whileCounter == 0 || whileCounter == 1) {
                System.out.println(factorial);
            } else {
                factorial *= whileCounter;
                System.out.println(factorial);
            }
            whileCounter++;
        }

    }
}
