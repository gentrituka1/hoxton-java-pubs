package com.pubs.hoxtonjavapubs;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pub")
public class Pub {
    @Id
    @GeneratedValue
    public int id;
    public String name;
    public String city;

    public Pub() {
    }
}
