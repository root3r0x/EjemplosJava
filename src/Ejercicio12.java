
/** * Elaborar un algoritmo que lea la cantidad de dólares que se va a 
 * comprar y el tipo de cambio en pesos(costo de dólar en pesos).
 * Calcular e imprimir la cantidad que se debe pagar en pesos por la
 * cantidad de dólares indicada.
 */
import java.util.Scanner;

public class Ejercicio12 {
   // #region Variables
   public static double tipoCambio;
   public static double dollar;
   public static double pesos;
   public static double cDolares;

   public static Scanner input = new Scanner(System.in);
   // #endregion
   /** Método para calcular el costo.
    * 
    * @param cambio       Equivalente de pesos al dólar.
    * @param cantDollares Cantidad de dolares que se desean adquirir.
    * 
    */
   public static void CalculaDolares(Scanner inp, double cantDollares, double cambio) throws Exception {
      tipoCambio = cambio; // set tipo de cambio ingresado.
      pesos = tipoCambio * cantDollares;
   }
   public static void main(String[] args) {
     /** do {
         System.out.printf("");
         break;
      } while (true); **/
      System.out.printf("\n Hola mundo desde Java esto es una prueba \n");
   }
}