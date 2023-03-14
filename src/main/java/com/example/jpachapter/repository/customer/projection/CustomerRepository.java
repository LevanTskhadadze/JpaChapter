package com.example.jpachapter.repository.customer.projection;

import com.example.jpachapter.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<CustomerView> finCustomerByName(String name);

    <T> T finCustomerByName(String name, Class<T> type);
}
