package com.ShelterConnect.PassionProject.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Bed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Bed_ID")
    private Integer bed_ID;
    @Column(name = "Name", nullable = false)
    private String name;
    @Column(name = "Status", nullable = false)
    private String status;

    public Bed(String name, String status) {
        this.name = name;
        this.status = status;
    }
}
