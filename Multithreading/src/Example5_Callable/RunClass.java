package Example5_Callable;

import java.util.concurrent.Callable;

/**
 * Класс являющийся нитью
 */
public class RunClass implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "Это значение вернул метод call()";
    }

}
