package com.learning.hibernate.manytomany;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    private final ProjectRepo projectRepository;

    public ProjectService(ProjectRepo projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    public Project getProjectById(Integer id) {
        return projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Project not found with id: " + id));
    }

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Project updateProject(Integer id, Project projectDetails) {
        Project project = getProjectById(id);
        project.setProjectName(projectDetails.getProjectName());
        project.setAssignedEmployees(projectDetails.getAssignedEmployees());
        return projectRepository.save(project);
    }

    public void deleteProject(Integer id) {
        Project project = getProjectById(id);
        projectRepository.delete(project);
    }
}

