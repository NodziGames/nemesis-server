package com.nodzigames.nemesis.server.nemesisserver.pool;

import java.util.ArrayList;
import java.util.List;

public class PoolDatabase {

    private List<Pool> pools;

    public PoolDatabase() {
        pools = new ArrayList<Pool>();
        refreshPools();
    }

    public List<Pool> getPools() {
        return pools;
    }

    public void refreshPools() {
        pools.clear();

        for (int i = 0; i < 5; i++) {
            pools.add(new Pool(i + 1));
        }
    }
}
