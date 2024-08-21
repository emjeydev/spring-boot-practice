package dev.emjey.simpole_form.Service;

import dev.emjey.simpole_form.model.User;
import dev.emjey.simpole_form.repository.UserRepository;
import org.springframework.stereotype.Service;

// This file is made by EmJey
// Project: Simple Form
// FileName: UserService.java
// Date: 2024/08/18
// Modified Date: 2024/08/18
// Email: emjeydev@gmail.com
// Github: emjeydev

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(String username, String password, String email) {
        if (username == null || password == null) {
            return null;
        } else {
            if (userRepository.findFirstByUsername(username).isPresent()) {
                System.out.println("Duplicate username found");
                return null;
            }
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setEmail(email);
            return userRepository.save(user);
        }
    }

    public User authenticateUser(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password).orElse(null);
    }
}
