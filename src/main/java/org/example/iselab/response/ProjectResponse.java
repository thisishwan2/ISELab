package org.example.iselab.response;

import lombok.Builder;
import lombok.Getter;
import org.example.iselab.domain.File;
import org.example.iselab.domain.ProjectImage;
import org.example.iselab.domain.TechStack;

import java.util.List;

@Getter
@Builder
public class ProjectResponse {

    private Long projectId;
    private String title;
    private String description;
    private String partnerCompany;
    private String period;
    private List<File> files;
    private List<TechStack> techStacks;
    private List<ProjectImage> projectImages;

    public static ProjectResponse of(Long projectId, String title, String description, String partnerCompany, String period, List<File> files, List<TechStack> techStacks, List<ProjectImage> projectImages) {
        return ProjectResponse.builder()
                .projectId(projectId)
                .title(title)
                .description(description)
                .partnerCompany(partnerCompany)
                .period(period)
                .files(files)
                .techStacks(techStacks)
                .projectImages(projectImages)
                .build();
    }
}
