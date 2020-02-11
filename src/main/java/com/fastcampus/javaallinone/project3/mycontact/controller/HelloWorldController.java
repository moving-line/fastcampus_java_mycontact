package com.fastcampus.javaallinone.project3.mycontact.controller;

import com.fastcampus.javaallinone.project3.mycontact.exception.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/api/helloWorld")
    public String helloWorld() {
        return "HelloWorld";
    }

    @GetMapping("/api/helloException")
    public String helloException() {
        throw new RuntimeException("Hello RuntimeException");
    }

    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<ErrorResponse> handleRuntimeException(RuntimeException e) {
        return new ResponseEntity<>(ErrorResponse.of(HttpStatus.INTERNAL_SERVER_ERROR, "알 수 없는 서버 오류가 발생하였습니다."), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
