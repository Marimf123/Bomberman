package juego;

import java.util.Random;

public class Enemigo {

	// atributos
	Random aleatorio = new Random();
	int enemyX=aleatorio.nextInt(16);
	int enemyY=aleatorio.nextInt(16);
	
	int direccion;
	int direccionY;
	int state = 0;

	public String[] getDerecha() {
		return Derecha;
	}

	public String[] getIzquierda() {
		return Izquierda;
	}

	public void setDerecha(String[] derecha) {
		Derecha = derecha;
	}

	public void setIzquierda(String[] izquierda) {
		Izquierda = izquierda;
	}

	Random r = new Random();

	int velocidad = 1;
	String imagen = Imagen.ENEMY_NARANJA;;
	String[] Derecha = Imagen.ENEMY_Derecha;
	String[] Izquierda = Imagen.ENEMY_Izquierda;
	
	

	public Enemigo(Tablero miTablero) {
		while ((miTablero.getTablero()[enemyX][enemyY].getTipo() == Constante.Ladrillo) || (miTablero.getTablero()[enemyY][enemyY].getTipo() == Constante.Bloque)) {
			 enemyX=aleatorio.nextInt(16-2)+2;
			enemyY= aleatorio.nextInt(16-2)+2;
		}
		enemyX*=10;
		enemyY*=10;

		
		direccion = aleatorio.nextInt(4);

	}
	
	
	
	

	// constuctor

	public void movimiento(Tablero miTablero) {
		// izquierda
		if (direccion == 0) {
			int tipoCasilla = miTablero.getTablero()[(enemyX + 5 - velocidad) / 10][(enemyY + 8) / 10].getTipo();
			if (tipoCasilla == Constante.Vacio) {// camina
				enemyX -= velocidad;
				cycleLeft();
			}
			// chocar con pared o ladrillo
			if (tipoCasilla == Constante.Bloque || tipoCasilla == Constante.Ladrillo) {
				direccion = aleatorio.nextInt(4);

			}
		}
		// derecha
		if (direccion == 1) {
			int tipoCasilla = miTablero.getTablero()[(enemyX + 5 + velocidad) / 10][(enemyY + 8) / 10].getTipo();
			if (tipoCasilla == Constante.Vacio) {
				enemyX += velocidad;
				cycleRight();

			}

			if (tipoCasilla == Constante.Bloque || tipoCasilla == Constante.Ladrillo) {
				direccion = aleatorio.nextInt(4);

			}
		}
		// arriba
		if (direccion == 2) {
			int tipoCasilla = miTablero.getTablero()[(enemyX + 5) / 10][(enemyY + 8 - velocidad) / 10].getTipo();
			if (tipoCasilla == Constante.Vacio) {
				enemyY -= velocidad;
				cycleLeft();
			}

			if (tipoCasilla == Constante.Bloque || tipoCasilla == Constante.Ladrillo) {
				direccion = aleatorio.nextInt(4);

			}
		}
		// abajo
		if (direccion == 3) {
			int tipoCasilla = miTablero.getTablero()[(enemyX + 5) / 10][(enemyY + 8 + velocidad) / 10].getTipo();
			if (tipoCasilla == Constante.Vacio) {
				enemyY += velocidad;
				cycleRight();

			}

			if (tipoCasilla == Constante.Bloque || tipoCasilla == Constante.Ladrillo) {
				direccion = aleatorio.nextInt(4);

			}
		}

	}// metodo moverse

	public int getEnemyX() {
		return enemyX;
	}

	public int getEnemyY() {
		return enemyY;
	}

	public String getImagen() {
		return imagen;
	}

	public void setEnemyX(int enemyX) {
		this.enemyX = enemyX;
	}

	public void setEnemyY(int enemyY) {
		this.enemyY = enemyY;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	private void cycleRight() {
		switch (state) {
		case 0:
			imagen = getDerecha()[1];
			state = 1;
			break;
		case 1:
			imagen = getDerecha()[2];
			state = 2;
			break;
		case 2:
			imagen = getDerecha()[0];
			state = 0;
			break;
		}
	}

	private void cycleLeft() {
		switch (state) {
		case 0:
			imagen = getIzquierda()[1];
			state = 1;
			break;
		case 1:
			imagen = getIzquierda()[2];
			state = 2;
			break;
		case 2:
			imagen = getIzquierda()[0];
			state = 0;
			break;
		}
	}
	
	

}
