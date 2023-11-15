package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int result;
        int whileCounter = 0;
        while (whileCounter <= Math.abs(multiplyByAndToInclusive)) {
            result = whileCounter * multiplyByAndToInclusive;
            if (result != 0) System.out.println(result);
            whileCounter++;
        }
    }
}
