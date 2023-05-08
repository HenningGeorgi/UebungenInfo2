package Blatt3.Aufgabe12;

import java.lang.CharSequence;

public class A {
    public static void main(String[] args) {
        CharSequence[] argArray = new CharSequence[args.length];
        System.arraycopy(args,0,argArray,0,args.length);
        String matikStr = "matik";
        CharSequence str = matikStr;

        for (CharSequence arg : argArray ) {
            if (arg.length() >= str.length()) {
                for (int i = 0; i < arg.length() - str.length(); i++) {
                    if (arg.subSequence(i, i + str.length()).equals(matikStr)) {
                        System.out.println("Erste Position des Vorkommens: "+i);
                    }
                }
            }
        }
    }
}
