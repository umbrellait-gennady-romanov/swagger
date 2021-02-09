package com.umbrellait.swagger.controller;

import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/")
public class HTTPController {


    @GetMapping(value = "/{id}")
    public String responseGetId(@PathVariable Long id) {
            return "hello id is - " + id;
    }

    @GetMapping
    public String responseGet () {
        return "method GET added " + LocalDateTime.now();
    }

}
