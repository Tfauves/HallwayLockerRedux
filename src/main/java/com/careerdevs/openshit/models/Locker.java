package com.careerdevs.openshit.models;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Locker {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "content", fetch = FetchType.LAZY)
    @JsonIncludeProperties("student")
    private Set<Content> content;


}
