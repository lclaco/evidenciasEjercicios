package geometria;

import java.util.Scanner;


public class Calculo {

		
	public final static short OPCION_MENU_AREARECTANGULO = 1;
	public final static short OPCION_MENU_PERIMETRORECTANGULO =2;
	public final static short OPCION_MENU_RADIOCIRCUNFERENCIA = 3;
	public final static short OPCION_MENU_PERIMETROCIRCULO = 4;
	public final static short OPCION_MENU_AREACIRCULO = 5;
	public final static short OPCION_MENU_SALIR = 6;
	
	
	public static void main(String[] args) {
		
		/*Desarrolle una aplicación interactiva por consola que le permita hacer los siguientes cálculos:

			Área de un rectángulo
			Radio de un círculo a partir del diámetro
			Perímetro del círculo
			Área de un círculo*/
		int opcionSeleccionada;
		do {
			opcionSeleccionada = menu();
			switch (opcionSeleccionada) {
			case OPCION_MENU_AREARECTANGULO:
				calcularAreaRectangulo();
				//Rectangulo.areaRectangulo();
				break;
			case OPCION_MENU_PERIMETRORECTANGULO:
				calcularPerimetroRectangulo();
				//Rectangulo.areaRectangulo();
				break;
			case OPCION_MENU_RADIOCIRCUNFERENCIA:
				calcularRadio();
				//Circulo.diametroCirculo();
				break;	
			case OPCION_MENU_PERIMETROCIRCULO:
				calcularPerimetroCirculo();
				break;
			case OPCION_MENU_AREACIRCULO:
				calcularAreaCirculo();
				break;
			
			}
			
		} while (opcionSeleccionada != OPCION_MENU_SALIR);
		
		System.out.printf("Seleccionó la opción %d", opcionSeleccionada);
	}


	private static void calcularPerimetroRectangulo() {
		System.out.println("Ingrese la altura del rectangulo");
		Scanner scanner = new Scanner(System.in);
		double altura = scanner.nextDouble();
		System.out.println("Ingrese la base del rectangulo");
		double base = scanner.nextDouble();
		
		Rectangulo rectangulo = new Rectangulo(base,altura);
		double perimetro = rectangulo.perimetroRectangulo();
		
		System.out.printf("El Perimetro del cuadrado con altura: %f y lado: %f es: %f ", altura,base,perimetro );				
	}


	private static void calcularAreaRectangulo() {
		System.out.println("Ingrese la altura del rectangulo");
		Scanner scanner = new Scanner(System.in);
		double altura = scanner.nextDouble();
		System.out.println("Ingrese la base del rectangulo");
		double base = scanner.nextDouble();
		
		Rectangulo rectangulo = new Rectangulo(base,altura);
		double area = rectangulo.areaRectangulo();
		
		System.out.printf("El Area del cuadrado con altura: %f y lado: %f es: %f", altura,base,area );
		
	}


	private static void calcularPerimetroCirculo() {
		System.out.println("Ingrese radio del circulo");
		Scanner scanner = new Scanner(System.in);
		double radio = scanner.nextDouble();
		
		Circulo circulo = new Circulo(radio);
		double perimetro = circulo.perimetroCirculo();
		
		
		System.out.printf("El Perimetro del circulo de radio: %f  es: %f", radio,perimetro );
	}


	private static void calcularRadio() {
		System.out.println("Ingrese diametro del circulo");
		Scanner scanner = new Scanner(System.in);
		double diametro = scanner.nextDouble();		
		
		Circulo circulo = new Circulo(diametro);
		double radio = circulo.calcularRadio();
		
		System.out.printf("El radio del circulo de diametro: %f es: %f", diametro,radio );
		
	}


	private static void calcularAreaCirculo() {
		System.out.println("Ingrese radio del circulo");
		Scanner scanner = new Scanner(System.in);
		double radio = scanner.nextDouble();	
		
		Circulo circulo = new Circulo(radio);
		double radioCirculo = circulo.areaCirculo();
		
		System.out.printf("El radio del circulo de diametro: %f es: %f", radio, radioCirculo );
		
		
	}


	private static int menu() {
		System.out.println("----------------------- \n *MENU CALCULO GEOMETRICO * \n-----------------------");
		System.out.println("1. AREA RECTANGULO");
		System.out.println("2. PERIMETRO RECTANGULO");
		System.out.println("3. RADIO CIRCUNFERENCIA");
		System.out.println("4. PERIMETRO TROCIRCULO");
		System.out.println("5. AREACIRCULO");
		System.out.println("6. EXIT");
		
		System.out.println("\n-------------------------------- \n *POR FAVOR DIGITE UNA OPCIÓN* \n--------------------------------");
		
		Scanner scanner = new Scanner( System.in);		
		int opcionSeleccionada = scanner.nextInt();
		
		return opcionSeleccionada;
	}
		
	
	
	
	}


