package com.learning.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Users {
	
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private Integer id;
	
	private String name;
	private Integer salary;
	private String teamName;
}
