/**
 * Elaborar un algoritmo que lea el artículo y su costo. La utilidad es del 150%
 * y el impuesto es el 15%. Calcular e imprimir artículo, utilidad, impuesto y 
 * precio de venta.
 */
import java.util.Scanner;

public class Ejercicio10   {
   public static void main(String Args[])   {

      //#region variables
      String articulo = "Incredible Soft Car";
      float costo    = 50.0f;
      float utilidad  = costo / 2 + costo;
      float impuesto  = 15f;

      Scanner input = new Scanner(System.in);
      //#endregion

      
      System.out.println("\n  Articulo: " + articulo +
      "    Costo: " + costo +
      " Utilidad: " + utilidad +
      " Impuesto: " + impuesto);

   }
}