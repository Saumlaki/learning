package Example2.library;

import Example2.MyConfig;
import org.springframework.stereotype.Component;

/**
 * Класс компонент на котором будет тестировать  AOP
 * Аннотация <code>@Component</code> указывает на то что данный класс будет зарегистирован в Spring Container как компонент
 * За настройки поиска компонентов отвечает класс <code>MyConfig</code>.
 *
 * @see MyConfig
 */
@Component
public class SchoolLibrary extends AbstractLibrary {

    @Override
    public void getBook() {

        System.out.println("SchoolLibrary:Мы берем книгу.");
    }
}