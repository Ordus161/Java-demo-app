package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.repository.UserRepo;

@RestController
@RequestMapping("/users")
public class UserController {

//Reminder:@Autowired - mark for the Spring,means that userRepo should be initialized by framework
    @Autowired
    private UserRepo userRepo;

    @PostMapping
    public ResponseEntity registration(@RequestBody UserEntity user) {
        try {
            userRepo.save(user);
            return ResponseEntity.ok("Пользователь успешно сохранен");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }


    @GetMapping
    public ResponseEntity getUsers(){
        try {
            return ResponseEntity.ok("Сервер работатет");
        } catch (Exception e) {
        return ResponseEntity.badRequest().body("Произошла ошибка");
            }
        }
    }

