package modelos;

import java.sql.Connection;
import java.util.Scanner;
import java.util.*;

public abstract class ClasePadre {

    int nombrenave;
    int navetipo;

    InsertarDatos agregar;
    ConsultarDatos consultar;

    Scanner entrada = new Scanner(System.in);
    //metodo grande donde se contendrá toda la parte "visual" para el usuario

    public void operaciones(Connection con) {
        //llamado a las clases que contienen los metodos para la conexion
        agregar = new InsertarDatos(con);
        consultar = new ConsultarDatos(con);
        //empieza eb 0 y indica la ejecución del programa, cuando esta cambie, saldrá del programa
        int bandera = 0;
        //indica en todo momento que quiere hacer el usuario
        int seleccion = 0;

        do {

            do {
                //codigo menú
                System.out.println("Por favor seleccione una opción");
                System.out.println("   1. agregar una nueva nave");
                System.out.println("   2. buscar una nueva nave");
                System.out.println("   3. finalizar");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 3) {
                    bandera = 1;
                } else {
                    System.out.println("-----------------------------------------");
                    System.out.println("opción no disponible, vuelva a intentarlo");
                    System.out.println("-----------------------------------------");
                }

            } while (bandera == 0);

            if (seleccion == 1) {

                System.out.println("¿que tipo de nave desea crear?");
                System.out.println("        1.Nave Lanzadera");
                System.out.println("        2.Nave Tripulada");
                System.out.println("        3.Nave No Tripulada");
                System.out.println("        4.Nave Personal");
                //llamado al metodo para agregar una nueva nave
                Agregarnavee();

            } else if (seleccion == 2) {

                System.out.println("Busque su nave por el nombre, las opciones que hay son:");
                System.out.println("        1.Nave Lanzadera");
                System.out.println("        2.Nave Tripulada");
                System.out.println("        3.Nave No Tripulada");
                System.out.println("        4.Nave Personal");
                //llamado al metodo para consultar una nueva nave
                Navecreada();

            } else if (seleccion == 3) {
                System.out.println("-----------------------------------------");
                System.out.println("gracias, vuelva pronto");
                System.out.println("-----------------------------------------");
                bandera = 2;
            }

        } while (bandera != 2);

    }

    public void Navecreada() {
        nombrenave = entrada.nextInt();

        if (nombrenave == 1) {
            System.out.println("Las naves que existen de tipo lanzadera con sus metodos son:"); //traerme el objeto
            consultar.consultar("navelanzadera");
        } else if (nombrenave == 2) {
            System.out.println("Las naves que existen de tipo tripulada con sus metodos  son:"); //traerme el objeto
            consultar.consultar("navetripulada");
        } else if (nombrenave == 3) {
            System.out.println("Las naves que existen de tipo no tripulada con sus metodos  son:"); //traerme el objeto
            consultar.consultar("navenotripulada");
        } else if (nombrenave == 4) {
            System.out.println("Las naves que existen de tipo personal con sus metodos  son:"); //traerme el objeto
            consultar.consultar("navepersonal");
        }
    }

    public void Agregarnavee() {
        navetipo = entrada.nextInt();
        System.out.println("agregue el nombre ");
        String nombre = entrada.next();
        System.out.println("agregue el peso ");
        int peso = entrada.nextInt();
        
        if (navetipo == 1) {
            
            String metodos = "Despegar-Atterizar-Activar_propulsores";
            agregar.insertar("navelanzadera", nombre, peso, metodos);
        } else if (navetipo == 2) {
            String metodos = "Despegar-Atterizar-Medidor_velocidad_actual";
            agregar.insertar("navetripulada", nombre, peso, metodos);
        } else if (navetipo == 3) {
            String metodos = "Despegar-Atterizar-Distancia_a_la_tierra";
            agregar.insertar("navenotripulada", nombre, peso, metodos );
        } else if (navetipo == 4) {
            String metodos = "Despegar-Atterizar-Distancia_al_planeta_final";
            agregar.insertar("navepersonal", nombre, peso, metodos);
        }

    }

    public abstract void saludo();
}
