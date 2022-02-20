package Example2;

import Example2.library.SchoolLibrary;
import Example2.library.UniLibrary;
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
        UniLibrary uniLibrary = applicationContext.getBean("uniLibrary", UniLibrary.class);
        SchoolLibrary schoolLibrary = applicationContext.getBean("schoolLibrary", SchoolLibrary.class);
        uniLibrary.getBook();
        schoolLibrary.getBook();

        uniLibrary.getBook("Преступление и наказание");
    }
}
