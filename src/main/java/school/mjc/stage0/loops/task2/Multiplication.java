package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int result;
        int whileCounter = 0;
        while (whileCounter <= Math.abs(multiplyByAndToInclusive)) {
            result = multiplyByAndToInclusive < 0
                    ? -1 * whileCounter * multiplyByAndToInclusive
                    : whileCounter * multiplyByAndToInclusive;
            System.out.println( result );
            whileCounter++;
        }
    }
}
