package Example4_SingleThreadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Пример демонстрирующий использование SingleThreadExecutor. Задачи выполняются в одном потоке поочередно.
 */
public class Example4 {
    public static void main(String[] args) {

        Thread.currentThread().setName("Thread1");

        ExecutorService executor = Executors.newSingleThreadExecutor();
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
