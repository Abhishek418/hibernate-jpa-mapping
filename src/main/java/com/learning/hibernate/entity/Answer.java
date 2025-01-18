package com.learning.hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Answer {
	
	@Id
	@GeneratedValue
	private int answerId;
	private String answer;
	
	@OneToOne(mappedBy = "answer")
	private Question question;
}
