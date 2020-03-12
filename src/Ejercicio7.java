import java.util.*;
public class Ejercicio7 {
    public static void main(String[] args)  {
        System.out.println("Ejercicio número 7: ");
		double X =0, Y=0, exp = Math.pow(X,2); //variables, Math.pow(Base, Exponente)
        Scanner input = new Scanner(System.in);
        Boolean bandera=false;
        while(bandera==false){
            try {
                System.out.print(".-Ingrese el valor de X: ");
                X = input.nextDouble();
                //Ecuación de forma lineal 
                Y =3*exp+7*X-15;
                bandera=true;
            } 
            catch (java.util.InputMismatchException e) {
                System.out.println("\n **Introducir un valor númerico valido.**");
                input.next();
            }
        }
		input.close();
		System.out.println(" El valor de Y es: " + Y);
    }
}