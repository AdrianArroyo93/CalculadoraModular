package MetodoCalculadora;

import java.util.Scanner;

public class MetodoCalculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bienvenido a la calculadora. Elige una opción:");
		System.out.println("1. Calculadora Simple");
		System.out.println("2. Calculadora Avanzada");

		int tipoCalculadora = scanner.nextInt(); // Elegir tipo de calculadora

		if (tipoCalculadora == 1) {
			// Calculadora Simple
			System.out.println("Introduce el primer valor:");
			double numero1 = scanner.nextDouble();

			System.out.println("Introduce el segundo valor:");
			double numero2 = scanner.nextDouble();

			System.out.println("Introduce la operación (1 = suma, 2 = resta, 3 = multiplicación, 4 = división):");
			int operacion = scanner.nextInt();

			double resultado = 0;

			switch (operacion) {
			case 1:
				resultado = calculadoraSimpleSumar(numero1, numero2);
				break;
			case 2:
				resultado = calculadoraSimpleRestar(numero1, numero2);
				break;
			case 3:
				resultado = calculadoraSimpleMultiplicar(numero1, numero2);
				break;
			case 4:
				if (numero2 != 0) {
					resultado = calculadoraSimpleDividir(numero1, numero2);
				} else {
					System.out.println("Error: División por cero no permitida.");
				}
				break;
			default:
				System.out.println("Operación no válida.");
				return; // Salir del programa si la operación no es válida
			}

			// Mostrar el resultado
			System.out.println("El resultado es: " + resultado);

		} else if (tipoCalculadora == 2) {
			// Calculadora Avanzada
			System.out.println("Elige una operación (1 = factorial, 2 = elevar):");
			int operacionAvanzada = scanner.nextInt();

			if (operacionAvanzada == 1) {
				System.out.println("Introduce un número para calcular su factorial: ");
				int numero = scanner.nextInt();
				int factorial = calculoFactorial(numero);
				System.out.println("El factorial de " + numero + " es: " + factorial);
			} else if (operacionAvanzada == 2) {
				System.out.println("Introduce el número a elevar:");
				int numeroEntero = scanner.nextInt();
				System.out.println("Introduce el exponente:");
				int numeroElevado = scanner.nextInt();
				int resultado = elevar(numeroEntero, numeroElevado);
				System.out.println(numeroEntero + " elevado a " + numeroElevado + " es: " + resultado);
			} else {
				System.out.println("Operación no válida.");
			}
		} else {
			System.out.println("Opción no válida.");
		}

		scanner.close();
	}

	public static double calculadoraSimpleSumar(double numero1, double numero2) {
		return numero1 + numero2;
	}

	public static double calculadoraSimpleRestar(double numero1, double numero2) {
		return numero1 - numero2;
	}

	public static double calculadoraSimpleMultiplicar(double numero1, double numero2) {
		return numero1 * numero2;
	}

	public static double calculadoraSimpleDividir(double numero1, double numero2) {
		return numero1 / numero2;
	}

	public static int calculoFactorial(int numero) {
		int factorial = 1;
		for (int i = 1; i <= numero; i++) {
			factorial *= i;
		}
		return factorial;
	}

	public static int elevar(int base, int exponente) {
		int resultado = 1;
		for (int i = 0; i < exponente; i++) {
			resultado *= base; // Multiplicamos la base por sí misma 'exponente' veces
		}
		return resultado;
	}
}

/*
 * // Muestra la operación matemática que // se va a realizar // cada vez
 * 
 * factorial *= i; // Multiplica factorial por c en cada iteración
 * 
 * // Muestra el número actual y // el factorial acumulado }
 * 
 * System.out.println("El factorial de " + numero + " es " + factorial); //
 * Imprime el resultado del factorial
 */
