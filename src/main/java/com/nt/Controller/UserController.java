package com.nt.Controller;

import com.nt.Dto.UserDto;
import com.nt.Entity.User;
import com.nt.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserRepo userRepo;

    @PostMapping
    @RequestMapping("/data")
    public ResponseEntity<String> getData(@RequestBody User user) {
        System.out.println("getData method");
        userRepo.save(user);
        return ResponseEntity.ok("User saved and sent to consumer service");

    }
}
