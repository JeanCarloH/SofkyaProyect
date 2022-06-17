
package modelos;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ConsultarDatos {
    private Connection con;
    
    
    //construcor de la clase
    public ConsultarDatos(Connection con){
        this.con = con;
    }
    
    //metodo que me trae la consulta a mi base de datos sql
    public void consultar (String tabla){
       PreparedStatement ps;
       String sql;
       try{
        sql="SELECT nombre,peso,Metodos FROM sofkaproyect."+tabla;
        ps=con.prepareStatement(sql);
        ResultSet resultado = ps.executeQuery();
        while(resultado.next()){
            System.out.println("La nave se llama: "+resultado.getString(1)+" y pesa: "+resultado.getInt(2) +"y los metodos que tiene son: "+resultado.getString(3));
        }
        ps.close();
        }catch(SQLException e){
            System.out.println("Query Malaaa");
        }
   }
}
