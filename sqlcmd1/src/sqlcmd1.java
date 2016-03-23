    import java.sql.*;

    public class sqlcmd1 {

     public static void main(String[] argv) throws ClassNotFoundException, SQLException {

         Class.forName("org.postgresql.Driver");
         Connection connection = null;
         connection = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/sqlcmd", "postgres",
                        "123");
         Statement stmt = connection.createStatement();
         String sql;
         //insert
         sql = "INSERT INTO schema.users(login, firstname, lastname, pass, birthday) VALUES ('cleaner', 'XXX', 'XXX', 123, to_date('01-01-2000', 'DD-MM-YYYY'));";
         stmt.executeUpdate(sql);
         stmt.close();

         //delete
         sql = "DELETE FROM schema.users WHERE login = 'cleaner';";
         stmt.executeUpdate(sql);

         //select
         sql = "SELECT * FROM schema.users;";
         ResultSet rs = stmt.executeQuery(sql);
         while (rs.next()){
             System.out.print(rs.getString(1));
             System.out.print(rs.getString(2));
             System.out.print(rs.getString(3));
             System.out.print(rs.getString(4));
             System.out.println(rs.getString(5));
         }
         rs.close();
         stmt.close();

         //update
         sql = "update schema.users set lastname = 'Petrovich' where login = 'dir';";
         stmt.executeUpdate(sql);
         stmt.close();
     }
}

