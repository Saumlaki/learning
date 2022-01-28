package Example2_CachedThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Пример демонстрирующий использование CachedThreadPool. Рекомендуется использвать вместо Thread.
 */
public class Example2 {
    public static void main(String[] args) {

        Thread.currentThread().setName("Thread1");

        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(new RunClass("Thread2"));
        executor.execute(new RunClass("Thread3"));
        executor.execute(new RunClass("Thread4"));

        executor.shutdown();//Предотвращает отправку новых задач объекту executor
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread name: " + Thread.currentThread().getName() + ", value: " + i);
        }
        System.out.println("---!Thread name: " + Thread.currentThread().getName() + ", is finished");
    }
}
