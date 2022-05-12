package com.wf.hackathon.controller;

import com.wf.hackathon.model.SuccessResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hello")
    public ResponseEntity<SuccessResponse> hello() {
        return new ResponseEntity(new SuccessResponse(200, "Success", "Hello"), HttpStatus.OK);

    }
}
