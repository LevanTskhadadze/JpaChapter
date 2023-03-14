package com.example.jpachapter.repository.customer.projection;

import org.springframework.beans.factory.annotation.Value;

public interface CustomerView {

    String getName();

    @Value("#{target.mobile + '-' + target.email}")
    String getCustomerInfo();
}
