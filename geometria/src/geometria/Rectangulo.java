package geometria;



public class Rectangulo {
	private double altura,base;
	
	public Rectangulo(double altura, double base) {
		super();
		this.altura = altura;
		this.base = base;
	}
	
	
	public Rectangulo() {
		super();
	}

	

	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		if (altura >=0)
			this.altura = altura;
        else
            System.out.println("La altura del Rectangulo no puede ser menor o igual a 0");
	
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		if (base >=0)
			this.base = base;
        else
            System.out.println("La base del Rectangulo no puede ser menor o igual a 0");
	
	}


	public double perimetroRectangulo() {
		return 2*(altura+base);
				
	}
	
	
	public double areaRectangulo() {
		return altura*base;
	}


	
	
}
