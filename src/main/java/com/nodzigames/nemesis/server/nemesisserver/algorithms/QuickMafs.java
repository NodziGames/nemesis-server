package com.nodzigames.nemesis.server.nemesisserver.algorithms;

import java.util.Random;

public class QuickMafs {

    public static int randomRange(int min, int max) {
        Random rand = new Random();

        int randomNum = rand.nextInt((max - min) + 1);

        return randomNum;
    }
}
