package com.exam.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.model.Question;
import com.exam.model.Quiz;
import com.exam.service.QuestionService;
import com.exam.service.QuizService;

@RestController
@CrossOrigin("*")
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService service;

	@Autowired
	private QuizService quizService;

    //Get all questions of specific quiz
	@GetMapping("/quiz/{qid}")
	public ResponseEntity<?> getQuestionOfQuiz(@PathVariable("qid") Long qid) 
	{
		System.out.println(qid);
		Quiz quiz = this.quizService.getQuiz(qid);
		Set<Question> questions = quiz.getQuestions();
		List list = new ArrayList(questions);
		System.out.println("get number of questions"+quiz.getNumberOfQuestion());
		if (quiz.getNumberOfQuestion() != null && list.size() > Integer.parseInt(quiz.getNumberOfQuestion())) {
			list = list.subList(0, Integer.parseInt(quiz.getNumberOfQuestion() + 1));
		}
		Collections.shuffle(list);
		return ResponseEntity.ok(list);
	}

	//Get all question of any quiz
//	@GetMapping("/quiz/all/{qid}")
//	public ResponseEntity<?> getQuestionOfQuizadmin(@PathVariable("qid") Long qid) {
//		Quiz quiz = new Quiz();
//		quiz.setqId(qid);
//		Set<Question> questionOfQuiz = this.service.getQuestionOfQuiz(quiz);
//		return ResponseEntity.ok(questionOfQuiz);
//}

	
	//Get any question 
	@GetMapping("/{quesId}")
	public Question get(@PathVariable("quesId") Long quesId)
	{
		return this.service.getQuestion(quesId);
	}

}