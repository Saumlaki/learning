package Example3_FixedThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Пример демонстрирующий использование FixedThreadPool. Заранее создаем ThreadPool с заданым количеством нитей. Экономим этим ресурсы на создание нитей.
 */
public class Example3 {
    public static void main(String[] args) {

        Thread.currentThread().setName("Thread1");

        ExecutorService executor = Executors.newFixedThreadPool(3);
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
