package CRUD;

import CRUD.AddElementsTest;
import entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Тестовый класс для проверки получения элементов
 */
public class RemoveElementsTest {
    public static void main(String[] args) {

        removeElementForId();
        removeElementForName("Ivan");
    }

    /**
     * Удаление работника по ID
     */
    public static void removeElementForId() {

        //Добавляем элемент, потом его будем удалять
        Employee employee = AddElementsTest.addElement();

        //Получаем сохраненый объект из базы
        int id = employee.getId();

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

        //Сессия необходима для выполнения операции с БД
        //Кратко живущий объект
        try (Session session = factory.getCurrentSession()) {


            //Сохраняем объект
            session.beginTransaction();
            session.remove(employee);
            session.getTransaction().commit();
            System.out.println("-->Удалили работника из базы: " + employee);
        }
    }

    /**
     * Удаление работников по имени
     */
    public static void removeElementForName(String name) {

        //Добавляем элементы, потом его их удалять
        AddElementsTest.addElement(name, "Ivanov", "IT", 350);
        AddElementsTest.addElement(name, "Petrov", "IT", 350);
        AddElementsTest.addElement(name, "Sidorov", "IT", 350);

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

        //Сессия необходима для выполнения операции с БД
        //Кратко живущий объект
        try (Session session = factory.getCurrentSession()) {

            //Удаляем объекты
            session.beginTransaction();
            session.createQuery("delete Employee where name  = '" + name + "'").executeUpdate();
            session.getTransaction().commit();
            System.out.println("-->Удалили работников из базы с именем: " + name);
        }
    }
}
