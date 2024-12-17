package com.example.UserManagementService.Service;

import com.example.UserManagementService.Model.User;

import java.util.List;

public interface UserService {

    User addUser(User user);
    List<User> getAllUsers();
}
