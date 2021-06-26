package com.exampleforspring.SpringCourse2.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String firstName;
	private String lastName;
	
	@OneToMany(mappedBy= "author")
	private Set<Book> books = new HashSet<>();
	
	public Author() {
		
	}
	
	
	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Auhtor{" +" id ="+ id +
				", first name= "+ firstName+ "-" +", lastName" + lastName +", books"+ books + "}";
				
	}

    
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
        if(this==obj) return true;
        
        if(obj==null || getClass()!= obj.getClass()) return false;
        
        Author author = (Author) obj;
        return id != null? id.equals(author.id) : author.id == null;
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		
		return id!= null ? id.hashCode(): 0;
	}


	


}
