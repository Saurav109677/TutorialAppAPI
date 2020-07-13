package com.example.demo.youtubeFireBaseChannel;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@CrossOrigin("http://localhost:4200")
public class User01RESTAPI  {
	
	@Autowired
	 IUser01 jpaRepo;	
	
	@GetMapping("/user01")
	public List<User01> getUser01(){
		return jpaRepo.findAll();
	}
	
	@PostMapping("/save")
	public User01 insertUser01(@RequestBody User01 u) {
		System.out.println(u);
		return jpaRepo.save(u);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteUser01(@PathVariable int id) {
	 jpaRepo.deleteById(id);
		
	}
	
	@PutMapping("/update")
	public void updateUser01(@RequestBody User01 u) {
		jpaRepo.save(u);
	}
	
}
