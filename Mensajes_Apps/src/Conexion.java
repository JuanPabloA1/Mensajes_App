import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection connection = null;
    public Connection getConnection(){
        try{
            connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/mensajes_app","root","");


        }catch(SQLException e){
            System.out.println(e);
        }

        return  connection;
    }


}
