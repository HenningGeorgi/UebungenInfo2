package Blatt4.Aufgabe18;

import java.util.HashMap;

public class A {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (String arg : args) {
            char[] charArray = arg.toCharArray();
            for (char c : charArray) {
                if (map.get(c) == null) {
                    map.put(c, 1);
                } else {
                    int i = map.get(c);
                    map.put(c, ++i);
                }
            }
        }
    }
}
