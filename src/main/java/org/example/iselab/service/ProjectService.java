package org.example.iselab.service;

import lombok.RequiredArgsConstructor;
import org.example.iselab.domain.File;
import org.example.iselab.domain.Project;
import org.example.iselab.domain.ProjectImage;
import org.example.iselab.domain.TechStack;
import org.example.iselab.repository.FileRepository;
import org.example.iselab.repository.ProjectImageRepository;
import org.example.iselab.repository.ProjectRepository;
import org.example.iselab.repository.TechStackRepository;
import org.example.iselab.response.AllProjectResponse;
import org.example.iselab.response.ProjectResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;
    private final TechStackRepository techStackRepository;
    private final FileRepository fileRepository;
    private final ProjectImageRepository projectImageRepository;

    public List<AllProjectResponse> getProjects() {

        List<Project> projects = projectRepository.findAll();

        ArrayList<AllProjectResponse> allProjectResponses = new ArrayList<>();

        for (Project project : projects) {
            List<TechStack> techStacks = techStackRepository.findByProject(project);
            allProjectResponses.add(AllProjectResponse.of(project.getProjectId(), project.getTitle(), project.getThumbnailUrl(), project.getPartnerCompany(), project.getPeriod(), techStacks));
        }

        return allProjectResponses;
    }

    public ProjectResponse getProject(Long projectId) {
        Project project = projectRepository.findById(projectId).orElseThrow(() -> new IllegalArgumentException("해당 프로젝트가 없습니다. id=" + projectId));

        List<TechStack> techStacks = techStackRepository.findByProject(project);
        List<ProjectImage> projectImages = projectImageRepository.findByProject(project);
        List<File> files = fileRepository.findByProject(project);

        return ProjectResponse.of(project.getProjectId(), project.getTitle(), project.getDescription(), project.getPartnerCompany(), project.getPeriod(), files, techStacks, projectImages);
    }
}
