import java.util.*;
public class Ejercicio6 {

	public static void main(String[] args) {
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
		calf1 = inputuser.nextFloat();
		System.out.println("  Calificación 2: ");
		calf2 = inputuser.nextFloat();
		System.out.println("  Calificación 3: ");
		calf3 = inputuser.nextFloat();
		System.out.println("  Calificación 4: ");
		calf4 = inputuser.nextFloat();
		System.out.println("|----------------------------------------**|");
		
		//Operación que resuelve el problema.
		prom = calf1 + calf2 + calf3 + calf4;
		promT = (double)prom /4;
		inputuser.close();
		System.out.println("############################################");
		System.out.println("#  Nombre del estudiante: "+ name );
		System.out.println("#         Promedio total: " + promT);
        System.out.println("############################################");
        
        inputname.close();
	}

}