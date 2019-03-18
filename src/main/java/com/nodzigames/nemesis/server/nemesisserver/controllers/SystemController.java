package com.nodzigames.nemesis.server.nemesisserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
public class SystemController {

    @GetMapping("/time")
    public String getTime() {
        return (Long.toString(System.currentTimeMillis()));
    }


}
