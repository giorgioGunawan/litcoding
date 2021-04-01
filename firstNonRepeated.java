package com.HashTables;

import java.util.HashMap;

/*
First non repeated character in java using HashMaps...
 */
public class FirstNonRepeated {
    private HashMap<Character, Integer> hmap = new HashMap<>();

    public char returnNonIterand(String str){
        for(char c: str.toCharArray()) {
            if (c > 65) {
                var count = hmap.containsKey(c) ? hmap.get(c) : 0;
                hmap.put(c, count + 1);
            }
        }


        for(char c: str.toCharArray()) {
            if (hmap.containsKey(c) && hmap.get(c) == 1) {
                return c;
            }
        }
        return 0;
    }

}
