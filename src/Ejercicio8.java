import java.util.Scanner;
/** TODO: 
 *  Una temperatura en grados celsius se puede convertir a su equivalente en
 * fahrenheit con la fórmula: F=9/5 (c)+32  y viceversa con la fórmula:
 * C=F-32(5/9) elaborar un algoritmo que leea y realize las conversiones
 * de temperaturas.
 */
public class Ejercicio8 {
    public static void main(String[] args){
        double gFahrenheit = 0, gCelsius = 0;
        Scanner input = new Scanner(System.in);
        String opc = "";
        System.out.println("Ingresa las opciones: "+
        "°F Convertir a grados fahrenheit(f)-->:" );
        System.out.println("°C Convertir a grados celsius(c)-->: ");
        opc = input.nextLine();
        input.next(); //Limpiamos el buffer de memoria
        //Ingreso de grados a convertir.
        if(opc.equals("f") || opc.equals("F") ){
            //Conversión a grados Fahrenheit

        }if(opc.equals("C") || opc.equals("c")){
            //Conversión a grados Celsius

        }
        System.out.println("Hola mundo");
    }
}