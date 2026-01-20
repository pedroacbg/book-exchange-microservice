package com.pedroacbg.controller;

import com.pedroacbg.environment.InstanceInformationService;
import com.pedroacbg.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.Date;

@RestController
@RequestMapping("book-service")
public class BookController {

    @Autowired
    private InstanceInformationService instanceInformationService;

    @GetMapping(value = "/{id}/{currency}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Book getBook(@PathVariable(name = "id") Long id, @PathVariable(name = "currency") String currency){
        String port = instanceInformationService.retrieveServerPort();
        return new Book(1L, "Nigeria Breno", "The new world against us", new Date(), 15.8, "BRL", "PORT " + port);
    }

}
