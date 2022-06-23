package org.electricBrooms.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "comment")
public class Comment {
    @Id
    @Column(name = "sqn", nullable = false)
    private Long id;

    @Column(name = "text_comment")
    private String textComment;
}