package Join.OneToOne.Bi.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
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
    @Getter
    @Setter
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "department")
   Employee employee;

    public Department() {
    }

    public Department(String name) {
        this.name = name;

    }
}
