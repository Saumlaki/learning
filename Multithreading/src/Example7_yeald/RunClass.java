package Example7_yeald;

/**
 * Класс являющийся нитью
 */
public class RunClass implements Runnable {

    String name;
    int priority;

    public RunClass(String name, int priority) {
        this.priority = priority;
        this.name = name;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        Thread.currentThread().setName(name);

        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + ", priority: " + Thread.currentThread().getPriority() + "i = " + i);
            Thread.yield();
        }

    }
}
