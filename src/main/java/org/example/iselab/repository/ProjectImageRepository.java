package org.example.iselab.repository;

import org.example.iselab.domain.Project;
import org.example.iselab.domain.ProjectImage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectImageRepository extends JpaRepository<ProjectImage, Long> {
    List<ProjectImage> findByProject(Project project);
}
