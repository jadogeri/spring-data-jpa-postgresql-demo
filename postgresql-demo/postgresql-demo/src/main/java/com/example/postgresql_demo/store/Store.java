package com.example.postgresql_demo.store;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name = "Store")
@Table(
        uniqueConstraints = {
        @UniqueConstraint(name = "store_address_unique" , columnNames = "address")
        }

)
public class Store {

    @Id
    @SequenceGenerator(
            name = "store_sequence",
            sequenceName = "store_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "student_sequence"

    )
    @Column(updatable = false, nullable = false)
    private Long id;
    @Column(updatable = false, nullable = false, columnDefinition = "TEXT")
    private String name;
    @Column( updatable = false, nullable = false, columnDefinition = "TEXT", unique = true)
    private String address;
    @Column( updatable = true, nullable = false, columnDefinition = "TEXT")

    private String city;
    @Column( updatable = true, nullable = false, columnDefinition = "TEXT")

    private String state;


    public Store(/**Long id,*/ String name, String address, String city, String state) {
//        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
    }

    public Store() {

    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

 }
