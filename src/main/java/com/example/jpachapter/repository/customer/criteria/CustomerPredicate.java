package com.example.jpachapter.repository.customer.criteria;

import com.example.jpachapter.entity.Customer;
import com.example.jpachapter.entity.Customer_;
import jdk.jfr.Category;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public class CustomerPredicate {


    private Specification<Customer> nameEq(String name){
        return (root, query, cb)-> cb.equal(root.get(Customer_.NAME), name);
    }

    private Specification<Customer> emailLike(String email){
        return (root, query, cb)-> cb.like(root.get(Customer_.EMAIL), email);
    }
}
