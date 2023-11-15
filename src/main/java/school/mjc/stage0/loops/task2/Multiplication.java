package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int result = 1;
        int whileCounter = 0;
        while (whileCounter <= Math.abs(multiplyByAndToInclusive)) {
            System.out.println( multiplyByAndToInclusive < 0
                                ? -1 * whileCounter * result
                                : whileCounter * result );
            whileCounter++;
        }
    }
}
