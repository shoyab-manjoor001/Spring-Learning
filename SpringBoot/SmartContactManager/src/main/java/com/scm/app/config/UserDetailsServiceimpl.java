package com.scm.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.scm.app.entities.User;
import com.scm.app.repo.UserRepo;
import com.scm.app.services.UserService;

public class UserDetailsServiceimpl implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepo.getUserByUserName(username);

        if (user == null) {
            throw new UsernameNotFoundException("User Not Found!!");
        }

        CustomUserDetails customUserDetails = new CustomUserDetails(user);

        return customUserDetails;
    }

}
