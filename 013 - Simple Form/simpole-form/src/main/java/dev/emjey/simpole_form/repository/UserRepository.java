package dev.emjey.simpole_form.repository;

import dev.emjey.simpole_form.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// This file is made by EmJey
// Project: Simple Form
// FileName: UserRepository.java
// Date: 2024/08/18
// Modified Date: 2024/08/18
// Email: emjeydev@gmail.com
// Github: emjeydev

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsernameAndPassword(String username, String password);
    Optional<User> findFirstByUsername(String username);
}
