package com.minsoo.api.model.common;

import java.time.OffsetDateTime;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class DomainEntity {
    @Id
    private Long id;

    private OffsetDateTime createdDate;
    private OffsetDateTime modifiedDate;
    private OffsetDateTime removedDate;

    @PrePersist
    protected void onCreate() {
        if (id == null) {
            id = (long) (Math.random() * 90000000l) + 10000000l;
        }

        createdDate = OffsetDateTime.now();
    }

    @PreUpdate
    protected void onModify() {
        modifiedDate = OffsetDateTime.now();
    }

    public void remove() {
        removedDate = OffsetDateTime.now();
    }
}
