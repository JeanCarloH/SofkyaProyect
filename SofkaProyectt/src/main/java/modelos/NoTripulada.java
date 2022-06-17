package modelos;

public class NoTripulada extends Nave {

    public NoTripulada(String nombre, int peso) {
        super(nombre, peso);
    }
      int velocidadinicial=0;
      int velocidadfinal=40;
      int distancia=10;
      int gravedad=10;
      int velocidadnave=100;
      int tiempoalplanetatierra=120;
    
    //d=v*t
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
    
    //metodo propio de la clase notripulada
    public int distancia_a_la_tierra(){
        int distanciatierra=(velocidadnave*tiempoalplanetatierra);
        return distanciatierra;
    }
}
