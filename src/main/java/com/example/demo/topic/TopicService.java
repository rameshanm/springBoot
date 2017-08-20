package com.example.demo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("java", "Core Java", "This is is a Core  Java description"),
			new Topic("spring", "Spring Framework", "This is is a Spring Framework description"),
			new Topic("angular", "Angular Framework", "This is is a Angular Framework description")
			));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getOneTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

}
