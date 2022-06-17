
package modelos;

public class Lanzadera extends Nave {

    public Lanzadera(String nombre, int peso) {
        super(nombre, peso);
    }
      int velocidadinicial=0;
      int velocidadfinal=40;
      int distancia=10;
      int gravedad=10;
      int velocidadnave=100;
      int propulsores=700;
    //metodos en común con la clase nave
    @Override
    public  int despegar(){
         int velocidad_de_despegue=velocidadnave+velocidadinicial;
         return velocidad_de_despegue;
    }
    @Override
    public int aterrizar(){
         int velocidad_de_atterizaje=velocidadfinal-(gravedad*distancia);
         return velocidad_de_atterizaje;
    }
    //metodo unico y propio de la clase lanzadera
    public int activar_propulsores(){
        int velocidad_de_atterizaje=velocidadinicial+velocidadnave+propulsores;
        return velocidad_de_atterizaje;
    }
    
    
    
}
