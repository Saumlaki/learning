package Example6;

import Example6.library.Book;
import Example6.library.SchoolLibrary;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Класс для тестрования AOP
 */
public class Test {
    public static void main(String[] args) {

        //Указываем класс который содержит конфигурационные настройки
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

        //Получаем бин
        SchoolLibrary schoolLibrary = applicationContext.getBean("schoolLibrary", SchoolLibrary.class);

       //Проверка After returning
        System.out.println("===Проверка After returning===");
        List<Book>  books = schoolLibrary.getBooks();
        System.out.println("В библиотеке есть:");
        books.stream().forEach(System.out::println);

        //Проверка After throwing
        System.out.println("===Проверка After throwing===");
        try {
            schoolLibrary.getLiveMeaning();
        } catch (Exception ex) {
            System.out.println("!!!Поймали исключение: " + ex.getMessage());
        }

        //Проверка Around
        System.out.println("===Проверка Around===");
        System.out.println(schoolLibrary.getMyLovelyBook());

        //Проверка Around exception
        System.out.println("===Проверка Around===");
        System.out.println(schoolLibrary.getMyLovelyBookException());
    }
}
