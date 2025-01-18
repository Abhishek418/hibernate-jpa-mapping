package com.learning.hibernate.dto;

import java.util.List;

import com.learning.hibernate.entity.Question;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class QuestionDto {
	private List<Question> questions;
}
