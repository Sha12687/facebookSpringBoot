package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.demo.entity.User;
@Repository
public interface FBRepo extends  JpaRepository<User, Integer>  {

}
