package com.ShelterConnect.PassionProject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
public class Donor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Donor ID")
    private Integer donor_ID;
    @Column(name = "First Name", nullable = false)
    private String first_Name;
    @Column(name = "Last Name", nullable = false)
    private String last_Name;
    @Column(name = "Organization")
    private String organization;
    @Column(name = "Email Address", nullable = false, unique = true)
    private String email_address;

    public Donor() {
    }

    public Donor(String first_Name, String last_Name, String organization, String email_address) {
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.organization = organization;
        this.email_address = email_address;
    }

    public Donor(Integer donor_ID, String first_Name, String last_Name, String organization, String email_address) {
        this.donor_ID = donor_ID;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.organization = organization;
        this.email_address = email_address;
    }

    public Integer getDonor_ID() {
        return donor_ID;
    }

    public void setDonor_ID(Integer donor_ID) {
        this.donor_ID = donor_ID;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    @Override
    public String toString() {
        return "Donor{" +
                "donor_ID=" + donor_ID +
                ", first_Name='" + first_Name + '\'' +
                ", last_Name='" + last_Name + '\'' +
                ", organization='" + organization + '\'' +
                ", email_address='" + email_address + '\'' +
                '}';
    }
}
