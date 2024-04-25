package com.ShelterConnect.PassionProject.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Recipient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Recipient ID")
    private Integer recipient_ID;
    @Column(name = "First Name", nullable = false)
    private String first_Name;
    @Column(name = "Last Name", nullable = false)
    private String last_Name;
    @Column(name = "Birth Date", nullable = false)
    private Date birth_Date;

    public Recipient(String first_Name, String last_Name, Date birth_Date) {
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.birth_Date = birth_Date;
    }
}
