package Example1.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//Помечаем что класс является компонентом
@Component
//Помечаем что класс является аспектом
@Aspect
public class LoggingAspect {

    //Advice Before
    //Читается  как:
    //Перед выполнением метода public void getBook()
    //public void getBook() - pointcut
    @Before("execution(public void getBook())")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: Попытка получить книгу.");

    }
}
