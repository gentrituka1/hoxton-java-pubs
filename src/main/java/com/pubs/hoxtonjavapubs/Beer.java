package com.pubs.hoxtonjavapubs;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "beer")
public class Beer {
    @Id
    @GeneratedValue
    public int id;
    public String name;
    public String kind;
    public Boolean isAlcoholic;

    public Beer() {
    }
}
