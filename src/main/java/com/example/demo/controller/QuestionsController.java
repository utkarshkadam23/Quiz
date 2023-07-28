package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Question;
import com.example.demo.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionsController {

	@Autowired
	private QuestionService questionService;
	
	@SuppressWarnings("unchecked")
	@GetMapping("/getallquestion")
	public List<Question> getAllQuestions(){
		
		return questionService.getAllQuestions();

	}
	
	@GetMapping("/getByCategory/{category}")
	public List<Question> getByCategory(@PathVariable("category") String category){
		
		
		return questionService.getByCategory(category);
		
		
	}
	@PostMapping("/save")
	public Question addQuestion(@RequestBody Question questions) {
		
		return questionService.save(questions);
		
		
	}
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable("id") Integer id ) {
		questionService.deleteById(id);
		
	}
//	@PutMapping("/update/{id}")
//	public Question updateById(@RequestBody Question questions,@PathVariable ("id") int id) {
//		
//		questionService.update(questions, id);
//		return questions;
	}

