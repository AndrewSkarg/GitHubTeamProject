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
    private String projectName;
    @Column(length = 40)
    private String studentName;
    @Column(length = 40)
    private String reviewer;
    @Column(length = 40)
    private int year;
    @Column(length = 40)
    private String supervisor;

    public Diploma() {
    }

    public Diploma(Long id, String studentName, String projectName, String reviewer, int year, String supervisor) {
        this.id = id;
        this.studentName = studentName;
        this.projectName = projectName;
        this.reviewer = reviewer;
        this.year = year;
        this.supervisor = supervisor;
    }





}
