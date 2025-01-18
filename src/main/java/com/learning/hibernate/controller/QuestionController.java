package com.learning.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.hibernate.dto.QuestionDto;
import com.learning.hibernate.entity.Answer;
import com.learning.hibernate.entity.Question;
import com.learning.hibernate.entity.repository.QuestionRepo;

@RestController
public class QuestionController {
	
	@Autowired
	private QuestionRepo quesitonRepo;
	
	@PostMapping("/question")
	public List<Question> createQuestion(@RequestBody QuestionDto question) {
		return quesitonRepo.saveAll(question.getQuestions());
	}

}
