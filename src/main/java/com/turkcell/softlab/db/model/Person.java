package com.turkcell.softlab.db.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String first;
	private String last;
	private Date dateofbirth;
	private String placeofbirth;



    public void  setId(final Long id){
    	this.id = id;
    }
	public void  setFirst(final String first){
		this.first = first;
	}
	public void  setLast(final String last){
		this.last = last;
	}
	public void  setDateofbirth(final Date dateofbirth){
		this.dateofbirth = dateofbirth;
	}
	public void  setPlaceofbirth(final String placeofbirth){
		this.placeofbirth = placeofbirth;
	}

    public Long getId(){
    	return this.id;
    }
	public String getFirst(){
		return this.first;
	}
	public String getLast(){
		return this.last;
	}
	public Date getDateofbirth(){
		return this.dateofbirth;
	}
	public String getPlaceofbirth(){
		return this.placeofbirth;
	}
}
