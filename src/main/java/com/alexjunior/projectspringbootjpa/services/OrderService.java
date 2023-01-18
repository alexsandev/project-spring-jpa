package com.alexjunior.projectspringbootjpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexjunior.projectspringbootjpa.entities.Order;
import com.alexjunior.projectspringbootjpa.repositories.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
       return repository.findById(id).get(); 
    }
}
