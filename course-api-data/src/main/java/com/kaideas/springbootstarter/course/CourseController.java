package com.kaideas.springbootstarter.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kaideas.springbootstarter.topic.Topic;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable long id) {
		return courseService.getAllCourses(id);
		//c-R(ALL)-ud
	}

	@RequestMapping(method = RequestMethod.GET, value = "/topics/{topicId}/courses/{id}")
	public Optional<Course> getTopic(@PathVariable long id) {
		return courseService.getCourse(id);
		// c-R-ud
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
	public void addTopic(@RequestBody Course course, @PathVariable long topicId) {
		course.setTopic(new Topic(topicId));
		courseService.addCourse(course);
		// C-rud
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable long topicId, @PathVariable long id) {
		course.setTopic(new Topic(topicId));
		courseService.updateCourse(course);
		// cr-U-d
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{id}")
	public void deleteTopic( @PathVariable long id) {
		courseService.deleteCourse(id);
		// cru-D
		
	}
}
