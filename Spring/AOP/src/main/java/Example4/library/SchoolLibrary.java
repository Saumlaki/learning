package Example4.library;

import Example3.MyConfig;
import org.springframework.stereotype.Component;

/**
 * Класс компонент на котором будет тестировать  AOP
 * Аннотация <code>@Component</code> указывает на то что данный класс будет зарегистирован в Spring Container как компонент
 * За настройки поиска компонентов отвечает класс <code>MyConfig</code>.
 *
 * @see MyConfig
 */
@Component
public class SchoolLibrary  {

     public void getBook() {

        System.out.println("SchoolLibrary:Мы берем книгу.");
    }
}