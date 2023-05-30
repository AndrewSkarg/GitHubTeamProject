package com.example.diploms.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Diploma {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(length = 40)
    private String name;
    @Column(length = 40)
    private String surname;
    @Column(length = 40)
    private String city;
}
