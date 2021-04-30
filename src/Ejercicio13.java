/** Elaborar un algoritmo que permita leer los valores: X, Y, Z Y W , B
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
   public static double B =0, f=0; //variable we wish to calculr
   public static Scanner input = new Scanner(System.in);   //variable for data input.
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
   public static double solveProcedure(double x,  double y, double z, double w, double b) throws Exception   {
      //variables defined by user
      X = x; Y = y; Z = z; W = w;b = B;
      try {
         //formula
         f = (4* Math.pow(X,2) * Math.pow(Y, 2) );
        // f = Math.pow(f, 2);
         double firtBase = 4* Math.pow(x,1/2);
         double  base = firtBase / Math.pow(b,3/4);
      }  catch (Exception ex) {
         System.out.println(ex.getMessage().toString());
      }
      //answer
      return f;
   }
   public static void MenuInputData(){
      while(true){
         System.out.println("\n .-Ingrese el valor de las variables: ");
         System.out.println("\n..........................................");
         System.out.print(".    ---> Ingresar X: ");
         X = input.nextDouble();
         System.out.print(".    ---> Ingresar Y: ");
         Y = input.nextDouble();
         System.out.print(".    ---> Ingresar Z: ");
         Z = input.nextDouble();
         System.out.print(".    ---> Ingresar W: ");
         W = input.nextDouble();
         System.out.print(".    ---> Ingresar B: ");
         B = input.nextDouble();
         System.out.println("..........................................");
         //Cuadro de muestra.
         System.out.println(" [- Valor de X: " + X + " - ]");
         System.out.println(" [- Valor de Y: " + Y + " - ]");
         System.out.println(" [- Valor de Z: " + Z + " - ]");
         System.out.println(" [- Valor de W: " + W + " - ]");
         System.out.println(" [- Valor de B: " + B + " - ]");
         System.out.println("..........................................");
         System.out.print("\n #| ¿los valores son correctos?: [Y][N] ? |#R: ");
         String R = input.next();
         if(R.equals("Y")|| R.equals("y") || R.equals("yes")|| R.equals("YES"))
         {
            System.out.println("\n.-------------- RESPUESTA: --------------.");
            try{
               double Resp = solveProcedure(X, Y, Z, W, B);
               System.out.print(" --> # " + Resp);
            }
            catch(Exception ex)
            {
               System.out.println(ex.getMessage());
            }
            break;
         }
         else{
            System.out.println("Ingrese nuevamente los valores.");
         }
      }
      System.out.println("  <-- Solución.");
   }
   public static void main(String[] args)
   {
      MenuInputData();
   }
}