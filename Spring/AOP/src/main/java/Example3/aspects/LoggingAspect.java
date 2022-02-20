package Example3.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//Помечаем что класс является компонентом
@Component
//Помечаем что класс является аспектом
@Aspect
public class LoggingAspect {

    @Pointcut("execution(* get*())")
    private void allGetMethod() {
    }

    @Pointcut("execution(* return*())")
    private void allReturnMethod() {
    }

    @Pointcut("allGetMethod()||allReturnMethod()")
    private void allReturnOrGetMethod() {
    }

    @Before("allGetMethod()")
    public void beforeGetBookAdvice1() {
        System.out.println("beforeGetBookAdvice1: Попытка получить книгу. Общий для всех классов.");
    }

    @Before("allReturnMethod()")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: Попытка получить книгу. Общий для всех классов.");
    }

    @Before("allReturnOrGetMethod()")
    public void beforeAllReturnOrGetMethodBookAdvice() {
        System.out.println("beforeAllReturnOrGetMethodBookAdvice: Попытка взятия или возврата книги");
    }

}
