package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.QuizService;


@RestController
@RequestMapping("/quiz")
public class QuizController {

	@Autowired
	private QuizService quizService;
	@PostMapping("/create")
	public String createQuiz(@RequestParam String category,@RequestParam int numQ,@RequestParam String title) {
		
		quizService.createQuiz(title, category, numQ);
		return "created sucessfully ";
		
	}
	
}
