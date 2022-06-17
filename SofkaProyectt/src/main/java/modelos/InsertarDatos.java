package modelos;

/**
 *
 * @author Jean
 */
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class InsertarDatos {
    private Connection con;
    
    //construtor de la clase insertardatos
   public InsertarDatos(Connection con){
       this.con = con;
       }
   
   //metodo que inserta a la base de datos mysql
   public void insertar (String tabla ,String nombre, int peso, String metodos){
       PreparedStatement ps;
       String sql;
       try{
        sql="INSERT INTO sofkaproyect."+tabla+"(nombre, peso, Metodos) VALUES(?,?,?)";
        ps=con.prepareStatement(sql);
        ps.setString(1, nombre);
        ps.setInt(2, peso);
         ps.setString(3, metodos);
        ps.executeUpdate();
        ps.close();
        JOptionPane.showMessageDialog(null, "Se han insertado los datos");
        }catch(SQLException e){
            System.out.println("Query Mala");
        }
   }
}

