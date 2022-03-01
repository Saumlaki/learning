package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//Данная аннотация указывает что класс связан с таблицей БД
@Entity
@Table(name = "employees")
public class Employee {

    @Getter
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @Setter
    @Getter
    @Column(name = "name")
    private String name;

    @Setter
    @Getter
    @Column(name = "surname")
    private String surname;

    @Setter
    @Getter
    @Column(name = "salary")
    private int salary;

    //Связь 1 к 1
    @Setter
    @Getter
    @OneToOne(cascade = CascadeType.ALL) //Отношение 1 к одному
    @JoinColumn(name = "details_id") //Указываем что соединение идет по колонке
    private Details empDetails;

    @Setter
    @Getter
    @OneToOne(cascade = CascadeType.ALL) //Отношение 1 к одному
    @JoinColumn(name = "document_id") //Указываем что соединение идет по колонке
    private Documents empDocument;

    //Связь 1 ко многим
    @Setter
    @Getter
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    private Department department;//many to one, много работников могут работать в одном департаменте

    public Employee() {
    }

    public Employee(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
