package com.exampleforspring.SpringCourse2.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Publisher {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String addressLine1;
	private String city;
	private String state;
	private String zip;
	
	
	@OneToMany(mappedBy= "publisher")
	private Set<Book> books = new HashSet<>();
	
	
	public Publisher() {
	}
	
	
	
	public Publisher(Long id, String name, String addressLine1, String city, String state, String zip) {
		this.id = id;
		this.name = name;
		this.addressLine1 = addressLine1;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	



	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//return super.hashCode();
		return id!= null? id.hashCode(): 0;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj) return true;
		
		if(obj == null || getClass()!=obj.getClass()) return false;
		
		Publisher publisher = (Publisher) obj;
		
		return id!=null ? id.equals(publisher.id): publisher.id==null;
	}
	
	@Override
     public String toString() {
			// TODO Auto-generated method stub
			return ("Publisher{" +" name ="+ name +", address= "+ addressLine1+ "}");
					
		}

	



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddressLine1() {
		return addressLine1;
	}



	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getZip() {
		return zip;
	}



	public void setZip(String zip) {
		this.zip = zip;
	}



	public Set<Book> getBooks() {
		return books;
	}



	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
