package com.pubs.hoxtonjavapubs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "beer")
public class Beer {
    @Id
    @GeneratedValue
    public int id;
    @Column(nullable = false)
    public String name;
    public String kind;
    public Boolean isAlcoholic;

    @JsonIgnore
    public Beer() {
    }
}

