package com.nodzigames.nemesis.server.nemesisserver.client;

import java.util.ArrayList;
import java.util.List;

public class ClientDatabase {

    private List<Client> clients;

    public ClientDatabase() {
        clients = new ArrayList<>();
    }

    public void addClient(Client newClient) {
        clients.add(newClient);
    }

    public Client getClientByToken(String token) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getToken().equals(token)) {
                return clients.get(i);
            }
        }
        return null;
    }

    public Client getClientByUsername(String username) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getUsername().equals(username)) {
                return clients.get(i);
            }
        }
        return null;
    }
}
