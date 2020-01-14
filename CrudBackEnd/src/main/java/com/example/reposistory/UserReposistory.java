package com.example.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.User;

public interface UserReposistory extends JpaRepository<User, Long> {

}
