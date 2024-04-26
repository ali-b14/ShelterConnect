package com.ShelterConnect.PassionProject.repository;

import com.ShelterConnect.PassionProject.entities.Recipient;
import org.springframework.data.jpa.repository.JpaRepository;
//dont have to add @Repository bc Spring bean already takes care of that when you extend JpaRepository.
public interface RecipientRepository extends JpaRepository<Recipient, Integer> {
}
