package com.example.jpachapter.repository.customer.criteria;

import com.example.jpachapter.entity.Customer;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface CustomCustomerRepository {

    List<Customer> findAll(Specification<Customer> where);
}
