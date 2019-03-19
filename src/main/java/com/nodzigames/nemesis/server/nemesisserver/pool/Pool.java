package com.nodzigames.nemesis.server.nemesisserver.pool;

import com.nodzigames.nemesis.server.nemesisserver.algorithms.PoolNameGenerator;
import com.nodzigames.nemesis.server.nemesisserver.algorithms.QuickMafs;

public class Pool {

    private String name;
    private int difficulty;
    private int bounty;

    public Pool (int difficulty) {
        name = PoolNameGenerator.generateName();
        this.difficulty = difficulty;

        this.bounty = QuickMafs.randomRange(10000, 20000) * (difficulty * difficulty);
    }


    public String getName() {
        return name;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int getBounty() {
        return bounty;
    }
}
