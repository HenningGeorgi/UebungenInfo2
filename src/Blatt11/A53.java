package Blatt11;

import java.sql.*;

public class A53 {
    public static void main(String[] args) {
        Connection c = null;
        String url = "jdbc:mysql://educos-srv01.informatik.uni-augsburg.de:3306/theDatabase?useSSL=false";
        String user = "user";
        String password = "inFormatik2";
        try {
            c = DriverManager.getConnection(url, user, password);
            System.out.println(getChoresDone(c, "Andreas"));
            getChoresDone(c, "Tobias", 2022);
        } catch (SQLException e) {
            System.out.println("querying db failed: ");
            e.printStackTrace();
        } finally {
            try {
                if (c != null)
                    c.close ();
            } catch (SQLException e) {
                System.out.println("closing connection failed: ");
                e.printStackTrace();
            }
        }
    }

    public static double getChoresDone(Connection connection, String flatmate) throws SQLException {
        try (Statement abfrage = connection.createStatement()) {
            String befehl = "SELECT Chore.timeRequiredHours FROM FlatmateChore WHERE name =" + flatmate;
            ResultSet ergebnis = abfrage.executeQuery(befehl);
            double timeRequiredHours = 0;
            while (ergebnis.next()) {
                timeRequiredHours += ergebnis.getDouble("timeRequiredHours");
            }
            return timeRequiredHours;
        } catch (SQLException e) {
            System.out.println("executing query failed with error: ");
            e.printStackTrace();
            return -1;
        }
    }

    public static void getChoresDone(Connection connection, String flatmate, int year) {
        try (Statement abfrage = connection.createStatement()) {
            String befehl = "SELECT Chore.chore, Chore.doneAt FROM FlatmateChore WHERE name=" + flatmate + "AND YEAR(dontAt) =" + year;
            ResultSet ergebnis = abfrage.executeQuery(befehl);
            while (ergebnis.next()) {
                System.out.println(ergebnis.getString("chore") + ", " + ergebnis.getDate("doneAt"));
            }
        } catch (SQLException e) {
            System.out.println("executing query failed with error: ");
            e.printStackTrace();
        }
    }
}
