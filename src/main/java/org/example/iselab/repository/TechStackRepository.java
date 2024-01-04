package org.example.iselab.repository;

import org.example.iselab.domain.Project;
import org.example.iselab.domain.TechStack;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TechStackRepository extends JpaRepository<TechStack, Long> {

    List<TechStack> findByProject(Project project);
}
