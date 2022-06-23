package org.electricBrooms.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "\"user\"")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sqn", nullable = false)
    private Long id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "avatar_url")
    private String avatarUrl;

    @Column(name = "token_user")
    private String tokenUser;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "cabinet")
    private String cabinet;

    @Column(name = "sqn_department")
    private Long sqnDepartment;

    @Column(name = "sqn_role")
    private Long sqnRole;

    @Column(name = "sqn_position")
    private Long sqnPosition;

    @Column(name = "coins")
    private Integer coins;

    @Column(name = "karma")
    private Integer karma;
}