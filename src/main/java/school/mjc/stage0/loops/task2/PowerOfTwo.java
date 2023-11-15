package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int powerOfTwo = 1;
        int whileCounter = 1;
        if (power < 0) {
            System.out.println("too much power");
        } else {
            System.out.println(powerOfTwo);
            while (whileCounter <= power) {
                powerOfTwo *= 2;
                System.out.println(powerOfTwo);
                whileCounter++;
            }
        }
    }
}
