package Example4.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
//Помечаем что класс является аспектом
@Aspect
@Component
public class SecurityAspect {
    @Before("Example4.aspects.MyPointcut.allGetMethod()")
    public void beforeGetMethodAspect() {
        System.out.println("SecurityAspect: идет проверка прав.");
    }
}
