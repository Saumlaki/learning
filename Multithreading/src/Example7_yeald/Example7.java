package Example7_yeald;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Пример демонстрирующий уступку права выполнения другому потоку для более равномерного распределения работы потоков.
 * При уступке права выполнения в начале выполняются потоки с максимальным приоритетом
 */
public class Example7 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(new RunClass("Thread 1", Thread.MAX_PRIORITY));
        executor.execute(new RunClass("Thread 2", Thread.MAX_PRIORITY));
        executor.execute(new RunClass("Thread 3", Thread.MAX_PRIORITY));
        executor.execute(new RunClass("Thread 4", Thread.MIN_PRIORITY));

        executor.shutdown();

        System.out.println("---!Thread name: " + Thread.currentThread().getName() + ", is finished");
    }
}
