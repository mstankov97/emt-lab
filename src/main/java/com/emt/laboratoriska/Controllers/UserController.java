package com.emt.laboratoriska.Controllers;

import com.emt.laboratoriska.Entities.User;
import com.emt.laboratoriska.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/user",method = RequestMethod.GET)
public class UserController {

    @Autowired
    private  UserRepository userRepository;

    @PostMapping(value = "/add")
    User addUser(@RequestBody User user){

        return userRepository.save(user);

    }
}
