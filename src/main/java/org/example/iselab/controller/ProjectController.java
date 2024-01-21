package org.example.iselab.controller;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.example.iselab.response.AllProjectResponse;
import org.example.iselab.response.ProjectResponse;
import org.example.iselab.service.ProjectService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("http://43.201.237.33:3000")
public class ProjectController {

    private final ProjectService projectService;

    // 메인 화면
    @GetMapping("/projects")
    public List<AllProjectResponse> getProjects() {
        return projectService.getProjects();
    }

    // 상세 화면
    @GetMapping("/projects/{projectId}")
    public ProjectResponse getProject(@PathVariable Long projectId) {
        return projectService.getProject(projectId);
    }
}
