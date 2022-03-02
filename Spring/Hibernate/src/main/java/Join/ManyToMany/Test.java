package Join.ManyToMany;

import Join.ManyToMany.entity.Children;
import Join.ManyToMany.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Тестовый класс для проверки добавления элементов со связью
 */
public class Test {

    public static void main(String[] args) {

        addElement();
    }

    public static void addElement() {

        SessionFactory factory = new Configuration().configure("cfg/ManyToMany.cfg.xml")
                .addAnnotatedClass(Children.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        //Сессия необходима для выполнения операции с БД
        //Кратко живущий объект
        try (Session session = factory.getCurrentSession()) {

            //Сохраняем объект
            session.beginTransaction();
            System.out.println("-->Сохраняю детей и секции.");

            //Создаем объекты которые, хотим сохранить
            Children children1 = new Children("Катя");
            Children children2 = new Children("Маша");
            Children children3 = new Children("Саша");

            session.save(children1);
            session.save(children2);
            session.save(children3);

            Section section1 = new Section("Бокс");
            Section section2 = new Section("Плаванье");

            section1.addChildren(children1);
            section1.addChildren(children2);

            children3.addSection(section1);
            children3.addSection(section2);

            session.save(section1);
            session.save(section2);

            //Проверяем что у нас получилось
            Section section = session.get(Section.class, section1.getId());
            System.out.println("Секция: " + section.getName());
            System.out.println("Дети:");
            section.getChildrenList().stream().forEach(System.out::println);
            session.getTransaction().commit();
        }
        factory.close();
    }
}
