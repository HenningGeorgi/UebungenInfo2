package Blatt2.Aufgabe8;

public class A {
    public static void main(String[] args) {
        StringBuilder recombinedArguments = new StringBuilder();
        for (String arg : args) recombinedArguments.append(arg);
        String searchString = "del";
        while (recombinedArguments.indexOf(searchString) != -1) {
            int i = recombinedArguments.indexOf(searchString);
            recombinedArguments.delete(i, i + searchString.length());
        }
        System.out.println(recombinedArguments);
    }
}
