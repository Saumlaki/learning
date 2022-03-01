package Join.ManyToMany.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sections")
public class Section {

    @Getter
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id;

    @Getter
    @Setter
    @Column(name = "name")
    String name;

    @Getter
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "child_section",
            joinColumns = @JoinColumn(name = "section_id"),
            inverseJoinColumns = @JoinColumn(name = "child_id"))
    List<Children> childrenList;

    public Section() {
    }

    public Section(String name) {
        this.name = name;
    }

    public void addChildren(Children children) {
        if (childrenList == null) childrenList = new ArrayList<>();
        childrenList.add(children);
    }
}
