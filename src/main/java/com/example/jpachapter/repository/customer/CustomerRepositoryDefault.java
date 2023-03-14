package com.example.jpachapter.repository.customer;

import com.example.jpachapter.entity.Customer;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepositoryDefault extends JpaRepository<Customer, Long> {

    List<Customer> findDistinctCustomersByNameContainingAndEmailLikeAndMobileContainingAndAndGenderEquals(String name,
                                                                                                          String email,
                                                                                                          String mobile,
                                                                                                          boolean gender,
                                                                                                          Pageable pageable);
}
