package com.ShelterConnect.PassionProject.service;

import com.ShelterConnect.PassionProject.entities.Recipient;
//
public interface RecipientService {
    Recipient saveRecipient(Recipient recipient);
    void deleteRecipient(long id);
}
