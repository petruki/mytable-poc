package com.pj3275.mytable.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pj3275.mytable.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    
    List<User> findByName(String name);
    
}
