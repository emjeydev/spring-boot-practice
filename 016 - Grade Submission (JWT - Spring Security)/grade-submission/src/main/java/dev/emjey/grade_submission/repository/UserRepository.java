package dev.emjey.grade_submission.repository;

import dev.emjey.grade_submission.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * This file is made by EmJey
 * Project: GradeSubmission - Spring Security JWT
 * FileName: UserRepository.java
 * Date: 2024/11/22
 * Modified Date: 2024/11/22
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */


public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUsername(String username);
}