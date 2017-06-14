package com.harsha.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	//since we are now using apache derby database, we can comment out these
	/*private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring framework descp"),
			new Topic("spring1", "Spring Framework1", "Spring framework descp1"),
			new Topic("spring2", "Spring Framework2", "Spring framework descp2") 
			));*/ 
	
	public List<Course> getAllCourses(String topicId){
		//return topics;
		
		//create a list of topics to get it
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId)
			.forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id){
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get(); 
		return courseRepository.findOne(id);
	}

	public void addCourse(Course course) {
		//topics.add(topic);	
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		/*for(int i=0;i<topics.size();i++){
			Topic t = topics.get(i);
			if(t.getId().equals(id)){
			  topics.set(i,topic);
			  return;
			}
		}*/
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		/*for(int i=0;i<topics.size();i++){
			Topic t = topics.get(i);
			if(t.getId().equals(id)){
			  topics.remove(i);
			  return;
			}
		}*/
		courseRepository.delete(id);
			
	}
}
