package com.scm.app.repo;

import com.scm.app.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    // implementing UserDetails for Spring Security.

    @Query("Select u from User u where u.email = :email")
    public User getUserByUserName(@Param("email") String email);
}
