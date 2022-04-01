package figura;

public class Rectangulo extends Figura {
	
	double base,altura;
	
	public Rectangulo(double base, double altura) {
		super();
		setAltura(altura);
		setBase(base);
	}
	public Rectangulo() {
		// TODO Auto-generated constructor stub
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
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		if (altura >= 0 )
			this.altura = altura;
        else
            System.out.println("La altura del Rectangulo no puede ser menor o igual a 0");
	
	}
	@Override
	double calcularArea() {
		// TODO Auto-generated method stub
		return altura*base;
	}

	@Override
	double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2*(altura+base);
	}
	
	
	
	
}
