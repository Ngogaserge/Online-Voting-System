package com.serge.votingapp.service;

import com.serge.votingapp.model.User;
import com.serge.votingapp.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
    public List<User> getUsers();

    void deleteUserById(Long id);

    User getUserById(Long id);

    public void updateUser(Long id, User updatedUser);
}
