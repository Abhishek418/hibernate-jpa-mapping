package com.learning.hibernate.manytomany;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeDTO {
	private Integer employeeId;
	private String employeeName;
	private Set<Project> projects;
}
