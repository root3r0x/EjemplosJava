/* Similar al del alumno (Ejercicio 3.5.2), con la diferencia de que en lugar del promedio se
 * obtiene una calificación final multiplicando las calificaciones 1,2,3 y 4 por los porcentajes 30,
 * 20, 10 y 40 %, respectivamente, y sumando los productos.
 */
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables para el programa
				String name = "";
				float calf1 =0.0f, calf2 = 0.0f,calf3 =0.0f, calf4=0.0f, prom=0.0f;
				double promT = 0;
				Scanner inputuser = new Scanner(System.in);
				Scanner inputname = new Scanner(System.in);
				
				//Entrada de datos.
				System.out.println("############################################");
				System.out.println("Ingresa nombre del estudiante: ");
				name = inputname.nextLine(); //almacenamos el string.
				System.out.println("############################################");

				System.out.println("|*-----------------------------------------|");
				System.out.println("  Calificación 1: ");
				calf1 = (inputuser.nextFloat() * 30)/100;
				System.out.println("  Calificación 2: ");
				calf2 = (inputuser.nextFloat() * 20)/100;
				System.out.println("  Calificación 3: ");
				calf3 = (inputuser.nextFloat() * 10)/100;
				System.out.println("  Calificación 4: ");
				calf4 = (inputuser.nextFloat() * 40)/100;
				System.out.println("|----------------------------------------**|");
				
				//Operación que resuelve el problema.
				promT = calf1 + calf2 + calf3 + calf4;
				//promT = (double)prom /4;
				inputuser.close();
				System.out.println("############################################");
				System.out.println("#  Nombre del estudiante: "+ name );
				System.out.println("#         Promedio total: " + promT);
				System.out.println("############################################");
            inputname.close();
	}

}