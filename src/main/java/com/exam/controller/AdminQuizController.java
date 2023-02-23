package com.exam.controller;

import java.util.List;
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

import com.exam.model.Category;
import com.exam.model.Quiz;
import com.exam.service.AdminQuizService;

@RestController
@CrossOrigin("*")
@RequestMapping("/admin/quiz")
public class AdminQuizController {

	@Autowired
	private AdminQuizService adminQuizService;

	//Create Quiz
	@PostMapping("/")
	public ResponseEntity<Quiz> add(@RequestBody Quiz quiz)
	{
		return ResponseEntity.ok(this.adminQuizService.addQuiz(quiz));
	}

	//Update Quiz
	@PutMapping("/")
	public ResponseEntity<? > update(@RequestBody Quiz quiz) 
	{
		this.adminQuizService.updateQuiz(quiz);
		return ResponseEntity.ok("update");
	}

	//Get all Quiz
	@GetMapping("/")
	public Set<Quiz> getQuizzes() 
	{
		return this.adminQuizService.getQuizzes();
	}

	//Get specific quiz by qid
	@GetMapping("/{qid}")
	public Quiz quiz(@PathVariable("qid") Long qid)
	{
		return this.adminQuizService.getQuiz(qid);
	}

	//Delete quiz by qid
	@DeleteMapping("/{qid}")
	public ResponseEntity<String> delete(@PathVariable("qid") Long qid)
	{
		this.adminQuizService.deleteQuiz(qid);
		return ResponseEntity.ok("Quiz Deleted");
	}

	//Get all quiz of specific category by cid
	@GetMapping("/cid/{cid}")
	public List<Quiz> getQuizzrsCategory(@PathVariable("cid") Long cid)
	{
		Category category = new Category();
		category.setCid(cid);
		return this.adminQuizService.getQuizzesOfCategory(category);
	}

	//Get all active quiz
	@GetMapping("/active")
	public List<Quiz> getActiveQuizzes()
	{
		return this.adminQuizService.getActiveQuizzes();
	}

	//Get all active quiz of any category by cid
	@GetMapping("/category/active/cid/{cid}")
	public List<Quiz> getActiveQuizzes(@PathVariable("cid") long cid) {
		Category category = new Category();
		category.setCid(cid);
		return this.adminQuizService.getActiveQuizzesOfCategory(category);
	}
}
