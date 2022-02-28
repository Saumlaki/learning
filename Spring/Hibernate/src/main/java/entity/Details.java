package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Класс нужен для проверки uni directional отношения 1 к 1
 */
@Entity
@Table
public class Details {

    @Getter
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Setter
    @Getter
    @Column
    String city;

    @Setter
    @Getter
    @Column(name = "phone_number")
    String phoneNumber;

    @Setter
    @Getter
    @Column
    String email;

    public Details() {
    }

    public Details(String city, String phoneNumber, String email) {
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
