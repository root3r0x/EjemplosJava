/** TODO: 
 *       Elabore un algoritmo que lea un número de pies y calcule e imprima
 * su equivalente en yardas, pulgadas, centímetros y metros, de acuerdo
 * con las siguientes equivalencias :
 * 
 *   1 Pie      = 12 pulgadas.
 *   1 Yarda    = 3 pies.
 *   1 Pulgada  = 2.54 cetímetros.
 *   1 Metro    = 100 centímetros. 
 * 
 */
import java.util.*;

public class Ejercicio9 {
    public static void main(String[] args) {

        // #region Varibales
        double inPie    = 0.0;
        double yardas   = 0.0;
        
        double cMtro = 1.0;
        final double metro = 100;
        double pulgada = 2.54;

        // Conversiones ya realizadas.
        double pie = 12 * pulgada;
        Scanner input = new Scanner(System.in);// Entrada de datos.
        // #endregion

        System.out.println("\n You can't reboot the program without calculating the neural ADP firewall!\n");
        do  {
            
            System.out.print("<|°_°|>  .. Introduzca la cantidad de pies que necesota convertir#-->:");
            try {
                inPie = input.nextDouble();
                //Conversiones apartir de datos proporsionados por el usuario
                yardas  = 3 / inPie; //Yardas
                pulgada = inPie   * 12; // Pulgadas
                cMtro   = pulgada * 2.54;

                System.out.println("\n El valor introducido es: " + inPie + " pies \n");
                System.out.println("  *** Conversiones ******** \n" +
                "     Yardas: " + yardas    + " \n " +
                "   Pulgadas: " + pulgada   + " \n " +
                "Centimetros: " + cMtro     + " \n " +
                "     Metros: " + metro     + " \n " +
                "Pulgadas: "    + pulgada   + " \n ");
                break;
            } 
            catch (InputMismatchException ex1)    {
                System.out.print("¡¡Introduzca un valor valido!! #Ej: 9.0# ");
                System.out.print("\n :" + ex1.toString() + "\n" );
            }   
            catch (Exception e) {
                //TODO: handle exception
                System.out.println(e.toString());
            }
            input.next();
        }   while(true);
        
    }
}