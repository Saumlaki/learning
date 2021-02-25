package AOPExample.FirstExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Класс для проверки того что мы создали
public class KnightMain {
    public static void main(String[] args) {

        //Загрузка контекста Spring
        ApplicationContext context = new ClassPathXmlApplicationContext("knightsAndMinstrel.xml");

        //Получение компонента knight
        BraveKnight knight = (BraveKnight) context.getBean("knight");
        knight.embarkOnQuest();
    }
}
