import java.sql.*;

class FirstJDBC{
    public static void main(String[] args) {
        // System.out.println("hello world");

        try{
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //creating a conection
            String url = "jdbc:mysql://localhost:3306/youtube";
            String userName = "root";
            String password = "root";
            Connection connection = DriverManager.getConnection(url, userName, password);

            if(connection.isClosed()){
                System.out.println("Connection is still closed");
            }else{
                System.out.println("Connection is created!!");
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}