package com.ms_customers.repository;

import com.ms_customers.model.Customers;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends ReactiveMongoRepository<Customers,Long> {

}