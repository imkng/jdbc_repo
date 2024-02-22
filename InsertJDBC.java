import java.sql.*;;
public class InsertJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/youtube";
            String user = "root";
            String password = "root";
            Connection con = DriverManager.getConnection(url, user, password);

            //create query
            String query = "CREATE TABLE table1(tid int(20) PRIMARY KEY AUTO_INCREMENT, t_name varchar(40) not null, t_city varchar(100));";

            //create stmnt

            Statement stmt = con.createStatement();

            stmt.executeUpdate(query);
            System.out.println("table is been created");
            con.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
