package com.getset.hello.repository;

import com.getset.hello.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReposity extends JpaRepository<User, Long> {
}
