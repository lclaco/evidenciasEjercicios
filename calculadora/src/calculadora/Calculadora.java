package calculadora;

public class Calculadora {

public static void main(String[] args) {
// si args no tiene 3 elementos
if( args.length != 5 ) {
// mostrar ayuda al usuario
System.out.println("Por favor entregue 5 argumentos. Ejemplo Calculadora 1 suma 2 resta 3 multiplicar 4 dividirs");
return; // acá se termina el programa en caso que el usuario no entregue los args
}

int n1 = Integer.parseInt( args[0] );
int n2 = Integer.parseInt( args[2] );
String operacion = args[1];
int resultado = 0;

switch(operacion) {
case "suma":
resultado = sumar(n1, n2);
break;
case "resta":
resultado = restar(n1, n2);
break;
case "multiplicar":
resultado = multiplicar(n1, n2);
break;
case "dividir":
resultado = dividir(n1, n2);
break;	
	
}
System.out.println("El resultado es "+resultado);
}


public static int sumar(int numero1, int numero2) {
return numero1 + numero2;
}

public static int restar(int numero1, int numero2) {
return numero1 - numero2;
}

private static int multiplicar(int numero1, int numero2) {
	return numero1 * numero2;
}

private static int dividir(int numero1, int numero2) {
	return numero1 / numero2;
}

}
