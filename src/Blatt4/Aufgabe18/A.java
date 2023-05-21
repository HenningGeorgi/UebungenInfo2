package Blatt4.Aufgabe18;

import java.util.HashMap;

public class A {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < args.length;i++){
            for (int j = 0;j < args[i].length();j++) {
                char c = args[i].toString().charAt(j);
                if(map.get(String.valueOf(c)) == null)
                    map.put(String.valueOf(c),1);
                else
                    map.replace(String.valueOf(c),map.get(String.valueOf(c))+1);
            }
        }
        System.out.println(map);
    }
}
