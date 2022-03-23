package geometria;



public class Circulo {
	private double radio,diametro;
	
	
	
	public Circulo() {
		
	}

	

	public Circulo(double radio) {
		
		this.radio = radio;
		
	}

	

	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		if (radio >=0)
			this.radio = radio;
        else
            System.out.println("El radio de la circunferencia no puede ser menor o igual a 0");
	}

	
	
	
	public double getDiametro() {
		return diametro;
	}



	public void setDiametro(double diametro) {
		if (radio >=0)
			this.diametro = diametro;
        else
            System.out.println("El diametro de la circunferencia no puede ser menor o igual a 0");		
	}



	public double calcularRadio( ) {
		return diametro/2;
	}

	public double perimetroCirculo() {
		return Math.PI * (2 * radio);
	}
	
	public double areaCirculo() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	
}
