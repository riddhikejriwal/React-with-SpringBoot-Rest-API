package com.riddhi.reactexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riddhi.reactexample.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
