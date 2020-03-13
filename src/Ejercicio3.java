/*
 * Elaborar un algoritmo que lea una cantidad de horas e 
 * imprima su equivalente en minutos, segundos y días.
 */
import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO: Auto-generated method stub
		Scanner inputU = new Scanner(System.in);	//Input datos.
		/*Operaciones:
		 * día = hora / 24
		 * Minutos = hora x 60 
		 * Segundos = minutos x 60
		 */
		double horas, minutos, segundos, dias;
		int dia;
		double equiv = 60; double equivD = 24;
		
		System.out.println("Ingresar la cantidad de horas: ");
		horas = inputU.nextDouble();
		System.out.println("Total de horas " + horas + " -> Equivalencias: ");
		dias = horas/equivD; // Calculamos los días.
		dia = (int)dias; //Cast double a entero
		System.out.println("Días: " + dia + " días	");
		minutos = horas * equiv; // Calculamos los minutos.
		System.out.println("Minutos: "+ minutos + " minutos. ");
		segundos = minutos * equiv;
		System.out.println("Segundos: " + segundos + " segundos \n");
	
		inputU.close();
	}

}