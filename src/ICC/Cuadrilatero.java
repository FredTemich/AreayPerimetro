/** Ejercicio 1.
 * Construir un programa que calcule el área y el perímetro de una cuadrilátero dada la longitud de sus lados. Los valores de la longitud deberán 
 * introducirse por línea de comandos. Si es un cuadrado, sólo se proporcionará la longitud de uno de los lados al construtor. 
 */
package ICC;

public class Cuadrilatero {
    private double lado1;
    private double lado2; 

    // Métodos

    // Método Constructor 1 (cuadrilatero, no degenerado)
    public Cuadrilatero(double lado1, double lado2) {
        this.lado1 = lado1; 
        this.lado2 = lado2; 
    
    }

    // Método constructor 2 (Cuadrado)
    public Cuadrilatero(double lado1) {
        this.lado1 = this.lado2 = lado1;
    }
    // Cálcula el perimetro dado los lados 1 y 2, respectivamente.
    public double getPerimetro() {
        double perimetro = 2 * (lado1 + lado2);
        return perimetro; 
    }
    // Cálcula el área dados los lados 1 y 2, respectivamente. 
    public double getArea() {
        Double area = (lado1 * lado2);
        return area;
    }
}
