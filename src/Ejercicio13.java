/** Elaborar un algoritmo que permita leer los valores: X, Y, Z Y W
 * e imprima el valor de F.
 * 
 *    Formula: F = (4x^2 y^2 zw)^2 
 *               -------------------
 *                   4x^(1/2)
 *                   ----------
 *                    b^(3/4)
 */
import java.util.*;

public class Ejercicio13 {
   
   //#region Variables
   public static double X=0, Y=0, Z=0, W=0; //variables to read.
   public static double b =0, F=0; //variable we wish to calculr
   Scanner input = new Scanner(System.in);   //variable for data input.
   //#endregion
   public static double solveProcedure(double x,  double y, double z, double w)
   throws Exception {
      //variables defined by user
      X = x; Y = y; Z = z; W = w;
      try {
         //formula
         F = (4 * Math.pow(X,2) * Math.pow(Y, 2) );
         F = Math.pow(F, 2);
         double firtBase = 4* Math.pow(x,1/2);
         double  base = firtBase / Math.pow(b,3/4);
      }  catch (Exception ex) {
         System.out.println(ex.getMessage().toString());
      }
      //answer
      return F;
   }
   public static void Menu(){

      System.out.println("\n Hola mundo");
   }
   public static void main(String[] args)
   {
      Menu();
   }
}
