package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Question;

@Repository
public interface QuestionsRepository extends JpaRepository<Question, Integer> {

	List<Question> findAll();

	List<Question> findByCategory(String category);

	
	@Query(value = "SELECT * FROM questionsex q WHERE q.category=:category ORDER BY RANDOM() &LIMIT:numQ",nativeQuery=true)
	List<Question> findRandomQuestionsByCategory(String category,int numQ);

//	void update(Question questions, Integer id);

	
}
