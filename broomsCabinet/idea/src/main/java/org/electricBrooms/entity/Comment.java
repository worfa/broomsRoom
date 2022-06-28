package org.electricBrooms.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "comment")
public class Comment {
    @Id
    @Column(name = "sqn", nullable = false)
    private Long id;

    @Column(name = "text_comment")
    private String textComment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sqn_idea")
    private Idea sqnIdea;
}