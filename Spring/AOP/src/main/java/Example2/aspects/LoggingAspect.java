package Example2.aspects;

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
    //Данный pointcut отработает для любого класса где есть такой метод
    @Before("execution(public void getBook())")
    public void beforeGetBookAdvice1() {
        System.out.println("beforeGetBookAdvice1: Попытка получить книгу. Общий для всех классов.");
    }

    //Данный pointcut отработает только для конкретного класса
    @Before("execution(public void Example2.library.UniLibrary.getBook())")
    public void beforeGetBookAdvice2() {
        System.out.println("beforeGetBookAdvice2: Попытка получить книгу. Выполняеться только для класса UniLibrary");

    }

    //Данный pointcut отработает для любого public void get*() метода
    @Before("execution(public void get*())")
    public void beforeGetBookAdvice3() {
        System.out.println("beforeGetBookAdvice3: Попытка получить книгу. Выполняеться ля любого метода с маской get*()");

    }

    //Данный pointcut отработает для любого public * get*() метода
    @Before("execution(public * get*())")
    public void beforeGetBookAdvice4() {
        System.out.println("beforeGetBookAdvice4: Попытка получить книгу. Выполняеться ля любого метода с любым возвращаемым типом и маской имени get*()");

    }

    //Данный pointcut отработает для любого public void getBook(String param) метода
    @Before("execution(public void getBook(String))")
    public void beforeGetBookAdvice5() {
        System.out.println("beforeGetBookAdvice5: Попытка получить книгу. Выполняеться для любого getBook метода с параметром String");

    }

    //Данный pointcut отработает для любого public void getBook(* param) метода
    @Before("execution(public void getBook(*))")
    public void beforeGetBookAdvice6() {
        System.out.println("beforeGetBookAdvice6: Попытка получить книгу. Выполняеться для любого getBook метода с параметром любого типа");

    }

    //Данный pointcut отработает для любого public void метода с любым количеством парамтеров
    @Before("execution(public void *(..))")
    public void beforeGetBookAdvice7() {
        System.out.println("beforeGetBookAdvice7: Попытка получить книгу. Выполняеться для любого getBook метода с параметром любого типа");

    }
}
