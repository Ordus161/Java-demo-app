package com.example.demo.repository;

import com.example.demo.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

//Reminder:CrudRepository <params> - Entity witch it's working with,and the type of its id
public interface UserRepo extends CrudRepository<UserEntity, Long> {
}
