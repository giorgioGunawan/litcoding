package com.Set;

import java.util.HashSet;
/*
First repeated character this time using sets instead of hash maps
since we only need to check if the specific hash code address is
occupied or not to determine if the character is repeated.......
 */
public class FirstRepeated {
    private HashSet<Character> set = new HashSet<>();
    public char getFirstRepeat(String str){
        System.out.println(str);
        for(char c:str.toCharArray()){
            if(set.contains(c) && c > 65) return c;
            set.add(c);
        }
        return Character.MIN_VALUE;
    }
}
