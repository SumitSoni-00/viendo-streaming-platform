package com.viendo.streaming.platform.app.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
public abstract class BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="created_date")
   // @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdDate;

    @Column(name="mmodified_date")
    // @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime modifiedDate;

    @Column(name="created_by")
    private Long createdBy;

    @Column(name="modified_by")
    private Long modifiedBy;

}
