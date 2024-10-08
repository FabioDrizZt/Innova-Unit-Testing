package org.example.services;

import org.example.Calculadora;

public class CalculadoraService {
    private final Calculadora calculadora;

    public CalculadoraService(Calculadora calculadora){
        this.calculadora = calculadora;
    }

    public int sumarNumeros(int a, int b){
        return calculadora.sumar(a,b);
    }
}
