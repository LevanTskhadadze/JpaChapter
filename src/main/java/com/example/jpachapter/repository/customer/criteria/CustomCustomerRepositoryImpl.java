package com.example.jpachapter.repository.customer.criteria;

import com.example.jpachapter.entity.Card;
import com.example.jpachapter.entity.Card_;
import com.example.jpachapter.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class CustomCustomerRepositoryImpl implements CustomCustomerRepository {

    @Autowired
    private EntityManager em;

    @Override
    public List<Customer> findAll(Specification<Customer> where) {
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Customer> criteriaQuery = criteriaBuilder.createQuery(Customer.class);
        Root<Customer> root = criteriaQuery.from(Customer.class);

        Join<Customer, Card> card = root.join(Card_.CUSTOMER);

        return em.createQuery(criteriaQuery.where(where.toPredicate(root, criteriaQuery, criteriaBuilder))).getResultList();
    }
}
