package com.scm.app.services;

import com.scm.app.entities.User;
import com.scm.app.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

   @Autowired
   private UserRepo userRepo;

    public List<User> getAllUser()
    {
        return userRepo.findAll();
    }

    public User saveUser(User user)
    {
        return userRepo.save(user);
    }

    public Optional<User> getUser(int id)
    {
        return userRepo.findById(id);
    }
}
