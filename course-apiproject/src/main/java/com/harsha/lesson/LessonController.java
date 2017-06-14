package com.harsha.lesson;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LessonController {
	
	@Autowired 
	private LessonService lessonService;
	
	@RequestMapping(value = "/topics/{id}/courses/{id}/lessons")
	public List<Lesson> getAllLessons(){
		return lessonService.getAllLessons();
	}
	
	@RequestMapping("topics/{topicId}/courses/{Id}/lessons/{id}")
	public Lesson getLesson(@PathVariable String id){
		return lessonService.getLesson(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics/{topicId}/courses/{courseId}/lessons")
	public void addLesson(@RequestBody Lesson lesson){
		lessonService.addLesson(lesson);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{topicId}/courses/{Id}/lessons/{id}")
	public void updateLesson(@RequestBody Lesson lesson,@PathVariable String id){
		lessonService.updateLesson(id, lesson);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{topicId}/courses/{Id}/lessons/{id}")
	public void deleteLesson(@RequestBody Lesson lesson,@PathVariable String id){
		lessonService.deleteLesson(id);
	}
	
	
	
}
