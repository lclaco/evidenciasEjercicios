package interfaces;

import java.util.ArrayList;
import java.util.List;

public class AppEjemploInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo c = new Circulo(20);
		Rectangulo r = new Rectangulo(15,10);
		Triangulo t = new Triangulo(3,4,5);
		
		System.out.println(c.calcularArea());
		System.out.println(c.calcularPerimetro());
		
		System.out.println(r.calcularArea());
		System.out.println(r.calcularPerimetro());
		
		System.out.println(t.sp());
		System.out.println(t.calcularArea());
		System.out.println(t.calcularPerimetro());
		
		Figura f1 = new Circulo(90);
		Figura f2 = new Rectangulo(13,20);
		Figura f3 = new Triangulo(6,8,10);
		
		List<Figura> listadoFiguras = new ArrayList<>();
		
		listadoFiguras.add(c);
		listadoFiguras.add(r);
		listadoFiguras.add(t);
		listadoFiguras.add(f1);
		listadoFiguras.add(f2);
		listadoFiguras.add(f3);
		
		/*
		 listadoFiguras.forEach(System.out::println);
		 * 
		 * for (int i = 0; i < listadoFiguras.size(); i++) {
		 * System.out.println(listadoFiguras.get(i)); }
		 */
		
		listadoFiguras.forEach((f) -> {System.out.println("Area: "+f.calcularArea());});
		listadoFiguras.forEach((f) -> {System.out.println("Perimetro: "+f.calcularPerimetro());});
		
		
		/*
		 * for (Figura figura : listadoFiguras) {
		 * System.out.println(figura.calcularArea());
		 * System.out.println(figura.calcularPerimetro()); }
		 */
	}

}
