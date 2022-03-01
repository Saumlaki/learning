package Join.ManyToMany.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "childrens")
public class Children {
    @Getter
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id;

    @Getter
    @Setter
    @Column(name = "name")
    String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "child_section",
            joinColumns = @JoinColumn(name = "child_id"),
            inverseJoinColumns = @JoinColumn(name = "section_id"))
    List<Section> sectionList;

    public Children() {
    }

    public Children(String name) {
        this.name = name;
    }

    public void addSection(Section section) {
        if (sectionList == null) sectionList = new ArrayList<>();
        sectionList.add(section);
    }

    @Override
    public String toString() {
        return  name;
    }
}
