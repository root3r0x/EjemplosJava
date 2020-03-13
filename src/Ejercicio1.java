/**
 * 1.- Elaborar un algoritmo que calcule e imprima el costo de producción de un artículo,
 * teniendo como datos la descripción y el número de unidades producidas. El costo se 
 * calcula multiplicando el número de unidades producidas por un factor de costo de materiales
 * de 3.5 y sumándole al producto un costo fijo de 10 700.
 */
import java.util.Scanner;
public class Ejercicio1 {
	
	public void imprime(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		// TODO: Auto-generated method stub
		/** Creamos las variables **/
		String DProducto = ""; //Descripción del producto (Formato CamelCase)
		int NUnidadesProd = 0; //Número de unidades producidas.
		float CProduccion = 0f; //Costo de producción
		float nUnidProd = 0f;
		
		final float CFIJO  			= 20700f; //Constante costo fijo.
		final float FCOSTOMATERIAL 	= 3.5f;   //Constante factor costo material.
		
		Scanner datoN = new Scanner(System.in); 	// Se crea variable para ingresar datos(int).
		//Scanner datoDesc = new Scanner(System.in); 	// Se crea variable para leer cadenas.
		System.out.print("\n Ingresa el número de unidades producidas: ");
		NUnidadesProd = datoN.nextInt();			//Leemos las unidades.
		
		datoN.nextLine();							//Limpiamos el buffer.
		
		System.out.print(" Ingresa la descripción del producto: ");
		
		DProducto = datoN.nextLine();
		nUnidProd = (float)NUnidadesProd; //Hacemos un cast de int a float.
		
		/** Operación que resuelve el problema **/
		CProduccion = nUnidProd * FCOSTOMATERIAL + CFIJO;
		
		System.out.println("\n Dscripción del producto: \n ###" + DProducto + "###");
		System.out.println("\n Coste de producción: " + CProduccion);
		datoN.close();
	}

}