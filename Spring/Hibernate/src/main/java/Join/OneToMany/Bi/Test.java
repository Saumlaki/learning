package Join.OneToMany.Bi;

import Join.OneToMany.Bi.entity.Department;
import Join.OneToMany.Bi.entity.Employee;
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

        SessionFactory factory = new Configuration().configure("cfg/OneToManyBiDirectional.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        //Создаем объекты которые, хотим сохранить
        Employee employee1 = new Employee("Egor");
        Employee employee2 = new Employee("Maxim");
        Employee employee3 = new Employee("Elena");

        Department itDepartment = new Department("It");

        itDepartment.addEmployeeToDepartment(employee1);
        itDepartment.addEmployeeToDepartment(employee2);
        itDepartment.addEmployeeToDepartment(employee3);

        //Сессия необходима для выполнения операции с БД
        //Кратко живущий объект
        try (Session session = factory.getCurrentSession()) {

            //Сохраняем объект
            session.beginTransaction();
            System.out.println("-->Сохраняю департамент: " + itDepartment.getName());
            session.save(itDepartment);
            session.getTransaction().commit();
        }
        factory.close();
    }
}
