/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author paulino
 */
public class ConectaBD {
    public static Connection con;
    private static String bd="tienda";
    public static String usuario="paulino";
    public static String passw= "paulino01";
    public static String url= "jdbc:mysql://localhost/"+bd;
    
    public static Connection obtenConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,usuario,passw);
        }catch(Exception e){
            System.out.println("Error en la conexion...");
            e.printStackTrace();
        }
    return con;
}
    public static void cerrar(){
        try{
            if(con!=null)
                con.close();
        }catch(Exception e){
            System.out.println("Error: no se logro cerrar la conexión:\n"+e);
        }
    }


}