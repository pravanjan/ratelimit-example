package com.ratelimit;

import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    // This is a dummy method to demonstrate the use of the RateLimit

    @GetMapping("/users")
    @RateLimiter(name = "userBackend")
    public String listUser() {
        return "This would list all users";
    }
}
