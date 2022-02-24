package Example6.aspects;

import Example6.library.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;


//Помечаем что класс является аспектом
@Aspect
@Component
public class Aspects {

    //==================================================
    //AFTER RETURNING

    /**
     * Простой PointCut который отрабатывает после завершения основного метода
     */
    @AfterReturning("execution(* get*(..))")
    public void afterReturningMethodAspect(JoinPoint joinPoint) {
        System.out.println("-->Метод " + joinPoint.getSignature().getName() + " успешно отработал");
    }

    /**
     * Сложный PointCut который отрабатывает после завершения основного метода. В данном poincut мы меняем конечный результат работы метода
     */
    @AfterReturning(pointcut = "execution(* get*(..))", returning = "bookList")
    public void afterReturningAndAddMethodAspect(JoinPoint joinPoint, List<Book> bookList) {

        bookList.add(new Book("Азазель"));
        System.out.println("-->Добавили новую книгу");
    }

    //==================================================
    //AFTER THROWING

    /**
     * Простой PointCut который отрабатывает после завершения основного метода завершившегося ошибкой
     */
    @AfterThrowing("execution(* get*(..))")
    public void afterThrowingMethodAspect(JoinPoint joinPoint) {
        System.out.println("-->Метод " + joinPoint.getSignature().getName() + " завершился с ошибкой!");
    }

    /**
     * Более сложный PointCut который отрабатывает после завершения основного метода завершившегося ошибкой. Так же отлавливаеот ошибку
     */
    @AfterThrowing(pointcut = "execution(* get*(..))", throwing = "throwing")
    public void afterThrowingMethodAspect(JoinPoint joinPoint, Exception throwing) {
        System.out.println("-->Ошибка: " + throwing.getMessage());
    }

    //==================================================
    //AFTER

    /**
     * Простой PointCut который отрабатывает после завершения основного метода, не зависимо от того как он завершился.
     */
    @After("execution(* get*(..))")
    public void afterMethodAspect(JoinPoint joinPoint) {
        System.out.println("-->Метод " + joinPoint.getSignature().getName() + " как то завершился!");
    }

    //==================================================
    //AROUND ADVICE

    /**
     * Простой PointCut который отрабатывает до и после  завершения основного метода.
     * proceedingJoinPoint - необходим для запуска target метода
     * Advice метод должен возвращать тот же тип что и метод который он "оборачивает".
     * Так как proceedingJoinPoint.proceed() возвращает Object  то можем указать что возвращаемый тип метода то же Object
     */
    @Around("execution(public String getMyLovelyBook())")
    public Object aroundMethodAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("-->Метод aroundMethodAspect начался");

        long begin = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();

        System.out.println("-->Метод aroundMethodAspect  завершился");

        return "Моя любима книга это - " + targetMethodResult + "(" + (end - begin) + ") мс";
    }

    /**
     * Простой PointCut который отрабатывает до и после  завершения основного метода. Обрабатываем ошибки.
     * proceedingJoinPoint - необходим для запуска target метода
     * Advice метод должен возвращать тот же тип что и метод который он "оборачивает".
     * Так как proceedingJoinPoint.proceed() возвращает Object  то можем указать что возвращаемый тип метода то же Object
     */
    @Around("execution(public String getMyLovelyBookException())")
    public Object aroundMethodAspectException(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("-->Метод aroundMethodAspectException начался");

        long begin = System.currentTimeMillis();
        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception ex) {
            System.out.println("-->Ой, ошибка. Мы ее поймали");
            System.out.println("-->Exception:" + ex.getMessage());
            targetMethodResult = "ничего не найдено";

            //Можно исключение пробросить дальше
            //throw ex;
        }
        long end = System.currentTimeMillis();

        System.out.println("-->Метод aroundMethodAspectException  завершился");

        return "Моя любима книга это - " + targetMethodResult + "(" + (end - begin) + ") мс";
    }
}
