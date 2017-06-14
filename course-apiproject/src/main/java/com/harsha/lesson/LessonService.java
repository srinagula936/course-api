package com.harsha.lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class LessonService {
	
	@Autowired
	private LessonRepository lessonRepository;
	
	//since we are now using apache derby database, we can comment out these
	/*private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring framework descp"),
			new Topic("spring1", "Spring Framework1", "Spring framework descp1"),
			new Topic("spring2", "Spring Framework2", "Spring framework descp2") 
			));*/ 
	
	public List<Lesson> getAllLessons(){
		//return topics;
		
		//create a list of topics to get it
		List<Lesson> topics = new ArrayList<>();
		lessonRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Lesson getLesson(String id){
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return lessonRepository.findOne(id);
	}

	public void addLesson(Lesson lesson) {
		//topics.add(topic);	
		lessonRepository.save(lesson);
	}

	public void updateLesson(String id, Lesson lesson) {
		/*for(int i=0;i<topics.size();i++){
			Topic t = topics.get(i);
			if(t.getId().equals(id)){
			  topics.set(i,topic);
			  return;
			}
		}*/
		lessonRepository.save(lesson);
	}

	public void deleteLesson(String id) {
		/*for(int i=0;i<topics.size();i++){
			Topic t = topics.get(i);
			if(t.getId().equals(id)){
			  topics.remove(i);
			  return;
			}
		}*/
		lessonRepository.delete(id);		
	}
}
