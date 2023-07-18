package com.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.entities.User;

@Repository
public interface IUserRepository extends JpaRepository<User,String> {

}
