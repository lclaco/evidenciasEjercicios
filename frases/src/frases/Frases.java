package frases;



public class Frases {

	public static String[] frases=  {
		"El �nico modo de hacer un gran trabajo es amar lo que haces","Nunca pienso en las consecuencias de fallar un gran tiro� cuando se piensa en las consecuencias se est� pensando en un resultado negativo","El dinero no es la clave del �xito; la libertad para poder crear lo es","Cuanto m�s duramente trabajo, m�s suerte tengo","La inteligencia consiste no s�lo en el conocimiento, sino tambi�n en la destreza de aplicar los conocimientos en la pr�ctica",
	};
	
	public static void main(String[] args) {
		if (args.length == 0) {
			mostrarFraseAleatoria();
		}else {
			mostrarTodasLasFrases();
		}
	}

	private static void mostrarTodasLasFrases() {
		// TODO Auto-generated method stub
		for (int i = 0; i < frases.length; i++) {
			System.out.println(frases[i]);
		}
	}

	private static void mostrarFraseAleatoria() {
		double numeroAleatorio = Math.random() * frases.length;
		int numeroAleatorioEntero = (int) numeroAleatorio;
		System.out.println(frases[numeroAleatorioEntero]);
		}

}
