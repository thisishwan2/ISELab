package org.example.iselab.repository;

import org.example.iselab.domain.File;
import org.example.iselab.domain.Project;
import org.example.iselab.domain.ProjectImage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FileRepository extends JpaRepository<File, Long> {
    List<File> findByProject(Project project);

}
