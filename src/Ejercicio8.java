import java.util.Scanner;
/** TODO: 
 *  Una temperatura en grados celsius se puede convertir a su equivalente en
 * fahrenheit con la fórmula: F=9/5 (c)+32  y viceversa con la fórmula:
 * C=F-32(5/9) elaborar un algoritmo que leea y realize las conversiones
 * de temperaturas.
 */
public class Ejercicio8 {
    public static void main(String[] args){

        //#region declaración de variables.        
        double gFahrenheit = 0.0, gCelsius = 0.0;
        Scanner input = new Scanner(System.in);
        String opc = "";
        //#endregion      

        do  {
            System.out.print("Ingresa las opciones: \n °F Convertir a grados fahrenheit(f) || °C Convertir a grados celsius(c)-->: ");
            opc = input.nextLine();
            
            //Ingreso de grados a convertir.
            if(opc.equals("f") || opc.equals("F") ) {
                //Conversión a grados Fahrenheit
                System.out.print("\n #Introduzca los grados a convertir  según su elección-(°c->°f)#:");
                gCelsius = input.nextDouble(); //Entrada de grados Celsius
                gFahrenheit = 9/5 *gCelsius +32; //Conversión a Fahrenheit.
                System.out.println("Grados Fahrenheit: " + gFahrenheit);
                break;//salir del bucle
            }if(opc.equals("C") || opc.equals("c")) {
                //Conversión a grados Celsius
                System.out.print("\n #Introduzca los grados a convertir según su eleccióm-(°f->°c)#:");
                gFahrenheit = input.nextDouble(); //Entrada de grados Fahrenheit
                gCelsius = gFahrenheit-32*5/9;//Conversión a Grados Celsius.
                System.out.println("Grados Celsius: " + gCelsius);
                break;//salir del bucle.
            }
            else
                System.out.println("Introduzca un valor vaido porfavor.");
        }   while (true);
        input.close(); //Cierra scanner.
        System.out.println("\n Saliendo...");
    }
}