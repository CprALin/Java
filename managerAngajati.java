import java.sql.*;

public class managerAngajati {
    private static Conectare c = Conectare.getConectare();

    public static String getAngajati()
    {
        StringBuffer sb = new StringBuffer();
        Statement s = c.getStatement();

        try{
            ResultSet rs = s.executeQuery("SELECT * FROM nume");

            while(rs.next()){
                sb.append(rs.getString(2));
                sb.append("\t");
                sb.append(rs.getString(3));
                sb.append("\t");
                sb.append(rs.getString(4));
                sb.append("\n");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

        return sb.toString();
    }

    public static boolean memoreazaAngajat(String n,String p, String e)
    {
        Statement s = c.getStatement();
        String comanda = "INSERT INTO datePersonale VALUES (DEFOULT , \" " + n + "\" , \" " + p + "\" , \"" + e + "\")";

        try{
           s.executeUpdate(comanda);
           return true; 
        }catch(SQLException ex){
            ex.printStackTrace();
        }

        return false;
    }

    public static void modificaNume(String n , String email)
    {
        Statement s = c.getStatement();

        try{
          ResultSet rs = s.executeQuery("SELECT * FROM datePersoane WHERE email = \"" + email + "\"");
          
          if(rs.next())
          {
             rs.updateString("Nume",n);
             rs.updateRow();
             rs.beforeFirst();
          }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static boolean stergeAngajat(String n, String p , String e)
    {
        Statement s = c.getStatement();

        try{
          ResultSet rs = s.executeQuery("SELECT idPersoana FROM datePersoane WHERE Name = \"" + n + "\" AND Prenume = \"" + p + "\" AND Email = \"" + e + "\"");
          
          if(rs.next())
          {
            rs.deleteRow();
          }

          return true;
        }catch(SQLException ie){
             ie.printStackTrace();   
        }

        return false;
    }
}
