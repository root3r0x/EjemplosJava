/** Elaborar un algoritmo que permita leer los valores: X, Y, Z Y W , B
 * e imprima el valor de F.
 * 
 *    Formula: F = (4x^2 y^2 zw)^2 
 *               -------------------
 *                   4x^(1/2)
 *                   ----------
 *                    b^(3/4)
 */
import java.lang.annotation.Documented;
import java.util.*;

public class Ejercicio13 {
   
   //#region Variables
   public static double X=0, Y=0, Z=0, W=0; //variables to read.
   public static double B =0, f=0; //variable we wish to calculr
   Scanner input = new Scanner(System.in);   //variable for data input.
   //#endregion
   
   /**
    * Double is the value for defect. 
    * @param x value for the variable  x
    * @param y value for the variable  y
    * @param z value for the variable  z
    * @param w value for the variable  w
    * @param b value for the variable  b
    * @return
    * @throws Exception
    */
   public static double solveProcedure(double x,  double y, double z, double w, double b)
   throws Exception {
      //variables defined by user
      X = x; Y = y; Z = z; W = w;b = B;
      try {
         //formula
         f = (4 * Math.pow(X,2) * Math.pow(Y, 2) );
         f = Math.pow(f, 2);
         double firtBase = 4* Math.pow(x,1/2);
         double  base = firtBase / Math.pow(b,3/4);
      }  catch (Exception ex) {
         System.out.println(ex.getMessage().toString());
      }
      //answer
      return f;
   }
   public static void Menu(){

      System.out.println("\n Hola mundo");
   }
   public static void main(String[] args)
   {
      Menu();
   }
}
