package com.hkarabakla.services;

import com.hkarabakla.entities.Book;
import com.hkarabakla.entities.Orders;
import com.hkarabakla.entities.User;
import com.hkarabakla.repositories.OrdersRepo;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Collections;
import java.util.UUID;

@Component
public class OrderToService {
    private final OrdersRepo ordersRepo;

    public OrderToService( OrdersRepo ordersRepo) {
        this.ordersRepo = ordersRepo;
    }
    public void OrdersOperations(){
        Book b1 = new Book();
        b1.setIsbn(UUID.randomUUID().toString());
        b1.setName("Spring in Action");

        Orders o1= new Orders();
        o1.setCreated_at(LocalDate.of(2019,06,17));
        o1.setTotal(55.99);
        o1.setBooks(Collections.singletonList(b1));

        User u1 = new User();
        u1.setName("Büşra");
        o1.setUser(u1);

        ordersRepo.save(o1);

       // System.out.println(ordersRepo.findAllByUser_NameContainingIgnoreCase("Büşra"));
    }
}
