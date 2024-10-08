package org.example;

public class Circulo {
    public double calcularArea(double radio){
        if (radio<0) {
            throw new IllegalArgumentException("El radio no debe ser negativo");
        }
        return radio * radio * Math.PI;
    }
}
