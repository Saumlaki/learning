import entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Тестовый класс для проверки добавления элементов
 */
public class AddElementsTest {
    public static void main(String[] args) {

        addElement();
    }


    public static Employee addElement() {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

        //Создаем объект который хотим сохранить
        Employee employee = new Employee("Alexey", "Petrov2", "IT", 1000);

        //Сессия необходима для выполнения операции с БД
        //Кратко живущий объект
        try (Session session = factory.getCurrentSession()) {


            //Сохраняем объект
            session.beginTransaction();
            System.out.println("-->Сохраняю работотника: " + employee);
            session.save(employee);
            session.getTransaction().commit();
        }

        return employee;
    }

    public static Employee addElement(String name, String surname, String department, int salary) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

        //Создаем объект который хотим сохранить
        Employee employee = new Employee(name, surname, department, salary);

        //Сессия необходима для выполнения операции с БД
        //Кратко живущий объект
        try (Session session = factory.getCurrentSession()) {


            //Сохраняем объект
            session.beginTransaction();
            System.out.println("-->Сохраняю работотника: " + employee);
            session.save(employee);
            session.getTransaction().commit();
        }

        return employee;
    }
}
