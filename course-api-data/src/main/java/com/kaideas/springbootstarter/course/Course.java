package com.kaideas.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.kaideas.springbootstarter.topic.Topic;

@Entity
public class Course {
	
	@Id
	private long id;
	private String subject;
	private String name;
	private String description;
	
	@ManyToOne
	private Topic topic;
	
	public Course() {

	}	

	public Course(long id) {
		super();
		this.id = id;
	}	

	public Course(long id, String subject, String name, String description) {
		super();
		this.id = id;
		this.subject = subject;
		this.name = name;
		this.description = description;
		
		this.topic = new Topic();
		// this.topic = new Topic(topicId, "", "", "", long topicId);
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
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}

}
