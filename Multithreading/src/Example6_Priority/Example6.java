package Example6_Priority;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Пример демонстрирующий использование приоритетов. На практике лучгше не использолвать.
 */
public class Example6 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(new RunClass("Thread 1", 1));
        executor.execute(new RunClass("Thread 2", 2));
        executor.execute(new RunClass("Thread 3", 3));
        executor.execute(new RunClass("Thread 4", 4));

        executor.shutdown();

        System.out.println("---!Thread name: " + Thread.currentThread().getName() + ", is finished");
    }
}
