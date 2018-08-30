/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofiguras;

/**
 *
 * @author Estudiantes
 */
public abstract class Figura {
    float coordenadaX;
    float coordenadaY;
    float area;
    
    public abstract void calcularArea();

    public void setCoordenadaX(float coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public void setCoordenadaY(float coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public float getArea() {
        return area;
    }
    
    
    
}
