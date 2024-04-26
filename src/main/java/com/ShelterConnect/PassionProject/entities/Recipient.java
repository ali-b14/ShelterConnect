package com.ShelterConnect.PassionProject.entities;

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
    @Column(name = "Recipient_ID")
    private Integer recipient_ID;
    @Column(name = "First_Name", nullable = false)
    private String first_Name;
    @Column(name = "Last_Name", nullable = false)
    private String last_Name;
    @Column(name = "Birth_Date", nullable = false)
    private Date birth_Date;

    public Recipient(String first_Name, String last_Name, Date birth_Date) {
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.birth_Date = birth_Date;
    }
}
