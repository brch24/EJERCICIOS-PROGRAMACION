
package com.upao.propuestos2;

public class Cilindro extends Circulo {

    private double altura;
    public static final double default_altura=1;
    
    public Cilindro()
    {
        
    }
    public Cilindro(double altura) 
    {
        this.altura = altura;
    }
    public Cilindro(double radio,double altura)
    {
        this.altura = altura;
    }
    public Cilindro(double altura, double radio, String color) {
        super(radio, color);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double volumen()
    {
        return 0;
    }

    @Override
    public String toString() {
        return "\nCilindro{" +super.toString()+"altura=" + altura + '}';
    }
    
}
