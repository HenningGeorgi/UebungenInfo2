package Blatt3.Aufgabe12;

public class B {
    public static void main(String[] args) {
        String str = "HelloWorld.py";
        StringBuffer strBuffer = new StringBuffer("HelloWorld.py");
        StringBuilder strBuilder = new StringBuilder("HelloWorld.py");

        System.out.println("Dateinamenserweiterung für String Objekt 'HelloWorld.py': " + fileExtension(str));
        System.out.println("Dateinamenserweiterung für StringBuffer Objekt 'HelloWorld.py': " + fileExtension(strBuffer));
        System.out.println("Dateinamenserweiterung für StringBuilder Objekt 'HelloWorld.py': " + fileExtension(strBuilder));
    }

    public static CharSequence fileExtension(CharSequence filename) {
        int lastPointIndex = -1;
        for (int i = 0; i < filename.length(); i++) {
            if (filename.charAt(i) == '.') {
                lastPointIndex = i;
            }
        }
        return lastPointIndex > -1 ? filename.subSequence(lastPointIndex, filename.length() - 1) : "";
    }
}
