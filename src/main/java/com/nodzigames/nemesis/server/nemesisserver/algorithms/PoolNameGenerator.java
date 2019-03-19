package com.nodzigames.nemesis.server.nemesisserver.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PoolNameGenerator {

    //Used to generate random names for data mining pools
    public static String generateName() {
        return generatePrefix() + generateHash() + generateID();
    }

    private static String generatePrefix() {
        List<String> prefixes = Arrays.asList("WASP", "NIGHTMARE", "PROXY", "BITE", "GEM", "ARCH", "OWL", "WOLF", "DAGGER", "WHIZ", "HAZE", "TRIX", "WEBSTER", "ROGUE", "ESSENCE", "ACID", "FLINCH", "CRYPTO");
        Random random = new Random();
        return prefixes.get(random.nextInt(prefixes.size())) + "-";
    }

    private static String generateHash() {
        String alphanumeric = "abcdefghijklmnopqrstuvwxyz";

        String hash = "";

        for (int i = 0; i < 15; i++) {
            hash += alphanumeric.charAt((int)(alphanumeric.length() * Math.random()));
        }
        return hash + "-";
    }

    private static String generateID() {
        String numbers = "0123456789";

        String id = "ID:";

        for (int i = 0; i < 4; i++) {
            id += numbers.charAt((int)(numbers.length() * Math.random()));
        }

        return id;
    }
}
