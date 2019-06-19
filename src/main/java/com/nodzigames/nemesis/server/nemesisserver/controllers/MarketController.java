package com.nodzigames.nemesis.server.nemesisserver.controllers;

import com.nodzigames.nemesis.server.nemesisserver.NemesisServerApplication;
import com.nodzigames.nemesis.server.nemesisserver.client.Client;
import com.nodzigames.nemesis.server.nemesisserver.market.BuyRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/market")
public class MarketController {
    @PostMapping("/buy")
    public String buy(@RequestBody BuyRequest body) {

        Client client = NemesisServerApplication.clientDatabase.getClientByToken(body.getToken());

        long price = ((client.getDataFarms() + body.getAmount()) * 100) - 100;

        if (client.getData() < price) {
            return "Purchase failed... Insufficient balance";
        }

        client.setDataFarms(client.getDataFarms() + 1);
        client.setData(client.getData() - price);


        return "Purchase Successful!";
    }
}
