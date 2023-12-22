/*
 * Created on 2023-12-22 ( 23:18:58 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * JPA entity class for "Product"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="product")
public class Product {

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="Id", nullable=false)
    private Long id ;

    //--- ENTITY DATA FIELDS 
    @Column(name="name", length=255)
    private String name ;


    //--- ENTITY LINKS ( RELATIONSHIP )

    /**
     * Constructor
     */
    public Product() {
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setId( Long id ) {
        this.id = id ;
    }
    public Long getId() {
        return this.id;
    }

    public void setName( String name ) {
        this.name = name ;
    }
    public String getName() {
        return this.name;
    }

	public Product(Long id, String name) {
		this.id = id;
		this.name = name;
	}

}