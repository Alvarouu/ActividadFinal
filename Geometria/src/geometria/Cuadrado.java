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
//Con implements heredamos la clase FiguraGeometrica
public class Cuadrado implements FiguraGeometrica
{   
    private double lado;
    private double areaCuadrado;
    /**
     * metodo constructor de la clase cuadrado
     * @param lado lado del cuadrado
     */
    public Cuadrado(double lado) 
    {
        this.lado = lado;
    }
    /**
     * consultor del atributo lado
     * @return lado
     */
    public double getLado() 
    {
        return lado;
    }
    /**
     * modificador del doble lado
     * @param lado
     */
    public void setLado(double lado) 
    {
        this.lado = lado;
    }
    /**
     * consultor del atributo getareaCuadrado
     * @return areaCuadrado
     */
    public double getareaCuadrado() 
    {
        return areaCuadrado;
    }    
    /**
     * Establecemos que el area de el cuadrado es igual a el lado al cuadrado
     */
    @Override
    public void area() 
    {
        areaCuadrado = lado * lado;
    }    
}