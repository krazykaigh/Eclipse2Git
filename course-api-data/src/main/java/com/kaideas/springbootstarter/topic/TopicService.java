package com.kaideas.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics() {
		// return topics;
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	
	public Optional<Topic> getTopic(long id) {
		// return topics.stream().filter(t-> t.getSubject().equals(subject)).findFirst().get();
		return topicRepository.findById(id);
	}
	
	public void addTopic(Topic topic) {
		//topics.add(topic);
		topicRepository.save(topic);
	}

	public void updateTopic(long id, Topic topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(long id) throws IllegalArgumentException{
		//topics.removeIf(t -> t.getSubject().equals(subject));
		try {
				topicRepository.deleteById(id);
		} catch(Exception e) {
			System.out.println(e);
		} 
	}
	
}
