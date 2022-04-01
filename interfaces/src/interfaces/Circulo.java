package interfaces;

public class Circulo implements Figura {

	double diametro;
	
	
	public Circulo() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Circulo(double diametro) {
		super();
		setDiametro(diametro);
	}


	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow((diametro/2), 2);
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return Math.PI *diametro;
	}


	public double getDiametro() {
		return diametro;
	}


	public void setDiametro(double diametro) {
		if (diametro >=0)
			this.diametro = diametro;
        else
            System.out.println("El diametro de la circunferencia no puede ser menor o igual a 0");		
	}
	

}
