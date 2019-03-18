package com.nodzigames.nemesis.server.nemesisserver.logic;

import com.nodzigames.nemesis.server.nemesisserver.client.Client;
import com.nodzigames.nemesis.server.nemesisserver.client.ClientDatabase;

import java.util.List;
import java.util.TimerTask;

//This is the logic that gets ticked once per minute.
public class TickerMinute extends TimerTask {
    private ClientDatabase clientDatabase;

    public TickerMinute(ClientDatabase clientDatabase) {
        this.clientDatabase = clientDatabase;
    }

    public void run() {
        clientUpdates();
    }

    public void clientUpdates() {
        //Contains all the functions to be performed to the clients on a minutely basis
        List<Client> clients = clientDatabase.getAllClients();

        for (Client c : clients) {
            c.setData(c.getData() + c.getDataFarms());
        }
    }
}
