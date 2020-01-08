package com.kaideas.springbootstarter.lesson;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kaideas.springbootstarter.course.Course;

@RestController
public class LessonController {
	
	@Autowired
	private LessonService lessonService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/topics/{topicId}/courses/{courseId}/lessons")
	public List<Lesson> getAllLessons(@PathVariable long topicId, @PathVariable long courseId) {
		return lessonService.getAllLessons(courseId);
		//c-R(ALL)-ud
	}

	@RequestMapping(method = RequestMethod.GET, value = "/topics/{topicId}/courses/{courseId}/lessons/{lessonId}")
	public Optional<Lesson> getCourse(@PathVariable long lessonId) {
		return lessonService.getLesson(lessonId);
		// c-R-ud
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/courses/{courseId}/lessons")
	public void addCourse(@RequestBody Lesson lesson, @PathVariable long courseId) {
		lesson.setCourse(new Course(courseId));
		lessonService.addLesson(lesson);
		// C-rud
	}

//	@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses/{courseId}/lessons")
//	public void addCourse(@RequestBody Lesson lesson, @PathVariable long topicId, @PathVariable long courseId) {
//		lesson.setCourse(new Course(courseId));
//		lessonService.addLesson(lesson);
//		// C-rud
//	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/courses/{courseId}/lessons/{lessonId}")
	public void updateCourse(@RequestBody Lesson lesson, @PathVariable long courseId, @PathVariable long lessonId) {
		lesson.setCourse(new Course(courseId));
		lessonService.updateLesson(lesson);
		// cr-U-d
	}
	
//	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{courseId}/lessons/{lessonId}")
//	public void updateCourse(@RequestBody Lesson lesson, @PathVariable long topicId, @PathVariable long courseId,
//			@PathVariable long lessonId) {
//		lesson.setCourse(new Course(courseId));
//		lessonService.updateLesson(lesson);
//		// cr-U-d
//	}
	

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{courseId}/lessons/{lessonId}")
	public void deleteCourse( @PathVariable long lessonId) {
		lessonService.deleteLesson(lessonId);
		// cru-D
		
	}
}
