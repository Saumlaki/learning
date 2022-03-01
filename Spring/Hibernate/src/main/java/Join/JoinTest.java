package Join;

import entity.Department;
import entity.Details;
import entity.Documents;
import entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Тестовый класс для проверки добавления элементов со связью
 */
public class JoinTest {

    public static void main(String[] args) {

        Employee employee1 = addElement();
        //Employee employee2 = getElement(employee1.getId());
       // removeElement(employee2);
    }

    public static Employee addElement() {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .addAnnotatedClass(Documents.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        //Создаем объект который хотим сохранить
        Employee employee = new Employee("Egor", "Sidorov", 1000);
        Details details = new Details("Paris", "625 123 321", "int@mail.ru");
        Documents documents = new Documents("22332", employee);

        Department itDepartment = new Department("It",5000, 100);

        itDepartment.addEmployeeToDepartment(employee);

        employee.setEmpDetails(details);
        employee.setEmpDocument(documents);
        documents.setEmployee(employee);

        //Сессия необходима для выполнения операции с БД
        //Кратко живущий объект
        try (Session session = factory.getCurrentSession()) {

            //Сохраняем объект
            session.beginTransaction();
            System.out.println("-->Сохраняю работника: " + employee);
            session.save(employee);
            session.getTransaction().commit();
        }

        factory.close();

        return employee;

    }

    public static Employee getElement(int id) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory();

        Employee employee = null;

        //Сессия необходима для выполнения операции с БД
        //Кратко живущий объект
        try (Session session = factory.getCurrentSession()) {

            //Сохраняем объект
            session.beginTransaction();
            System.out.println("-->Получаю работника с id " + id );
            employee = session.get(Employee.class, id);
            System.out.println(employee);
            session.getTransaction().commit();
        }
        factory.close();

        return employee;

    }

    public static void removeElement(Employee employee) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory();

        //Сессия необходима для выполнения операции с БД
        //Кратко живущий объект
        try (Session session = factory.getCurrentSession()) {

            //Сохраняем объект
            session.beginTransaction();
            System.out.println("-->Удаляю работника: " + employee);
            session.remove(employee);
            session.getTransaction().commit();
        }
        factory.close();
    }
}
