package org.example.iselab.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Builder
@AllArgsConstructor
public class Project extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectId;

    private String thumbnailUrl;

    private String title;

    private String description;

//    @OneToMany
//    @JoinColumn(name = "techStack_id")
//    private List<TechStack> techStack;
//
//    @OneToMany
//    @JoinColumn(name = "projectImage_id")
//    private List<ProjectImage> projectImages;
//
//    @OneToMany
//    @JoinColumn(name = "file_id")
//    private List<File> files;

    private String partnerCompany;

    private String period;



}
