package Example2_CachedThreadPool;

/**
 * Класс являющийся нитью
 */
public class RunClass implements Runnable {

    String threadName;

    public RunClass(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {

        Thread.currentThread().setName(threadName);

        for (int i = 0; i < 10; i++) {
            System.out.println("Thread name: " + Thread.currentThread().getName() + ", value: " + i);
        }
        System.out.println("---!Thread name: " + Thread.currentThread().getName() + ", is finished");
    }
}
