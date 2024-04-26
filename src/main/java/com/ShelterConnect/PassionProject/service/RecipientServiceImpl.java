package com.ShelterConnect.PassionProject.service;

import com.ShelterConnect.PassionProject.entities.Recipient;
import com.ShelterConnect.PassionProject.repository.RecipientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//Don't have to add @Transactional bc Spring data JPA made JpaRepository methods transactional.
@Service
public class RecipientServiceImpl implements RecipientService {
    private RecipientRepository recipientRepository;
//Don't have to add @Autowired to this constructor. Starting with Spring 4.3, if a class which is configured as a Spring bean, and has only 1 constructor, the @Autowired annotation can be omitted and Spring will use that constructor and inject all necessary dependencies.

//Creating a recipient
//1.Setter-based dependency injection - use when you have optional parameters.
//2.Constructor-based dependency injection - use this when you have mandatory parameters.
    public RecipientServiceImpl(RecipientRepository recipientRepository) {
        this.recipientRepository = recipientRepository;
    }
//calling the recipientRepo to use its save method to save the recipient object/instance to the database.
    @Override
    public Recipient saveRecipient(Recipient recipient) {
        return recipientRepository.save(recipient);
    }
}
