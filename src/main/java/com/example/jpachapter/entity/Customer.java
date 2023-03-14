package com.example.jpachapter.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Customer {

    @Id
    private Long id;

    private String name;

    private String email;

    private String mobile;

    private String address;

    private boolean gender;

    @OneToMany(mappedBy = "customer")
    @ToString.Exclude
    private List<Card> cards;
}
