package org.electricBrooms.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "idea")
public class Idea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sqn", nullable = false)
    private Long id;

    @Column(name = "text_idea")
    private String textIdea;

}