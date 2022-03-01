package Join.OneToMany.Uni.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * В данном примере класс Employee ничего не знает о Department
 */
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

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }
}
