package Blatt4.Aufgabe17;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class A {
    public static String randomString(int length){
        String allletters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuffer s = new StringBuffer(length);
        Random rd = new Random();
        for (int i = 0; i < length;i++){
            int randomIndex = rd.nextInt(allletters.length());
            char randomChar = allletters.charAt(randomIndex);
            s.append(randomChar);
        }
        return s.toString();
    }

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        Random rd3bis7 = new Random();
        String abc = "ABC";

        for (int i = 0;i < 1000;i++){
            int x = rd3bis7.nextInt(5)+3;
            myList.add(i,randomString(x));
        }
        if((myList.contains(abc)))
            System.out.println("ABC kommt vor!");
        else
            System.out.println("ABC kommt NICHT vor!");

        Iterator<String> iter = myList.iterator();
        int laenge = 0;
        while (iter.hasNext()){
            laenge += iter.next().length();
        }

        Iterator<String> iterzahl = myList.iterator();
        ArrayList<String> nursieben = new ArrayList<String>();
        for(String i : myList)
            if(iterzahl.next().length() == 7) {
                nursieben.add(i);
            }
        System.out.println("Es sind insgesamt "+laenge+ " Buchstaben in der Liste");
        System.out.println("Alle Zeichenkette der Länge 7 in myList \n"+nursieben);
        //System.out.println(myList);
    }

}