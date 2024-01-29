package com.example.demo.domain.member.entity;

import com.example.demo.global.jpa.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Comment;


@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Member extends BaseEntity {
    @Comment("userID")
    @Column(unique = true)
    private String username;
    @Column(unique = true)
    private String nickname;
    @Column(unique = true)
    private String email;
    private String password;
}
