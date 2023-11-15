package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
   public void printEvenNumbers(int printTillInclusive) {
        int whileCounter = 0;
        while (whileCounter <= printTillInclusive) {
            System.out.println(whileCounter);
            whileCounter += 2;
        }
    }
}
