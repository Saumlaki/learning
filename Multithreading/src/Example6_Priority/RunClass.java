package Example6_Priority;

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

        for (int i = 0; i < 100; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + ", priority: " + Thread.currentThread().getPriority());
            Thread.yield();
        }

    }
}
