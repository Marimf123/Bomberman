package juego;

public class Tablero {

	private Casilla[][] tablero = new Casilla[Constante.Ancho][Constante.Largo];

	public Tablero() {
		for (int i = 0; i < Constante.Ancho; i++) {
			for (int j = 0; j < Constante.Largo; j++) {
				tablero[i][j] = new Casilla();

				if (i == 0 || i == 16 || j == 0 || j == 16) {
					tablero[i][j].setTipo(Constante.Bloque);
				} else if ((i % 2 == 0) && (j % 2 == 0)) {
					tablero[i][j].setTipo(Constante.Bloque);
				} else {
					tablero[i][j].setTipo(Constante.Vacio);
				}
			}
		}

		int contador = 0;
		while (contador < 50) {

			int x = (int) (Math.random() * Constante.Ancho);
			int y = (int) (Math.random() * Constante.Largo);
			if ((tablero[x][y].getTipo() == Constante.Vacio) && (x * y > 2)) {
				tablero[x][y].setTipo(Constante.Ladrillo);
				contador++;
			}
		}	
		int a = (int) (Math.random() * Constante.Ancho);
		int b = (int) (Math.random() * Constante.Largo);
		if ((tablero[a][b].getTipo() == Constante.Ladrillo)) {
			
			
		}
	
		
	}


	
	public Casilla[][] getTablero() {
		return tablero;
	}
	
	
	

}
