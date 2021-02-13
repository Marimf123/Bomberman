package juego;

public class Bomba {
	/*
	 * Esta clase contiene poner las bombas teniendo en cuenta ciertos puntos: 1 Hay
	 * un tiempo de duracion desde que se pone la bomba hasta que explote 2 Si hay
	 * otra bomba en el rango de la bomba tambien explotara 3 el rango de la bomba
	 * cambia si se utiliza bonus
	 */

	private String[] Bomba = Imagen.BOMBA;
	boolean vis;
	String[] Centro = Imagen.FUEGO_CENTRO;
	String[] Derecha = Imagen.FUEGO_DERECHA;
	String[] Izquierda = Imagen.FUEGO_IZQUIERDA;
	String[] Arriba = Imagen.FUEGO_ARRIBA;
	String[] Abajo = Imagen.FUEGO_ABAJO;
	int Detonar = 0;
	String imagen;
	int tiempo=0;
	
	int NumeroBombas=0;

	public String[] getCentro() {
		return Centro;
	}

	public String[] getDerecha() {
		return Derecha;
	}

	public String[] getIzquierda() {
		return Izquierda;
	}

	public String[] getArriba() {
		return Arriba;
	}

	public String[] getAbajo() {
		return Abajo;
	}

	public void setCentro(String[] centro) {
		Centro = centro;
	}

	public void setDerecha(String[] derecha) {
		Derecha = derecha;
	}

	public void setIzquierda(String[] izquierda) {
		Izquierda = izquierda;
	}

	public void setArriba(String[] arriba) {
		Arriba = arriba;
	}

	public void setAbajo(String[] abajo) {
		Abajo = abajo;
	}

	int bombX = 0;
	int bombY = 0;

	int contadorBombas = 0;
	Bomba[] bombas = new Bomba[contadorBombas];

	int posicion = 0;

	public Bomba(int x) {
		posicion = x;

	}

	public String[] getBomba() {
		return Bomba;
	}

	public void setBomba(String[] bomba) {
		Bomba = bomba;
	}

	public int getBombX() {
		return bombX;
	}

	public int getBombY() {
		return bombY;
	}

	public void setBombX(int bombX) {
		this.bombX = bombX;
	}

	public void setBombY(int bombY) {
		this.bombY = bombY;
	}

	public boolean Casilla(int x, int y, Tablero mitablero) {
		boolean casilla1 = false;
		int tipoCasilla = mitablero.getTablero()[(x + 5) / 10][(y + 5) / 10].getTipo();
		if (tipoCasilla != Constante.Ladrillo && tipoCasilla != Constante.Bloque) {
			casilla1 = true;
		} else {
			casilla1 = false;
		}
		return casilla1;
	}

	boolean visible;
	public boolean Visib() {
		return visible;
		
	}
	
	boolean Active;
	
	
	public boolean isActive() {
		return Active;
	}

	public void setActive(boolean active) {
		Active = active;
	}

	public String getImagen() {
		imagen=Imagen.BOMBA[(Constante.Contador/2)%2];
		if(Explotar()) {
			Color.show=true;
			Detonar++;
			if (Detonar ==15 ) {
			  Active=false;
			  imagen=null;
			
			} else {
			imagen = Imagen.FUEGO_CENTRO[(int)Detonar/5];		
			}
		}
		return imagen;
	}

	public boolean Explotar() {
		tiempo++;
		if(tiempo>55) {
			return true;
		}
		else {
			return false;
		}
	}

	public String getImagenAbajo() {
		if(Detonar==15) {
			return null;
		}
		return Imagen.FUEGO_ABAJO[Detonar/5];
		
	}
	public String getImagenArriba() {
		if(Detonar==15) {
		}
		return Imagen.FUEGO_ARRIBA[Detonar/5];
		
	}
	public String getImagenDerecha() {
		return Imagen.FUEGO_DERECHA[Detonar/5];
		
	}
	public String getImagenIzquierda() {
		if(Detonar==15) {

		}
		
		return Imagen.FUEGO_IZQUIERDA[Detonar/5];
		
	}
	
}
