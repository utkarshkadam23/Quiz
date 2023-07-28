package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Question;



public interface QuestionService {


	List<Question> getByCategory(String category);

	List<Question> getAllQuestions();

	Question save(Question questions);

	void deleteById(Integer id);

	

//	void update(Question questions, int id);


	

}
