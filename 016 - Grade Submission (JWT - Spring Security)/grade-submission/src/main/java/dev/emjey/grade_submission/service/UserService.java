package dev.emjey.grade_submission.service;

import dev.emjey.grade_submission.entity.User;

/**
 * This file is made by EmJey
 * Project: GradeSubmission - Spring Security JWT
 * FileName: UserService.java
 * Date: 2024/11/22
 * Modified Date: 2024/11/22
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */


public interface UserService {
    User getUser(Long id);
    User getUser(String username);
    User saveUser(User user);
}