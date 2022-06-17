
package modelos;

public abstract class Nave {
            
    String nombre;
    int peso;
    
    //metodos en común con la clase nave
    public abstract int despegar();
    public abstract int aterrizar();
 //constructor
    public Nave(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }
    
   //getters and setters
    public String getNombre() {
        return nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
        
        
        
      
}
