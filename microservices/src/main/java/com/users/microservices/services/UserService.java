package com.users.microservices.services;

import java.util.Optional;

import com.users.microservices.entities.Role;
import com.users.microservices.entities.User;
import com.users.microservices.services.register.RegistrationRequest;

public interface UserService {
    User saveUser(User user);

    User findUserByUsername(String username);

    Role addRole(Role role);

    User addRoleToUser(String username, String rolename);
    User registerUser(RegistrationRequest request);
    public void sendEmailUser(User u, String code);
    public User validateToken(String code);
}
