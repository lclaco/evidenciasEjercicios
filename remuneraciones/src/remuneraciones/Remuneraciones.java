package remuneraciones;

public class Remuneraciones {

	public static void main(String[] args) {
	
		if (args.length < 6) {
			mostarAyuda();
		}
		
		calculoeRemuneraciones(args);
		
	}

	
	private static void mostarAyuda() {
		System.out.println("Remuneraciones[seldo-base][colacion][movilizacion][afp][salud][tipo-contrato]");
		
	}

	private static void calculoeRemuneraciones(String[] args) {
			int sueldoBase = Integer.parseInt(args[0]);
			int colacion = Integer.parseInt(args[1]);
			int movilizacion = Integer.parseInt(args[2]);
			String afp = (args[3]);
			String salud = (args[4]);
			float montoPlanUF = 2.5f;
			char tipoContrato = (args[6].charAt(0));
			//bono1
			//bonoEscolar
			//bonoNacimiento
			//bonoEficiencia
			//hrasExtras
			//asignacionFamiliar
			//gratificaciones
			//sueldoLiquido
			
			
			int montoImponible = calcularMontoImponible(sueldoBase);
			int montoAFP = calcularMontoAFP(montoImponible, afp);
			int montoFonasa = calcularMontoSalud(montoImponible,montoPlanUF,salud);
			
			System.out.printf("Monto Imponible: $%d\n", montoImponible);
			System.out.printf("AFP: %s\n", afp);
			System.out.printf("Monto AFP: $%d\n", montoAFP);			
			System.out.printf("Salud: %s\n", salud);
			System.out.printf("Monto Salud: $%d\n", montoFonasa);
			//%s interpolar un String
			//%d interpolar un Number
			
		}
	
	private static int calcularMontoImponible(int sueldoBase) {
		return sueldoBase;
	}
	
	private static int calcularMontoNoImponible(int colacion, int movilizacion) {
		return colacion + movilizacion;	
		}
	
	private static int calcularMontoSalud(int montoImponible,float montoUFIsapre, String salud) {
		double ufMes = 31663.42; 
		
		switch (salud) {
		case "fonasa": {			
			return (int)(montoImponible * 0.07);
		}
		case "Banmedica": {			
			return (int)(montoUFIsapre * ufMes);		
				}
		case "Cruz Blanca": {			
			return (int)(montoUFIsapre * ufMes);
		}
		case "Consalud": {			
			return (int)(montoUFIsapre * ufMes);
		}
		case "Colmena ": {			
			return (int)(montoUFIsapre * ufMes);
		}
		case "Vida tres": {			
			return (int)(montoUFIsapre * ufMes);
		}
		
		case "Mas vida": {			
			return (int)(montoUFIsapre * ufMes);
		}
		
		
		}
		return 0;
		
	}
	
	private static int calcularMontoAFP(int montoImponible, String afp ) {
		switch (afp) {
		case "capital":{
			return (int)(montoImponible * 0.1144);
		}
		case "cuprum":{
			return (int)(montoImponible * 0.1144);
		}
		case "habitat":{
			return (int)(montoImponible * 0.1127);
		}
		case "planvital":{
			return (int)(montoImponible * 0.1116);
		}
		case "provida":{
			return (int)(montoImponible * 0.1145);
		}
		case "modelo":{
			return (int)(montoImponible * 0.1058);
		}
		case "uno":{
			return (int)(montoImponible * 0.1069);
		}
		
		}
		return 0;
	}
	
}
