package com.nodzigames.nemesis.server.nemesisserver.client;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nodzigames.nemesis.server.nemesisserver.algorithms.TokenGenerator;

public class Client {

    //The token is kept secret from all other players. This is returned to the terminal when you log in, and is used to make requests to the server.
    //The reason why we don't use the username is because players can then spoof requests on your username. The token is something only a logged in user has access to.
    //When another player finally gets hold of your token, he can then proceed to delete your account to win the game.
    @JsonIgnore
    private String token;

    //This is unique to each client, and also publicly available to all other clients. Consider it a public token
    private String username;

    @JsonIgnore
    private String password;

    private int firewallLevel;
    private long data; //Currency

    public Client(String username, String password) {
        this.username = username;
        this.password = password;

        token = TokenGenerator.GenerateToken();

        data = 100;

        firewallLevel = 1;
    }



    //Getters and Setters

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getFirewallLevel() {
        return firewallLevel;
    }

    public void setFirewallLevel(int firewallLevel) {
        this.firewallLevel = firewallLevel;
    }

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
    }
}
