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

import com.example.demo.tutorialApp.DAL.ITutorialUsersDAL;
import com.example.demo.tutorialApp.entities.Courses;
import com.example.demo.tutorialApp.entities.TutorialUsers;

@RestController
@RequestMapping("/tutorialApp")
@CrossOrigin("http://localhost:4200")
public class TutorialUsersREST {
	
	@Autowired
	ITutorialUsersDAL jpaUsers ;
	
	@GetMapping("/users")
	public List<TutorialUsers> getAll(){
		return jpaUsers.findAll();
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public void deleteUserById(@PathVariable int id) {
		jpaUsers.deleteById(id);
	}
	
	@PostMapping("/saveUser")
	public TutorialUsers saveUser(@RequestBody TutorialUsers c) {
		return jpaUsers.save(c);
	}
	
	@PutMapping("/updateUser")
	public void updateUser(@RequestBody TutorialUsers c) {
		jpaUsers.save(c);
	}
	
}	
