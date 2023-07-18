package Blatt12.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;

public class SimpleXMLParser {
    private final static String dateiAnfang = "<teilnehmer>";
    private final static String dateiEnde = "</teilnehmer>";

    public static void main(String[] args) {
        for (String filename : new String[]{"invalidTeilnehmer1.xml", "invalidTeilnehmer2.xml", "invalidTeilnehmer3.xml"}) {
            try {
                parseTeilnehmerFile(filename);
                System.out.println("Did not detect " + filename + " as wrongly formatted");
            } catch (WrongFormatException e) {
                System.out.println("Sucessfully detected " + e.getMessage() + " as wrongly formatted");
            }
        }
        try {
            parseTeilnehmerFile("validTeilnehmer.xml");
        } catch (WrongFormatException e ) {
            System.out.println("Failed to read validTeilnehmer.xml");
        }
    }

    public static void parseTeilnehmerFile(String filename) throws WrongFormatException {
        ArrayList<Integer> matrikelnummern = new ArrayList<>();
        String line;
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filename))) {
            String firstline = reader.readLine();
            if (firstline == null || !firstline.equals(dateiAnfang)) {
                throw new WrongFormatException(filename);
            }

            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.equals(dateiEnde))
                    reader.close();
                else if (line.matches("/<student>\\d{7}</student>/g"))
                    matrikelnummern.add(Integer.parseInt(line.substring(9, 16)));
                else {
                    reader.close();
                    throw new WrongFormatException(filename);
                }
            }

            System.out.println("Matrikelnummern aus XML:");
            matrikelnummern.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
