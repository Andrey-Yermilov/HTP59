package Homework13;

public class NumbersPrinter extends Thread {
    static volatile int i;

    @Override
    public void run() {
        printNumbers();
    }

    public void printNumbers() {
        i = 1;
        while (i < 90) {
            synchronized (NumbersPrinter.class) {
                System.out.print("\n" + getName() + ":");
                for (int k = 0; k < 10; k++) {
                    System.out.printf("%4d", i);
                    i++;
                }
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

