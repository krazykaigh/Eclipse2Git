package com.kaideas.springbootstarter.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id
	private long id;
	private String subject;
	private String name;
	private String description;
	
	public Topic() {

	}	
	
	public Topic(long id) {
		super();
		this.id = id;
		
	}	
	
	public Topic(long id, String subject, String name, String description) {
		super();
		this.id = id;
		this.subject = subject;
		this.name = name;
		this.description = description;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
