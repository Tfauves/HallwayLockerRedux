package com.careerdevs.openshit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Locker {
    @Id
    @GeneratedValue
    private Long id;
}