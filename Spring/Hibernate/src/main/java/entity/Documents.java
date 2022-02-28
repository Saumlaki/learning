package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Класс нужен для проверки bi directional отношения 1 к 1
 */
@Entity
@Table
public class Documents {

    @Getter
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Getter
    @Setter
    @Column
    String number;

    @Getter
    @Setter
    //Аннотацию JoinColumn писать уже не надо. Потому что мы прописали связь ранее
    //Мы говорим что связь уже налажена. Смотри ее в
    @OneToOne(mappedBy = "empDocument", cascade = CascadeType.ALL)
    Employee employee;

    public Documents() {
    }

    public Documents(String number, Employee employee) {
        this.number = number;
        this.employee = employee;
    }
}
