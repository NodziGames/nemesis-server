package com.nodzigames.nemesis.server.nemesisserver.logic;

import com.nodzigames.nemesis.server.nemesisserver.pool.PoolDatabase;

import java.util.TimerTask;

public class TickerHour extends TimerTask {

    private PoolDatabase poolDatabase;

    public TickerHour(PoolDatabase poolDatabase) {
        this.poolDatabase = poolDatabase;
    }

    public void run() {
        poolDatabase.refreshPools();
    }
}
