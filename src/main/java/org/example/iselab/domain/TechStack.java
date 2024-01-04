package org.example.iselab.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Builder
@AllArgsConstructor
public class TechStack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long techStackId;

    private String techStackName;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;


}
