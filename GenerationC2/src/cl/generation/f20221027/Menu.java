package cl.generation.f20221027;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		// Menu de opciones
		// terminar la ejecución
		menu();

	}

	// Calculadora con 4 operaciones basicas
	// solicitar y capturar 2 numeros float
	// imprimir resultados y gardar en una variable
	// ofrecer opciones de repeticion (bucles)
	// definir los metodos
	// validaciones

	// limpiar las variables

	public static void menu() {
		System.out.println("********************");
		System.out.println("*       MENU       *");
		System.out.println("********************");
		System.out.println("*1.-   SUMAR       *");
		System.out.println("*2.-   RESTAR      *");
		System.out.println("*3.-   MULTIPLICAR *");
		System.out.println("*4.-   DIVIDIR     *");
		System.out.println("*0.-   SALIR       *");
		System.out.println("********************");

		Scanner sc = new Scanner(System.in);
		int opciones = 0;
		int contadorErrores = 4;

		do {
			System.out.println("* Seleccione una opción *");
			opciones = sc.nextInt();

			// si la opcion es cero, salir del do-while
			if (opciones == 0) {
				System.out.println("Usted a salido del programa");
				break;
			}

			if (opciones < 0 || opciones > 4) {// condicion de error
				contadorErrores--;
				System.out.println("Te quedan " + contadorErrores + " intentos");
			}
			if (contadorErrores == 0) {
				System.out.println("Agoto la cantidad de intentos, chaolin!!");
				break;
			}

		} while (opciones < 0 || opciones > 4);

		System.out.println(contadorErrores);

		if (opciones == 0 || contadorErrores == 0) {
			System.out.println("Adios!!");
		} else {
		System.out.println("ingresa el primer número");
			float num1= sc.nextFloat();
			System.out.println("ingresa el segundo número");
			float num2= sc.nextFloat();
			
			float resultado= 0;

			switch (opciones) {
			case 1://sumar
				resultado= num1+num2;
				System.out.println("el resultado: "+resultado);

				break;//resta
			case 2:
				resultado= num1-num2;
				System.out.println("el resultado: "+ resultado);

				break;//multiplicar
			case 3:
				resultado= num1*num2;
				System.out.println("el resultado: "+ resultado);

				break;
			case 4:
				if(num2==0) {
					System.out.println("No se puede dividir por cero");
					
				}else {
				resultado= num1/num2;
				System.out.println("el resultado: "+ resultado);
				}
				break;
				
			default:
				System.out.println("opción no válida");
				break;
			}
			//un programa que realice los cálculos de areas y perimetros para tr

		}

	}
}
