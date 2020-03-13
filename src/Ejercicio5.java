/**
 *  La velocidad de la luz es de 300 000 kilómetros por segundo.
 *   Elaborar un algoritmo que lea un tiempo en segundos e imprima 
 *   la distancia que recorre la luz en dicho tiempo.
 */
import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		// Variables: km distancia recorrida por la luz,sgs cantidad de segundos
		final double KM = 300000;
		double sgs = 0, kmR = 0; // kmR: km recorridos en dichos segundos.
		//Scanner para entrada de datos.
		Scanner inputUser = new Scanner(System.in);
	//	boolean salir = false; //salida por bandera del ciclo while.
		
		//Se imprime el menu o interfaz
		System.out.println(".- ################################## \n"
				+ ".:- INGRESAR LA CANTIDAD DE SEGUNDOS: ");
		sgs = inputUser.nextDouble();
		//Operación 
		kmR = sgs * KM;
		System.out.println(".- ################################## \n"
				+ ".:- Total " + kmR + " kilometros recorridos.");
		inputUser.close();//Se cierra el scanner.
	}

}
