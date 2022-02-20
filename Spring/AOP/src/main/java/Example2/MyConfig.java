package Example2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Конфигурационный файл Spring
 */
//Указываем что этот класс является конфигурационным
@Configuration
//Указываем в каком пакете ищем бины
@ComponentScan("Example2")
//Подключаем аннотацию позволяющую использовать SPRING AOP PROXI
@EnableAspectJAutoProxy
public class MyConfig {
}
