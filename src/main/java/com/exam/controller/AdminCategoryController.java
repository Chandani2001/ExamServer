package com.exam.controller;


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
import com.exam.service.AdminCategoryService;

@RestController
@RequestMapping("/admin/category")
@CrossOrigin("*")
public class AdminCategoryController {

	@Autowired
	private AdminCategoryService adminCategoryService;
	
	//Create Category
	@PostMapping("/")
	public ResponseEntity<?> addCategory(@RequestBody Category category)
	{
	this.adminCategoryService.addCategory(category);
	return ResponseEntity.ok("Post Success");
	}
	
	//Fetch Specific category from categoryId
	@GetMapping("/{categoryId}")
	public Category getCategory(@PathVariable("categoryId") Long categoryId) 
	{
		return this.adminCategoryService.getCategory(categoryId);
	}
	
	//Fetch all category
	@GetMapping("/")
	public ResponseEntity<?> getCategories()
	{
		return ResponseEntity.ok(this.adminCategoryService.getCategories());
	}
	
	//Update category details
	@PutMapping("/")
	public ResponseEntity<String> updateCategory(@RequestBody Category category)
	{
		 this.adminCategoryService.updateCategory(category);
		 return ResponseEntity.ok("Category Updated");
	}
	
	//Delete Category
	@DeleteMapping("/{categoryId}")
	public ResponseEntity<String> deleteCategory(@PathVariable("categoryId") Long categoryId)
	{
		this.adminCategoryService.deleteCategory(categoryId);
		return ResponseEntity.ok("Category Deleted");
	}
}
