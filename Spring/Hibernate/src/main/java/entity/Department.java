package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "department")
public class Department {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Getter
    @Setter
    @Column
    String name;

    @Getter
    @Setter
    @Column
    int max_salary;

    @Getter
    @Setter
    @Column
    int min_salary;

    //Отношение один ко многим
    //В одном департаменте много работников
    //Эту связь ищи в поле department в классе Employee
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
    List<Employee> emps;

    public Department() {
    }

    public Department(String name, int max_salary, int min_salary) {
        this.name = name;
        this.max_salary = max_salary;
        this.min_salary = min_salary;
    }

    public void addEmployeeToDepartment(Employee eml) {
        if(emps==null) emps = new ArrayList<>();
        emps.add(eml);
        eml.setDepartment(this);
    }
}
