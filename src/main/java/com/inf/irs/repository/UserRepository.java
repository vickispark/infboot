package com.inf.irs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.inf.irs.entity.UserEntity;
public interface UserRepository extends JpaRepository<UserEntity, String>{
}