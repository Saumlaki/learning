package Join.OneToOne.Uni.entity;


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

    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }
}
