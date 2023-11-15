package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int whileCounter = 1;
        while (whileCounter <= printToInclusive) {
            boolean isPrime = true;
            int i = 2;
            int number = whileCounter / 2;
            while (i <= number) {
                if (whileCounter % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime) System.out.println(whileCounter);
            whileCounter++;
        }
    }
}
