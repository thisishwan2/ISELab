package org.example.iselab.response;

import lombok.Builder;
import lombok.Getter;
import org.example.iselab.domain.TechStack;

import java.util.List;

@Getter
@Builder
public class AllProjectResponse {

    private Long projectId;
    private String title;
    private String thumbnailUrl;
    private String partnerCompany;
    private String period;
    private List<TechStack> techStacks;

    public static AllProjectResponse of(Long projectId, String title, String thumbnailUrl, String partnerCompany, String period, List<TechStack> techStacks) {
        return AllProjectResponse.builder()
                .projectId(projectId)
                .title(title)
                .thumbnailUrl(thumbnailUrl)
                .partnerCompany(partnerCompany)
                .period(period)
                .techStacks(techStacks)
                .build();
    }
}
