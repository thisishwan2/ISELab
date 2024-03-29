package org.example.iselab.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    @CreatedDate
    @Column(updatable = false, nullable = false, columnDefinition = "TIMESTAMP")
    @Comment("생성일자")
    private LocalDateTime createdAt;

    @LastModifiedBy
    @Column(columnDefinition = "TIMESTAMP")
    @Comment("수정일자")
    private LocalDateTime updateAt;

    @Column(nullable = false, columnDefinition = "bit(1) DEFAULT false")
    @Comment("삭제여부")
    private boolean isDeleted;
}
