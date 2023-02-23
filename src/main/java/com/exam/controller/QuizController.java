package com.exam.controller;

import java.util.List;

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

import com.exam.model.Category;
import com.exam.model.Quiz;
import com.exam.service.QuizService;

@RestController
@CrossOrigin("*")
@RequestMapping("/quiz")
public class QuizController {

	@Autowired
	private QuizService quizService;

    //Get all quiz
	@GetMapping("/")
	public ResponseEntity<?> quizzes()
	{
		return ResponseEntity.ok(this.quizService.getQuizzes());
	}

	//Get specific quiz
	@GetMapping("/{qid}")
	public Quiz quiz(@PathVariable("qid") Long qid)
	{
		return this.quizService.getQuiz(qid);
	}

    //Get all quiz by cid
	@GetMapping("/cid/{cid}")
	public List<Quiz> getQuizzrsCategory(@PathVariable("cid") Long cid)
	{
		Category category = new Category();
		category.setCid(cid);
		return this.quizService.getQuizzesOfCategory(category);
	}

	//Get all active quiz
	@GetMapping("/active")
	public List<Quiz> getActiveQuizzes() {
		return this.quizService.getActiveQuizzes();
	}

	//Get all active quiz of specific category
	@GetMapping("/category/active/cid/{cid}")
	public List<Quiz> getActiveQuizzes(@PathVariable("cid") long cid) {
		Category category = new Category();
		category.setCid(cid);
		return this.quizService.getActiveQuizzesOfCategory(category);
	}
}
