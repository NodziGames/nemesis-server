package com.nodzigames.nemesis.server.nemesisserver.controllers;

import com.nodzigames.nemesis.server.nemesisserver.NemesisServerApplication;
import com.nodzigames.nemesis.server.nemesisserver.pool.Pool;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pool")
public class PoolController {

    @GetMapping("/all")
    public List<Pool> all() {
        return NemesisServerApplication.poolDatabase.getPools();
    }
}
