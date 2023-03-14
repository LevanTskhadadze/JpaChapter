package com.example.jpachapter.repository.customer.criteria;

import com.example.jpachapter.entity.Customer;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>,
                                            JpaSpecificationExecutor<Customer> {

    List<Customer> findAll(Specification<Customer> where);
}
