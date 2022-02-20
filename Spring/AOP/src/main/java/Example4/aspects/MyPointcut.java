package Example4.aspects;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class MyPointcut {

    @Pointcut("execution(* get*())")
    public void allGetMethod() {

    }
}
