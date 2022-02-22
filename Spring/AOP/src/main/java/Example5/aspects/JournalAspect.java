package Example5.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;


//Помечаем что класс является аспектом
@Aspect
@Component
public class JournalAspect {
    @Before("execution(* get*(..))")
    public void beforeGetMethodAspect(JoinPoint joinPoint) {

        MethodSignature methodSignature  = (MethodSignature) joinPoint.getSignature();
        System.out.println("-----------------------------------------------");
        System.out.println("Сигратура метода = " + methodSignature);
        System.out.println("Метод = " + methodSignature.getMethod());
        System.out.println("Возвращаемы тип = " + methodSignature.getReturnType());
        System.out.println("Имя метода = " + methodSignature.getName());

        System.out.println("Параметры:");
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            if(arg instanceof String) System.out.println((String) arg);
        }

        System.out.println("JournalAspect: идет журналирование.");
        System.out.println("-----------------------------------------------");
    }
}
