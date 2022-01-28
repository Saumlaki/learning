package Example5_Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Пример демонстрирующий использование Callable. Мы получаем значение возврата.
 */
public class Example5 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executor = Executors.newCachedThreadPool();

        Future<String> stringFuture = executor.submit(new RunClass());

        //Ждем когда результат потока будет "готов"
        while (!stringFuture.isDone()) {
            Thread.sleep(100);
        }

        if (stringFuture.isDone()) {
            System.out.println(stringFuture.get());
        }

        System.out.println("---!Thread name: " + Thread.currentThread().getName() + ", is finished");
    }
}
