package Example1;

import org.springframework.stereotype.Component;

/**
 * Класс компонент на котором будет тестировать  AOP
 * Аннотация <code>@Component</code> указывает на то что данный класс будет зарегистирован в Spring Container как компонент
 * За настройки поиска компонентов отвечает класс <code>MyConfig</code>.
 *
 * @see MyConfig
 */
@Component
public class Library {

    public void getBook() {

        System.out.println("Мы берем книгу.");
    }
}
