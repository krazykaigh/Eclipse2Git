package com.kaideas.springbootstarter.lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {
	
	@Autowired
	private LessonRepository lessonRepository;
	
	public List<Lesson> getAllLessons(long courseId) {
		// return topics;
		List<Lesson> lessons = new ArrayList<>();
		lessonRepository.findByCourseId(courseId)
		.forEach(lessons::add);
		return lessons;
	}
	
	public Optional<Lesson> getLesson(long lessonId) {
		return lessonRepository.findById(lessonId);
	}
	
	public void addLesson(Lesson lesson) {
		lessonRepository.save(lesson);
	}

	public void updateLesson(Lesson lesson) {
		lessonRepository.save(lesson);
	}

	public void deleteLesson(long lessonId) {
		try {
				lessonRepository.deleteById(lessonId);
		} catch(Exception e) {
			System.out.println(e);
		} 
	}
	
}
