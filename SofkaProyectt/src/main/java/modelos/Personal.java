package modelos;

public class Personal extends Nave {

    public Personal(String nombre, int peso) {
        super(nombre, peso);
    }
      int velocidadinicial=0;
      int velocidadfinal=40;
      int distancia=10;
      int gravedad=10;
      int velocidadnave=100;
      int tiempoalplaneta=80;
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
   //metodo diferente y único de la clase personal
    public int distancia_al_planeta_final(){
        int velocidad_de_atterizaje=(velocidadnave*tiempoalplaneta);
        return velocidad_de_atterizaje;
    }
}
