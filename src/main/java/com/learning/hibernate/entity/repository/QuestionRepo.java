package com.learning.hibernate.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.hibernate.entity.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer>{

}
