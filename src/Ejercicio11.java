/**
 * Elaborar un algoritmo que lea el readio de un círculo e imprima el área.
**/
import java.util.*;

public class Ejercicio11	{
	public static void main(String[] args){
		///#region Variables | Constantes.
		double area = 0;
		double radio = 0;
		int resp;
		Scanner input = new Scanner(System.in);
		//#endregion
		System.out.print("\n<|°-°|> .-Ingrese el radio: ");
		do	{
			try {
				radio = input.nextDouble(); //Entrada de datos.
				area = Math.PI * Math.pow(radio, 2); // PI * r (2). 
				resp = (int)area; //Parse a entero.
				System.out.println("El área del círculo es:" + resp + "\n");
				break;
			}catch (InputMismatchException ex) {
				System.out.print(ex.toString() + 
				"\n" + "Ingrese un radio valido: ");
				input.next(); //limpiamos buffer.
			}	catch (Exception e) {
				//TODO: handle exception
				System.out.println(e.toString() + e.getMessage());
				input.next(); // Limpiamos buffer.
			}
		}while(true);
		input.close();
	}
}