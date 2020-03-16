
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
        final double metro = 100.0;
        final double cMtro = 1.0;
        final double pulgada = 2.54;

        // Conversiones ya realizadas.
        final double pie = 12 * pulgada;
        final double yarda = 3 * pie;

        double inPie = 0.0;
        Scanner input = new Scanner(System.in);// Entrada de datos.
        // #endregion

        System.out.println("You can't reboot the program without calculating the neural ADP firewall!\n");
        System.out.print(".. Introduzca la cantidad de pies que necesota convertir#-->:");
        do {
            try {
                inPie = input.nextDouble();
                
            } catch (InputMismatchException ex1) {
                    System.out.print("¡¡Introduzca un valir valido!!");
                    System.out.print("\n :" + ex1.toString());
                    }catch (Exception e) {
                        //TODO: handle exception
                        System.out.println(e.toString());
                    }
        }   while(true);
        
    }
}