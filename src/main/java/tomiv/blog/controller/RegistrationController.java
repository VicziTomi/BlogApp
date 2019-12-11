package tomiv.blog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import tomiv.blog.model.User;
import tomiv.blog.service.UserService;

@RestController
@RequestMapping(path = "/register")
public class RegistrationController {

    private UserService userService;
    private PasswordEncoder passwordEncoder;

    @PostMapping
    public ResponseEntity<User> register(@RequestBody User user) {
        System.out.println("im here");
        return ResponseEntity.ok(userService.create(user.userEncoded(passwordEncoder)));
    }

}
