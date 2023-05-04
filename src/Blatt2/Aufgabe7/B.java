package Blatt2.Aufgabe7;

import java.util.Random;

public class B {
    public static void main(String[] args) {
        Random rd = new Random();
        Boolean[] boolArray = new Boolean[4];
        Boolean logicalXorValue = false;
        for (int i = 0; i < boolArray.length; i++) {
            boolArray[i] = rd.nextBoolean();
            logicalXorValue = Boolean.logicalXor(logicalXorValue, boolArray[i]);
        }
        System.out.println(logicalXorValue);
    }
}
