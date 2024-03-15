package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Salary {

    @Id
    private int id;
    private String calisan;

    private LocalDate odemetarihi;

    private String odemeozeti;


}
