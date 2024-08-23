package com.ratelimit;

import io.github.resilience4j.ratelimiter.RequestNotPermitted;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(RequestNotPermitted.class)
    public ResponseEntity<ErrorObject> handleRequestNotPermitted() {

        return new ResponseEntity<>(new ErrorObject("Request not permitted", 429), HttpStatus.TOO_MANY_REQUESTS);
    }
}
