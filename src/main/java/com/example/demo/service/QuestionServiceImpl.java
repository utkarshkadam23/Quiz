package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.QuestionsRepository;
import com.example.demo.model.Question;

@Service
public class QuestionServiceImpl implements QuestionService {

	private static List<Question> list=new ArrayList<>();
	@Autowired
	private QuestionsRepository questionsRepository;
	
	@Override
	public List<Question> getAllQuestions() {

		return questionsRepository.findAll();
	}

	@Override
	public List<Question> getByCategory(String category) {
		// TODO Auto-generated method stub
		return questionsRepository.findByCategory(category);
	}

	@Override
	public Question save(Question questions) {
		// TODO Auto-generated method stub
		return questionsRepository.save(questions);
	}

	
	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		questionsRepository.deleteById(id);
	}

//	@Override
//	public void update(Question questions,int id) {
//		// TODO Auto-generated method stub
//		list.stream().map(b->{
//			
//			if(b.getId()==questions.getId()) {
//				b.setCategory("ruby");
//				b.setDifficultyLevel("hard");
//				b.setOption1("");
//				b.setOption2("");
//				b.setOption3("");
//				b.setOption4("");
//				b.setQuestions("");
//				b.setRightAnswer("");
//				
//
//			
//				
//				
//		}return b;
//		}).collect(Collectors.toList());
//		
//	}

	
	}


