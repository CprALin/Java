import java.sql.*;

public class Conectare {
     private static Conectare instanta;
     private Connection c;
     private Statement stnt;

     private Conectare()
     {
        try {
            c = DriverManager.getConnection("", "", "");
            stnt = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException e) {
            System.out.println("Erroare la conectare la BD" + e.getMessage());
        }
     }

     public static Conectare getConectare()
     {
        if(instanta == null)
        {
            instanta = new Conectare();
        }
        return instanta;
     }

     public Connection getConnection()
     {
         return c;
     }

     public Statement getStatement()
     {
        return stnt;
     }

     public String getNumeBazaDeDate()
     {
        return "nume";
     }

     public void inchide()
     {
        try {
            stnt.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
     }
}