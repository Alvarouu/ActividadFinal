/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author javier
 */
public class Triangulo implements FiguraGeometrica
{
    
    
    private double base; //Se crea el atributo base
    private double altura; //Se crea el atributo altura
    private double areaTriangulo; //Se crea el atributo areaTriangulo
    
    /**
     * Constructor de base y altura
     * @param base base del triangulo
     * @param altura altura del triangulo
     */
    public Triangulo(double base, double altura) 
    {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() 
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura() 
    {
        return altura;
    }

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }

    public double getareaTriangulo() 
    {
        return areaTriangulo;
    }

    @Override
    public void area() 
    {
        areaTriangulo = base * altura / 2;
    }    
    
}