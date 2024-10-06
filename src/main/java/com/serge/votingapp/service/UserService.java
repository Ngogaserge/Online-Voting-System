package com.serge.votingapp.service;

import com.serge.votingapp.model.User;
import com.serge.votingapp.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
