package com.qualigy.dockersb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jtf")
public class MyGrdleTestController {
    private Logger logger = LoggerFactory.getLogger(MyGrdleTestController.class);

    @GetMapping("/result/{message}")
    public String getInfo(@PathVariable String message) {
        logger.info("***** execution start *****");
        String msg = "Welcome to Bengaluru !!" + message;
        logger.info("***** execution end *****");
        return msg;
    }
}
