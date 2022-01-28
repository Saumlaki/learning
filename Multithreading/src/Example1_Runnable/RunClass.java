package Example1_Runnable;

/**
 * Класс являющийся нитью
 */
public class RunClass implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread name: " + Thread.currentThread().getName() + ", value: " + i);
        }
        System.out.println("---!Thread name: " + Thread.currentThread().getName() + ", is finished");
    }
}
