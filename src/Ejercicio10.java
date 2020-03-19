/** * Elaborar un algoritmo que lea el artículo y su costo. La utilidad es del 
 * 150% y el impuesto es el 15%. Calcular e imprimir artículo, utilidad,
 * impuesto y precio de venta.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10   {
   public static void main(String Args[])   {

      //#region variables
      String articulo = "";
      float costo, utilidad, impuest; // Se calcula el impuesto.
      int impuesto; // se castea a int

      Scanner input = new Scanner(System.in);
      //#endregion
      do {
         try {
            if(articulo.isEmpty()) { //Si articulo == vacio.
               System.out.print("\n Nombre del articulo: ");
               articulo = input.nextLine();
            }
            System.out.print("Costo: $");
            costo = input.nextFloat();
            
            utilidad = costo / 2 + costo; // Se calcula utilidad.
            impuest  = costo * .15f; //Se calcula el impuesto
            impuesto = (int)impuest; // Se convierte a int para reducir los digitos decimales.
            
            break;
         } catch (InputMismatchException e) {
            input.next();
            //# FIXME: No se valida el nombre del articulo.
            if(articulo.isEmpty()){
               System.out.print("Nombre de articulo vacio." + 
               "\nIntroduzca un nombre de articulo valido.\n");
               articulo = input.nextLine();
            }
            System.out.print("¡¡Introduzca un valor de costo valido!!.\n");
            System.out.println(e.toString() + "\n");
            //input.next();
         } catch(Exception ex){
            System.out.println(ex.toString());
            input.next();
         }
      }while(true);
      //Salida de datos.
      System.out.println("\n Articulo: " + articulo +
      "\n    Costo: $" + costo +
      "\n Utilidad: " + utilidad + "%" +
      "\n Impuesto: " + impuesto + "%");
      input.close(); //Cerramos el scanner.
   }
}