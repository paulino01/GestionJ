/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author paulino
 */
public class GestorBD {
    Connection conn=null;
    Statement stm=null;
    ResultSet productResSet;
    Producto productHallado;
    int clav,cant;
    String nom;
    Double precio;
    
    
    public boolean registrar(int clave, String nombre, Double precio, int cantidad){
        
        Connection conn= null;
        Statement stm;
        ResultSet rs;
        int resultUpdate = 0;
        try{
            conn = ConectaBD.obtenConexion();
            stm = conn.createStatement();
            resultUpdate=
                    stm.executeUpdate("insert into productos values("
                            +clave+", "+nombre+", "+precio+", "+cantidad+");");
            if (resultUpdate!=0){
                ConectaBD.cerrar();
                return true;
                
            }else{
                ConectaBD.cerrar();
                return false;
            }
        }catch(Exception e){
            System.out.println("Error en la base de datos");
            e.printStackTrace();
            return false;
            
        }
    }
    
    public Producto consultar(int clave, String nombre){
        try{
            conn=ConectaBD.obtenConexion();
            stm= conn.createStatement();
            productResSet= stm.executeQuery("select * from productos "
                    + "where clave='"+clave+"'and nombre='"+nombre+"'");
            if(!productResSet.next()){
                System.otu.println("No se encontró el registro");
            }
        }
    }
    /*
    public ArrayList<Producto> leerTodos()
    {
       ArrayList<Producto> productos= new ArrayList<Producto>();
        try
        {
                conn=ConectaBD.obtenConexion();
                stm= conn.createStatement();
                productResSet= stm.executeQuery("select * from productos");
                if(!productResSet.next())
                {
                    System.out.println("No se encontraron registros");
                    ConectaBD.cierraConexion();
                    return null;
                }else {
                      do{
                        clav=productResSet.getInt("clave"):
                        nom= productResSet.getString("nombre");
                        precio= productResSet.getDouble("precio");
                           pag 136
                        }
                      }
            
        }
    }
    
    
*/
}
