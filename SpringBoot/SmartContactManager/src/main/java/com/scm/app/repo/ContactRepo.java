package com.scm.app.repo;

import com.scm.app.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepo extends JpaRepository <Contact,Integer> {
}
