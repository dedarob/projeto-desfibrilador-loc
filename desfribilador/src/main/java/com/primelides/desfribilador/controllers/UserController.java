package com.primelides.desfribilador.controllers;


import com.primelides.desfribilador.models.User;
import com.primelides.desfribilador.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping
    public ResponseEntity<List<User>> userList(){
        List<User> list =(List<User>) userRepository.findAll();
        return ResponseEntity.status(200).body(list);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User newUser = userRepository.save(user);
        return ResponseEntity.status(201).body(newUser);
    }

    @PutMapping
    public ResponseEntity<User> editUser(@RequestBody User user){
        User newUser = userRepository.save(user);
        return ResponseEntity.status(200).body(newUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Integer id){
        userRepository.deleteById(id);
        return ResponseEntity.status(204).build();
    }
}
