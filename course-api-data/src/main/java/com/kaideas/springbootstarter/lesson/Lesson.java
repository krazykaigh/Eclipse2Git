package com.kaideas.springbootstarter.lesson;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.kaideas.springbootstarter.course.Course;
import com.kaideas.springbootstarter.topic.Topic;

@Entity
public class Lesson {
	
	@Id
	private long id;
	private String subject;
	private String name;
	private String description;
	
//	@ManyToOne
//	private Topic topic;
	
	@ManyToOne
	private Course course;
	
	public Lesson() {

	}	
	
	public Lesson(long lessonId, String subject, String name, String description, long courseId) {
		super();
		
		this.id = lessonId;
		this.subject = subject;
		this.name = name;
		this.description = description;
		
		this.course = new Course(courseId);
		//this.course = new Course(courseId, "", "", "", , long courseId);
	}
	
	public long getId() {
		return id;
	}
	public void setId(long lessonId) {
		this.id = lessonId;
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

	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}

}
