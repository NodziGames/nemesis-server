package com.nodzigames.nemesis.server.nemesisserver.algorithms;

import java.util.ArrayList;
import java.util.List;

public class TokenGenerator {

    public static List<String> generatedTokens = new ArrayList<>();

    public static String GenerateToken() {
        int num = QuickMafs.randomRange(100000000, 999999999);

        while (generatedTokens.contains(num)) {
            num = QuickMafs.randomRange(100000000, 999999999);
        }

        String tok = Integer.toString(num);
        generatedTokens.add(tok);

        return tok;
    }
}
