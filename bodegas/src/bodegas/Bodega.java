package bodegas;

public class Bodega {
	private boolean arrendada;
	private String numero;
	private int valor;

	public Bodega(boolean arrendada, String numero, int valor) {
		super();
		this.arrendada = arrendada;
		this.numero = numero;
	}


	public Bodega() {
		super();
	}


	public boolean isArrendada() {
		return arrendada;
	}


	public void setArrendada(boolean arrendada) {
		this.arrendada = arrendada;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	@Override
	public String toString() {
		return "Bodega [arrendada=" + arrendada + ", numero=" + numero + ", valor=" + valor + "]";
	}	
	
}
