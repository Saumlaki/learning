package Join.OneToOne.Uni.entity;

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

    @Setter
    @Getter
    @OneToOne(cascade = CascadeType.ALL)
    //Указываем что соединение идет по колонке "details_id"
    //Для связи с Details с классом Employee в таблице employees существует колонка department_id
    @JoinColumn(name = "department_id")
    private Department department;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }
}
