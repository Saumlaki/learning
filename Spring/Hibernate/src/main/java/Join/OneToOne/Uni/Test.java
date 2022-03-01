package Join.OneToOne.Uni;

import Join.OneToOne.Uni.entity.Department;
import Join.OneToOne.Uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Тестовый класс для проверки добавления элементов со связью
 */
public class Test {

    public static void main(String[] args) {

        Employee employee1 = addElement();
        Employee employee2 = getElementForId(employee1.getId());
    }

    public static Employee addElement() {

        SessionFactory factory = new Configuration().configure("cfg/OneToOneUniDirectional.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        //Создаем объекты которые, хотим сохранить
        Employee employee = new Employee("Egor");
        Department itDepartment = new Department("It");


        employee.setDepartment(itDepartment);

        //Сессия необходима для выполнения операции с БД
        //Кратко живущий объект
        try (Session session = factory.getCurrentSession()) {

            //Сохраняем объект
            session.beginTransaction();
            System.out.println("-->Сохраняю сотрудника: " + employee.getName());
            session.save(employee);
            session.getTransaction().commit();
        }
        factory.close();

        return employee;
    }

    public static Employee getElementForId(int id) {

        SessionFactory factory = new Configuration().configure("cfg/OneToOneUniDirectional.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Employee employee = null;

        //Сессия необходима для выполнения операции с БД
        //Кратко живущий объект
        try (Session session = factory.getCurrentSession()) {

            //Сохраняем объект
            session.beginTransaction();
            System.out.println("-->Получаю сотрудника.");
            employee = session.get(Employee.class, id);
            System.out.println("Сотрудник: " + employee.getName() + " департамент: " + employee.getDepartment().getName());
            session.getTransaction().commit();
        }
        factory.close();
        return employee;
    }
}
