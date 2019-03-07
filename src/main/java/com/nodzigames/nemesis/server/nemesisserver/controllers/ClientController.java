package com.nodzigames.nemesis.server.nemesisserver.controllers;

import com.nodzigames.nemesis.server.nemesisserver.NemesisServerApplication;
import com.nodzigames.nemesis.server.nemesisserver.client.Client;
import com.nodzigames.nemesis.server.nemesisserver.client.GetClientRequest;
import com.nodzigames.nemesis.server.nemesisserver.client.LoginRequest;
import com.nodzigames.nemesis.server.nemesisserver.client.RegisterClientRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {

    @PostMapping("/register")
    public String registerClient(@RequestBody RegisterClientRequest req) {

        if (req.getPassword() == null || req.getUsername() == null) {
            return "Failed to register client. Missing fields";
        }

        if (NemesisServerApplication.clientDatabase.getClientByUsername(req.getUsername()) != null) {
            return "Failed to register client. Username is taken";
        }

        Client client = new Client(req.getUsername(), req.getPassword());

        NemesisServerApplication.clientDatabase.addClient(client);

        return "Client registered successfully";
    }

    @PostMapping("/retrieve")
    public Client retrieve(@RequestBody GetClientRequest req) {
        if (req.getUsername() == null) {
            return null;
        }

        return NemesisServerApplication.clientDatabase.getClientByUsername(req.getUsername());
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest req) {
        if (NemesisServerApplication.clientDatabase.getClientByUsername(req.getUsername()) == null) {
            return "This username does not exist!";
        }

        if (NemesisServerApplication.clientDatabase.getClientByUsername(req.getUsername()).getPassword().equals(req.getPassword())) {
            return NemesisServerApplication.clientDatabase.getClientByUsername(req.getUsername()).getToken();
        }

        return ("Incorrect password!");
    }
}
