package org.tdd.areaPoligonos;

public class Cuadrado extends Poligono{
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
