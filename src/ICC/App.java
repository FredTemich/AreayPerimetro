package ICC;
import ICC.Cuadrilatero;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Cuadrilatero c1; 
        double lado1, lado2; 
        Scanner scn = new Scanner(System.in);
        String nameUser; 

        
        System.out.println("¿Cuál es tú nombre? ");
        nameUser = scn.nextLine();
        System.out.println("Hola, " + nameUser  + " bienvenido.");
        
        
        
        System.out.println("¿Cuanto mide el primer lado de tu cuadrilátero: ");

        lado1 = scn.nextDouble(); 

        System.out.println("¿Cuanto mide el segundo lado de tu cuadrilátero: ");

        lado2 = scn.nextDouble();

        if (lado1 == lado2) {
            c1 = new Cuadrilatero(lado1);
        } else {
            c1 = new Cuadrilatero(lado1, lado2);
        }
        
        System.out.println("El perimetro es: " + c1.getPerimetro() + " unidades.");
        System.out.println("El área es: " + c1.getArea() + " unidades cuadradas.");

          
    }
}




