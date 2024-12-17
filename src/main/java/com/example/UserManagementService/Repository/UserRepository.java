package com.example.UserManagementService.Repository;

import com.example.UserManagementService.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
