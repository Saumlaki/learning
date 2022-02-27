import entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Тестовый класс для проверки получения элементов
 */
public class GetElementsTest {
    public static void main(String[] args) {

        getElementForID();
        getAllElements();
        getAllElementsForName("Alexey2");
    }

    /**
     * Получение работника по ID
     */
    public static void getElementForID() {

        Employee employee = AddElementsTest.addElement();

        //Получаем сохраненый объект из базы
        int id = employee.getId();

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

        //Сессия необходима для выполнения операции с БД
        //Кратко живущий объект
        try (Session session = factory.getCurrentSession()) {


            //Сохраняем объект
            session.beginTransaction();
            Employee employeeSaved = session.get(Employee.class, id);
            session.getTransaction().commit();
            System.out.println("-->Получили ранее сохраненого работника: " + employeeSaved);
        }

    }

    /**
     * Получение всех работкников
     */
    public static void getAllElements() {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

        //Сессия необходима для выполнения операции с БД
        //Кратко живущий объект
        try (Session session = factory.getCurrentSession()) {

            //Сохраняем объект
            session.beginTransaction();
            //Пишем не имя таблицы а имя класса.
            System.out.println("-->Получаем всех работников");
            List<Employee> employeeList = session.createQuery("from Employee").getResultList();
            employeeList.stream().forEach(System.out::println);
            session.getTransaction().commit();
        }
    }

    /**
     * Получение всех работкников
     */
    public static void getAllElementsForName(String name) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

        //Сессия необходима для выполнения операции с БД
        //Кратко живущий объект
        try (Session session = factory.getCurrentSession()) {

            //Сохраняем объект
            session.beginTransaction();
            //Пишем не имя таблицы а имя класса.
            System.out.println("-->Получаем всех работников c именем " + name);
            //name это поле класса, а не поле таблицы
            List<Employee> employeeList = session.createQuery("from Employee where name = '" + name + "'").getResultList();
            employeeList.stream().forEach(System.out::println);
            session.getTransaction().commit();
        }
    }
}
