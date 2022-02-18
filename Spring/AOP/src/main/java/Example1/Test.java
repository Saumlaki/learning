package Example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**Класс для тестрования AOP*/
public class Test {
    public static void main(String[] args) {

        //Указываем класс который содержит конфигурационные настройки
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

        //Получаем бин
        Library library = applicationContext.getBean("library", Library.class);

        library.getBook();
    }
}
