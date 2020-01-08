package com.kaideas.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
	// CRUD OPERATIONS
	// getAllTopics()
	// getTopic(long id) - single topic
	// updateTopic(Topic t)
	// deleteTopic(long id)
	
	
	// findByTopicId finds by a numerical designation
	// rather than by topic name (findByTopicName)
	public List<Course> findByTopicId(long topicId);
	
	

}
