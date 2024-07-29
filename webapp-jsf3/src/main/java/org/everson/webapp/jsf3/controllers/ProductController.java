package org.everson.webapp.jsf3.controllers;


import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Model;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;
import org.everson.webapp.jsf3.entities.Product;


import java.util.Arrays;
import java.util.List;

@Model
public class ProductController {

    @Produces
    @Model
    public String title(){
        return "Hello world JavaServer Face 3.0";
    }

    @Produces
    @RequestScoped
    @Named("produto_lista")
    public List<Product> findAll() {
        return Arrays.asList(new Product("Pera"),
                new Product("Maçãs"),
                new Product("Abacaxi"));
    }

}
