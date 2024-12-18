package com.example.UserManagementService.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "username", length = 50, nullable = false)
    private String username;

    @Column(name = "email", length = 100, nullable = false)
    private String email;

    @Column(name = "password_hash", columnDefinition = "TEXT", nullable = false)
    private String passwordHash;

    @Column(name = "phone_number", length = 15, nullable = true)
    private String phoneNumber;

    @Column(name = "two_factor_enabled", nullable = false)
    private Boolean twoFactorEnabled = false;

    @Column(name = "kyc_status", length = 20, nullable = false)
    private String kycStatus = "pending";

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt=LocalDateTime.now();

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt=LocalDateTime.now();
}
