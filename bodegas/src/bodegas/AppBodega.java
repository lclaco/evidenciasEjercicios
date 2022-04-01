package bodegas;

import java.util.ArrayList;

public class AppBodega {

	private static ArrayList<Bodega> bodegas = new ArrayList<>();
	
	public static void main(String[] args) {
		importarBodegas();
	}

	private static void importarBodegas() {
		for (int j = 0; j <= 20; j++) {
			bodegas.add(new Bodega(false,""+j,300000));
		}
		
		
	}
	
	
	
}
