package com.ShelterConnect.PassionProject.controller;

import com.ShelterConnect.PassionProject.entities.Recipient;
import com.ShelterConnect.PassionProject.service.RecipientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//Rest controller is a convenient annotation that combines @Controller and @ResponseBody, which eliminates the need to annotate every request handling method of the controller class with the @ResponseBody annotation
@RestController
@RequestMapping("/api/recipients")
public class RecipientController {
    //inject dependency RecipientService
    private RecipientService recipientService;

    public RecipientController(RecipientService recipientService){
        super();
        this.recipientService = recipientService;
    }

    //build create recipient REST API
    // @PostMapping handles post http requests.
    //@RequestBody annotation allows us to retrieve the request's body and automatically convert it to Java object.
    @PostMapping()
    public ResponseEntity<Recipient> saveRecipient(@RequestBody Recipient recipient){
        return new ResponseEntity<Recipient>(recipientService.saveRecipient(recipient), HttpStatus.CREATED);
    }

}
