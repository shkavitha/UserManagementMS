package com.example.UserManagementService.Services.Interfaces;

import com.example.UserManagementService.Model.User;

import java.util.List;

public interface UserService {
    User getUserById(Long id);
    User updateUser(Long id, User userDetails);
    void deleteUser(Long id);
    List<User> getAllUsers();
    User addUser(User user);
}
