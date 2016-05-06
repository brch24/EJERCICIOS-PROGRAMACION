
package com.upao.propuestos2;

public class Circulo {
    
    private double radio;
    private String color;
    
    public static final String default_color="red";
    public static final double default_radio=3;
    
    public Circulo()
    {
        this.color=default_color;
        this.radio=default_radio;
    }
    public Circulo(double radio, String color) 
    {
        this.radio = radio;
        this.color = color;
    }

    public double getRadius() {
        return radio;
    }

    public void setRadius(double radius) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", color=" + color + '}';
    }
}
    
    
