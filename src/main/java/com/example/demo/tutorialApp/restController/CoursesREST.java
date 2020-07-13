package com.example.demo.tutorialApp.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.tutorialApp.DAL.ICourseDAL;
import com.example.demo.tutorialApp.entities.Courses;

@RestController
@RequestMapping("/tutorialApp")
@CrossOrigin("http://localhost:4200")
public class CoursesREST {
	
	@Autowired
	 ICourseDAL  jpaCourses;
	
	@GetMapping("/courses")
	public List<Courses> getCourses() {
		return jpaCourses.findAll();
	}
	
	@PostMapping("/saveCourse")
	public Courses saveCourse(@RequestBody Courses c) {
		return jpaCourses.save(c);
	}
	
	@DeleteMapping("/deleteCourse/{id}")
	public void deleteCourseById(@PathVariable int id) {
		jpaCourses.deleteById(id);
	}
	
	@PutMapping("/updateCourse")
	public void updateCourse(@RequestBody Courses c) {
		jpaCourses.save(c);
	}
}
