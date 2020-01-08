package com.kaideas.springbootstarter.lesson;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LessonRepository extends CrudRepository<Lesson, Long> {
	// CRUD OPERATIONS
	// getAllTopics()
	// getTopic(long id) - single topic
	// updateTopic(Topic t)
	// deleteTopic(long id)
	
	
	// findByCoursed finds by a numerical designation
	// rather than by course name (findByCourseName)
	public List<Lesson> findByCourseId(long courseId);
	
	

}
