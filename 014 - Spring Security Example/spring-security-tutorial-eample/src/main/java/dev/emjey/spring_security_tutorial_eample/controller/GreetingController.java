package dev.emjey.spring_security_tutorial_eample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** This file is made by EmJey
 * Project: Spring Security Tutorial Example
 * FileName: GreetingController.java
 * Date: 2024/09/18
 * Modified Date: 2024/09/18
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */

@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingController {
    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello From Spring Security Tutorial Example");
    }

    @GetMapping("/say-good-bye")
    public ResponseEntity<String> sayGoodBye() {
        return ResponseEntity.ok("Goodbye From Spring Security Tutorial Example");
    }
}
