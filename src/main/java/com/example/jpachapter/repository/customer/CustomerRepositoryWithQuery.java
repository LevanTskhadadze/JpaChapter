package com.example.jpachapter.repository.customer;

import com.example.jpachapter.entity.Customer;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepositoryWithQuery extends JpaRepository<Customer, Long> {

    @Query("select distinct c from Customer c " +
            "where c.name like concat('%', :name, '%') and c.email like :email and c.mobile like concat('%', :mobile, '%') and c.gender = :gender")
    List<Customer> findDistinctCustomersByNameContainingAndEmailLikeAndMobileContainingAndAndGenderEquals(@Param("name") String name,
                                                                                                   @Param("email") String email,
                                                                                                   @Param("mobile") String mobile,
                                                                                                   @Param("gender") boolean gender,
                                                                                                   Pageable pageable);
}
