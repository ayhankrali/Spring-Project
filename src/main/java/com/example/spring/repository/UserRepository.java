package com.example.spring.repository;

import entity.User;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
