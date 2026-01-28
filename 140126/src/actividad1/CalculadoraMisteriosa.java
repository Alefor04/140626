package actividad1;
//David Alejandro Valdivieso Roa
import java.util.Scanner;

public class CalculadoraMisteriosa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Declaramos el escaner
		boolean continuar = true; //Declaramos la variable continuar que nos servira para poder detener el programa
        //Creamos un blucle para dar la opciones, este bucle solo existira mientras continuar sea true
		while (continuar) {
			System.out.println("=== CALCULADORA MISTERIOSA ===");
			System.out.println("1. Sumar dos números");
			System.out.println("2. Restar dos números");
			System.out.println("3. Multiplicar dos números");
			System.out.println("4. Dividir dos números");
			System.out.println("5. Calcular promedio");
			System.out.println("6. Mostrar instrucciones");
			System.out.println("7. Salir");
			System.out.print("Selecciona una opción: ");

            //Para que pudan la opcion usamos el escanner que se declaro anteriormente
			int opcion = scanner.nextInt();

			switch (opcion) {
			case 1://Metodo para sumar unos numeros dados
				System.out.println("Resultado: " + sumar());
				break;
			case 2: //Metodo para restar unos numeros dados
				System.out.println("Resultado: " + restar());
				break;
			case 3://Metodo para multiplicar unos numeros dados
				System.out.println("Resultado: " + multiplicar());
				break;
			case 4://Metodo para dividir unos numeros dados
				System.out.println("Resultado: " + dividir());
				break;
			case 5://Metodo para calcular el promedio de unos numeros dados
				System.out.println("Resultado: " + calcularPromedio());
				break;
			case 6: //Metodo que nos mostrara la instrucciones
				mostrarInstrucciones();
				break;
			case 7: //Metodo para finalizar el programa ya que continuar se pone en falso
				continuar = false;
				System.out.println("Cerramos calculadora");
				break;
			default:
				System.out.println("Opción inválida");
				break;
			}
		}
		scanner.close();

	}

    //Clase sumar
	public static int sumar() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa el primer número: ");
		int a = sc.nextInt();
		System.out.print("Ingresa el segundo número: ");
		int b = sc.nextInt();

		return a + b;
	}
    //Clase restar
	public static int restar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int b = sc.nextInt();
		return a - b;
	}

    //Clase multiplicar
	public static int multiplicar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int b = sc.nextInt();

		return a * b;
	}

    //Clase dividir
	public static double dividir() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        double a = sc.nextInt();
        System.out.print("Ingresa el segundo número: ");
        double b = sc.nextInt();
        return a / b;
	}

	public static double calcularPromedio() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        double a = sc.nextInt();
        System.out.print("Ingresa el segundo número: ");
        double b = sc.nextInt();
        System.out.print("Ingresa el terce número: ");
        double c = sc.nextInt();
        System.out.print("Ingresa el cuarto número: ");
        double d = sc.nextInt();
        System.out.print("Ingresa el quinto número: ");
        double e = sc.nextInt();
        double[] numeros = { a, b, c, d, e };
		double suma = 0;

        for (double numero : numeros) {
            suma += numero;
        }

		return suma / numeros.length;
	}

    //Clase para mostrar las instrucciones
	public static void mostrarInstrucciones() {

        System.out.println("\n=== INSTRUCCIONES ===");
        System.out.println("1. Selecciona una operación del menú");
        System.out.println("2. Ingresa los números cuando se te solicite");
        System.out.println("3. El resultado se mostrará en pantalla");
        System.out.println("4. Puedes realizar múltiples operaciones hasta elegir Salrr");

	}
//Comentario 28/01/2026 para volver  presentar
}