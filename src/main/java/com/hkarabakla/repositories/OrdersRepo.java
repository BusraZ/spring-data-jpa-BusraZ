package com.hkarabakla.repositories;

import com.hkarabakla.entities.Book;
import com.hkarabakla.entities.Orders;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface OrdersRepo extends CrudRepository<Orders,Integer> {
    Set<Orders> findAllByUser_NameContainingIgnoreCase(String name);
}
