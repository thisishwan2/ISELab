package org.example.iselab.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Builder
@AllArgsConstructor
public class ProjectImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectImageId;

    private String imageUrl;

    private String imageName;

    private String imageDescription;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;



}
