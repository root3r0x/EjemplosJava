/* Elaborar un algoritmo que calcule e imprima el costo de un terreno 
 * cuadrado o rectangular, teniendo como datos la anchura y la longitud 
 * en metros y el costo de metro cuadrado.
 */
import java.util.Scanner;

public class Ejercicio2 {
	
	//Variables Costo, Ancho y Longitud
	public static float costo_terreno = 0f;static float area_terreno= 0f;
						// anch_terreno=0f, long_terreno=0f, costo_mtrCuadrado =0f;
	
	public static String resp;
	public static Scanner dato = new Scanner(System.in);//Scanner lectura datos.	
	public static boolean salir = false;
	
	//Métodos cuadrado.
	public static void calculaCostoCuadr(float lad1, float costoMtr) {
		area_terreno 	= lad1 * lad1;
		costo_terreno 	= area_terreno * costoMtr;
	}
	public static void inputDatosC() {
		System.out.println("Ingresar ancho del terreno:");
		
		Scanner userInp = new Scanner(System.in); //input de datos.
		float lad1 = userInp.nextFloat();

		System.out.println("Ingresar precio del metro cuadrado:");
		float precio = userInp.nextFloat();
		
		System.out.println("\n .Calculando...");
		calculaCostoCuadr(lad1, precio);
		System.out.println("El costo del terreno es: $" + costo_terreno +
				" Pesos..");
		userInp.close();
	}
	
	//Métodos rectángulo.
	public static void calculaCostoRec(float base, float alt,float costoMtr) {
		area_terreno 	= base * alt;
		costo_terreno 	= area_terreno * costoMtr;
	}
	
	public static void inputDatosR() {
		
		System.out.println("Ingresar largo del terreno:");
		Scanner userInp = new Scanner(System.in); //input de datos.
		float largo = userInp.nextFloat();
		
		System.out.println("Ingresar ancho del terreno:");
		float ancho = userInp.nextFloat();
		
		System.out.println("Ingresar precio del metro cuadrado:");
		float precio = userInp.nextFloat();
		
		System.out.println("\n .Calculando...");
		calculaCostoRec(largo, ancho, precio);
		System.out.println("El costo del terreno es: $" + costo_terreno +
				" Pesos..");
		userInp.close();
	}
	public static void main(String[] args) {
		
		while(salir==false) {
			System.out.println("¿El terreno es cuadrado?(Y/N)");
			resp = dato.next().toString();
			//Menu ?
			switch (resp) {
				case "Y":
					inputDatosC();
					salir = true;
					break;
				case "y":
					inputDatosC();
					salir = true;
					break;
				case "n":
					inputDatosR();
					salir = true;
					break;
				case "N":
					inputDatosR();
				default:
					System.out.println("Intentar de nuevo..");
					break;
			}
		}
	}
}