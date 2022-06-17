
package modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class CConexion {
    //atributos obligatorios para la conexion con la base de datos
    Connection conectar = null;
    String usuario ="root";
    String contraseña ="";
    String bd ="SofkaProyect";
    String ip ="localhost";
    String puerto ="3306";
    
    
    String cadena="jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    //metodo que contiene el driver de mysql y primer apertura a la base de datos.
    public Connection estableceConexion(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar=DriverManager.getConnection(cadena,usuario,contraseña);
            JOptionPane.showMessageDialog(null," se conecto a la base de datos");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"no se conecto a la base de datos"+ e.toString());
        }
        return conectar;
    }
    
    
    }
    
    

