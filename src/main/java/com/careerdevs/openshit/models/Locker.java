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
    private Integer number;

    @OneToMany(mappedBy = "content", fetch = FetchType.LAZY)
    @JsonIncludeProperties("student")
    private Set<Content> content;

    public Locker() {}

    public Locker(Integer number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Set<Content> getContent() {
        return content;
    }

    public void setContent(Set<Content> content) {
        this.content = content;
    }
}
