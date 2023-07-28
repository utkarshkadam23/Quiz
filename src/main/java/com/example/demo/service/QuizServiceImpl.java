package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.QuestionsRepository;
import com.example.demo.dao.QuizRepository;
import com.example.demo.model.Question;
import com.example.demo.model.Quiz;
@Service
public class QuizServiceImpl implements QuizService{

	@Autowired
	private QuizRepository quizRepository;
	
	@Autowired
	private QuestionsRepository questionsRepository;
	
	@Override
	public void createQuiz(String category, String title, int quizid) {
		// TODO Auto-generated method stub
		List<Question> questions=questionsRepository.findRandomQuestionsByCategory(category,quizid);
		Quiz quiz =new Quiz(); 
		quiz.setTitle(title);
		quiz.setQuestions(questions);
		quizRepository.save(quiz);
	}

}
