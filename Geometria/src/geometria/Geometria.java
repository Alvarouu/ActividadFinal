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
 /**
  * paquete geometria que contiene circulo, cuadrado, FiguraGeometrica,
  * Rectangulo y Triangulo
  */
public class Geometria {

    /**
     * @param args the command line arguments
     */
    /**
     * Clase con el modificador public y el metodo main el cual es el
     * punto de arranque del programa
     * @param args 
     */
    public static void main(String[] args) 
    {
        //probar clases cálculo áreas figuras geométricas     
        
        // En estas lineas ejecutamos el codigo de las anteriores clases 
        
        /**
         * Le damos un valor de 10 al lado del cuadrado y ejecutamos
         * el codigo de la clase cuadrado en el que veiamos que el area
         * del cuadrado era lado * lado y realizamos la operacion
         */
        Cuadrado cuadrado = new Cuadrado(10);
        cuadrado.area();
        System.out.println("Área del cuadrado de lado 10: " + 
                cuadrado.getareaCuadrado());
        /**
         * Le damos un valor de 200 al area del circulo y ejecuramos 
         * el codigo de la clase circulo en el que veiamos que el area 
         * del circulo era pi * radio * radio y realizamos la operacion
         */
        Circulo circulo = new Circulo(200);
        circulo.area();
        System.out.println("Área del círculo de radio 200: " + 
                circulo.getAreaRadio());
        /**
         * Le damos un valor a la base del rectangulo de 100 y a la 
         * altura de 20 y ejecutamos el codigo, que en este caso 
         * solamente nos muestra por pantalla que la base es 100
         * y la altura 20
         */
        Rectangulo rectangulo = new Rectangulo(100, 20);
        rectangulo.area();
        System.out.println("Área del rectángulo de base 100 y altura 20: " + 
                rectangulo.getAreaRectangulo());
        /**
         * Le damos un valor a la base del triangulo de 5 y a la 
         * altura de 10 y ejecutamos el codigo, que en este caso 
         * solamente nos muestra por pantalla que la base es 5
         * y la altura 10
         */
        Triangulo triangulo = new Triangulo(5, 10);
        triangulo.area();
        System.out.println("Área del triángulo de base 5 y altura 10: " + 
                triangulo.getareaTriangulo());        
    }   
    
}
