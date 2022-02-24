package Example6.library;

import Example6.MyConfig;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс компонент на котором будет тестировать  AOP
 * Аннотация <code>@Component</code> указывает на то что данный класс будет зарегистирован в Spring Container как компонент
 * За настройки поиска компонентов отвечает класс <code>MyConfig</code>.
 *
 * @see MyConfig
 */
@Component
public class SchoolLibrary  {

     public List<Book> getBooks() {

         List<Book> books = new ArrayList<>();
         books.add(new Book("Война и мир"));
         books.add(new Book("Преступление и наказание"));

        System.out.println("SchoolLibrary: получаем список книг");

        return books;
    }

    public String getMyLovelyBook() {

        return "Лолита";
    }

    public String getMyLovelyBookException() {

        int a = 48/0;
        return "Лолита";
    }

    public int getLiveMeaning() throws ArithmeticException {

        System.out.println("Пытаемся понять смысл жизни....");
        int a = 48/0;

        return 48;
    }
}