package com.learning.hibernate.entity;


import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserLog {
	
	@Id
	@GeneratedValue
	@Column(name = "log_id")
	private Integer id;
	
	private String log;
	
	@ManyToOne
	@Cascade(CascadeType.ALL)
	@JoinColumn(name = "log_user_fk",referencedColumnName = "user_id")
	private Users user;
}
