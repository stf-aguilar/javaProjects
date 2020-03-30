
package ventanas;

import java.io.Serializable;


public class Atleta implements Serializable{
    private String nombre;
    private int edad, estatura;
    private double peso;
    
    public Atleta(String nombre, int edad, double peso, int estatura){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getEstatura() {
        return estatura;
    }

    public double getPeso() {
        return peso;
    }
    
    
}
