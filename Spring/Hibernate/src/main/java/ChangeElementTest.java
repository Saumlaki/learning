import entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Тестовый класс для проверки получения элементов
 */
public class ChangeElementTest {
    public static void main(String[] args) {

        changeElementForId(1);
        changSomeElements();
    }

    /**
     * Изменение элемента по ID
     */
    public static void changeElementForId(int id) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

        //Сессия необходима для выполнения операции с БД
        //Кратко живущий объект
        try (Session session = factory.getCurrentSession()) {

            //Сохраняем объект
            session.beginTransaction();
            Employee employeeSaved = session.get(Employee.class, id);
            System.out.println("Зарплата до изменнеия равна " + employeeSaved.getSalary());
            employeeSaved.setSalary(employeeSaved.getSalary() + 10);
            session.save(employeeSaved);
            System.out.println("Зарплата после изменнеия равна " + employeeSaved.getSalary());
            session.getTransaction().commit();
        }
    }

    /**
     * Изменение группы элементов
     */
    public static void changSomeElements() {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

        //Сессия необходима для выполнения операции с БД
        //Кратко живущий объект
        try (Session session = factory.getCurrentSession()) {

            //Сохраняем объект
            session.beginTransaction();
            System.out.println("Меняю зарплату всем Alex");
            session.createQuery("update Employee set salary = 1000 where name = 'Alexey'").executeUpdate();
            session.getTransaction().commit();
        }
    }
}

