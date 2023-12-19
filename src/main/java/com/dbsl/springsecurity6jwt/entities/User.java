package com.dbsl.springsecurity6jwt.entities;

import com.dbsl.springsecurity6jwt.util.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "\"user\"")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String name;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;
}
