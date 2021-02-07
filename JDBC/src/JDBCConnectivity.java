import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectivity {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Root@123");
            Statement st = conn.createStatement();
            int i = st.executeUpdate("insert into student values(101,'sachin')");
            System.out.println(i + "recorded successfully");
            conn.close();
        }
        catch(Exception e)
        {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}