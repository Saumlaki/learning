package Example4;

import Example4.library.SchoolLibrary;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Класс для тестрования AOP
 */
public class Test {
    public static void main(String[] args) {

        //Указываем класс который содержит конфигурационные настройки
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

        //Получаем бин
        SchoolLibrary schoolLibrary = applicationContext.getBean("schoolLibrary", SchoolLibrary.class);
        schoolLibrary.getBook();
    }
}
