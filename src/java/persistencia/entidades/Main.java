/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.entidades;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author user
 */
public class Main {
    
        public static void Main(String[] args){
            Connection con = null;
            
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarySchool","root","");
            if(con!=null){
                System.out.println("La conexion esta establecida");
                }
            }catch(Exception e){
                System.out.println("No se puede conectar a la base de datos");
            }
        }
}
