package com.upiiz.users.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class UserEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;


    @Column(name = "username", nullable = false, unique = true) // Aseguramos las restricciones
    private String username;

    @Column(name = "email", nullable = false) // Se añade el campo email
    private String email;

    @Column(name = "password_hash", nullable = false) // Cambia password a password_hash
    private String password;

    @Column(name = "created_at", updatable = false) // Especificamos que no se actualiza
    private String createdAt;

    @Column(name = "updated_at") // Se mapea la columna updated_at
    private String updatedAt;
}
