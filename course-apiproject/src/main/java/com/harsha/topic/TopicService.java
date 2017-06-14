package com.harsha.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	//since we are now using apache derby database, we can comment out these
	/*private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring framework descp"),
			new Topic("spring1", "Spring Framework1", "Spring framework descp1"),
			new Topic("spring2", "Spring Framework2", "Spring framework descp2") 
			));*/ 
	
	public List<Topic> getAllTopics(){
		//return topics;
		
		//create a list of topics to get it
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id){
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		//topics.add(topic);	
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		/*for(int i=0;i<topics.size();i++){
			Topic t = topics.get(i);
			if(t.getId().equals(id)){
			  topics.set(i,topic);
			  return;
			}
		}*/
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		/*for(int i=0;i<topics.size();i++){
			Topic t = topics.get(i);
			if(t.getId().equals(id)){
			  topics.remove(i);
			  return;
			}
		}*/
		topicRepository.delete(id);
			
	}
}
