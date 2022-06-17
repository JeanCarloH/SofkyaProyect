package modelos;

import java.sql.Connection;
import java.util.*;

public class SofkaProyectt {

    //metodo main donde se ejecuta la apertura a la base de datos y se llama una instancia de la "ClasePadre" que es donde se encuentra todo
    public static void main(String[] args) {
        
        CConexion con = new CConexion();
        Connection conn=con.estableceConexion();
        ClasePadre ejecutar = new Inicio();
        ejecutar.operaciones(conn);
    }

}
