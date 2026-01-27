package com.pedroacbg.controller;

import com.pedroacbg.dto.ExchangeDTO;
import com.pedroacbg.environment.InstanceInformationService;
import com.pedroacbg.model.Book;
import com.pedroacbg.proxy.ExchangeProxy;
import com.pedroacbg.repository.BookRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Tag(name = "Book Endpoint")
@RestController
@RequestMapping("book-service")
public class BookController {

    @Autowired
    private InstanceInformationService instanceInformationService;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private ExchangeProxy exchangeProxy;

//    @GetMapping(value = "/{id}/{currency}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public Book getBook(@PathVariable(name = "id") Long id, @PathVariable(name = "currency") String currency){
//        String port = instanceInformationService.retrieveServerPort();
//        return new Book(1L, "Nigeria Breno", "The new world against us", new Date(), 15.8, "BRL", "PORT " + port);
//    }

    @Operation(summary = "Find a specific book by your ID")
    @GetMapping(value = "/{id}/{currency}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Book getBook(@PathVariable(name = "id") Long id, @PathVariable(name = "currency") String currency){
        String port = instanceInformationService.retrieveServerPort();
        var book = bookRepository.findById(id).orElseThrow();
        ExchangeDTO exchange = exchangeProxy.getExchange(book.getPrice(), "USD", currency);
        book.setEnvironment("BOOK PORT: " + port + "; EXCHANGE PORT: " + exchange.getEnvironment());
        book.setPrice(exchange.getConvertedValue());
        book.setCurrency(currency);
        return book;
    }

}
