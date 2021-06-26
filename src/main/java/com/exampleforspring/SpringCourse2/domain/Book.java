package com.exampleforspring.SpringCourse2.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity

public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
     private String title;
     private String isbn;
     
     @ManyToOne
     @JoinColumn(name= "publisher_id")
     private Publisher publisher;
     
      
     
     @ManyToOne
     @JoinColumn(name = "author_id")
     private Author author;
     
     public Book() {
    	 
     }
	public Book(String title, String isbn) {
		this.title = title;
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

     
	

    
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
        if(this==obj) return true;
        
        if(obj==null || getClass()!= obj.getClass()) return false;
        
        Book book = (Book) obj;
        return id != null? id.equals(book.id) : book.id == null;
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		
		return id!= null ? id.hashCode(): 0;
	}
	public Long getId() {
		return id;
	}
	public Author getAuthor() {
		return author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", isbn=" + isbn + ", author=" + author + "]";
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	

	 
     
     
}
