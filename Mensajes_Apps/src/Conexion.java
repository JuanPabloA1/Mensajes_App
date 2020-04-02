import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection connection = null;
    public Connection getConnection(){
        try{
            connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/mensajes_app","root","");

            if(connection!=null){
                System.out.println("Conexión Exítosa");
            }
        }catch(SQLException e){
            System.out.println(e);
        }

        return  connection;
    }


}
