package com.example.demo.tutorialApp.DAL;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.tutorialApp.entities.Courses;

public interface ICourseDAL extends JpaRepository<Courses,Integer> {

}
