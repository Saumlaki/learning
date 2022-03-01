package Join.OneToMany.Bi.entity;


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


    //Отношение один ко многим
    //В одном департаменте много работников
    //Эту связь ищи в поле department_id является ключом таблицы employees
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
    List<Employee> employeeList;

    public Department() {
    }

    public Department(String name) {
        this.name = name;

    }

    public void addEmployeeToDepartment(Employee employee) {
        if (employeeList == null) employeeList = new ArrayList<>();
        employeeList.add(employee);
    }
}
