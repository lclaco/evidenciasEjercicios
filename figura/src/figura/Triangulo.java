package figura;

public class Triangulo extends Figura {
	double lado1,lado2,lado3;
	
	
	public Triangulo() {
		// TODO Auto-generated constructor stub
	}
		
	public Triangulo(double lado1, double lado2, double lado3) {
		super();
		setLado1(lado1);
		setLado2(lado2);
		setLado3(lado3);
		
	}


	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		if (lado1 >= 0 )
			this.lado1 = lado1;
        else
            System.out.println("el lado del triangulo no puede ser menor o igual a 0");
		
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		if (lado2 >= 0 )
			this.lado2 = lado2;
        else
            System.out.println("el lado del triangulo no puede ser menor o igual a 0");
		
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		if (lado3 >= 0 )
			this.lado3 = lado3;
        else
            System.out.println("el lado del triangulo no puede ser menor o igual a 0");
		
	}
	
		
	//semiPerimetro
	double sp() {		
		return (lado1 + lado2 + lado3)/2;
	}
	//Fórmula de Herón
	@Override
	double calcularArea() {
		// TODO Auto-generated method stub
		return Math.sqrt(sp()*(sp()-lado1) * (sp()-lado2) * (sp()-lado3));
	}

	@Override
	double calcularPerimetro() {
		// TODO Auto-generated method stub
		return lado1+lado2+lado3;
	}

}
