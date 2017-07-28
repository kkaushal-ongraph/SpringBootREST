package com.ritz.restapi.rest;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ritz.restapi.jpa.UserRepository;
import com.ritz.restapi.model.User;
import com.ritz.restapi.util.JSONObject;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;
import sun.plugin.javascript.navig.JSObject;

@RestController
public class LoginController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<Object> login(@RequestBody User usr) {
        User user = userRepository.findByEmail(usr.getEmail());
        if (user == null)
            return new ResponseEntity<Object>(new JSONObject("User Not Found", user),HttpStatus.NOT_FOUND);
        else if (!usr.getPassword().equals(user.getPassword()))
            return new ResponseEntity<Object>(new JSONObject("Invalid Credentials", null), HttpStatus.UNAUTHORIZED);
        else
            return new ResponseEntity<Object>(new JSONObject("Login Succuessfull", user), HttpStatus.OK);
    }
}