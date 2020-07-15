package com.example.demo.tutorialApp.DAL;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.tutorialApp.entities.TutorialUsers;

public interface ITutorialUsersDAL extends JpaRepository<TutorialUsers, Integer> {

}
