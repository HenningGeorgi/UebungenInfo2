package Blatt2.Aufgabe8;

public class B {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "a" + "bc";

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("abc");
        sb1.append("ab");
        sb1.append("c");

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("sb1: " + sb1);
        System.out.println("sb2: " + sb2);

        String str3 = str1.concat("test");

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("sb1: " + sb1);
        System.out.println("sb2: " + sb2);

        System.out.println("str1 und str2 gleich? " + str1.equals(str2));
        System.out.println("sb1 und sb2 gleich? " + sb1.equals(sb2));
    }
}
