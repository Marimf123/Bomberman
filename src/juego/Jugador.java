package juego;

import java.util.ArrayList;

import edu.uc3m.game.GameBoardGUI;
import juego.Casilla;
import juego.Constante;
import juego.Tablero;
import edu.uc3m.game.GameBoardGUI;

public class Jugador {
	private static int Nivel = 0;
	/*
	 * String[] RIGHT_IMAGES = Imagen.Derecha_Teclado; String[] DIE = Imagen.Muerte;
	 * // Move direction = Move.STOP;
	 */

	int velocidad = 1;
	int vida=100;
	public void setVida(int vida) {
		this.vida = vida;
	}

	String imagen;
	int posx;
	int posy;

	static ArrayList<Bomba> bombs = new ArrayList<Bomba>();

	int contador = 1;

	String[] UP_IMAGES = Imagen.Arriba_teclado;
	String[] DOWN_IMAGES = Imagen.Abajo_teclado;
	String[] LEFT_IMAGES = Imagen.Izquierda_Teclado;
	String[] RIGHT_IMAGES = Imagen.Derecha_Teclado;
	String[] DIE = Imagen.Muerte;
	int state = 0;
	int state2 = 0;

	public Jugador(int posx, int posy, String image) {
		super();
		this.imagen = Imagen.Parado;
		this.posx = posx;
		this.posy = posy;
	}

	public String getImagen() {
		return imagen;
	}

	public int getVelocidad() {
		return velocidad;

	}

	public void move(int movimiento, Tablero miTablero) {

		switch (movimiento) {
		case 0:
			int tipoCasilla = miTablero.getTablero()[(posx + 5) / 10][(posy + 8 - velocidad) / 10].getTipo();

			if (tipoCasilla != Constante.Ladrillo && tipoCasilla != Constante.Bloque) {
				posy = posy - velocidad;
				cycleUp();
			} else {
			}

			break;
		case 1:

			tipoCasilla = miTablero.getTablero()[(posx + 5) / 10][(posy + 8 + velocidad) / 10].getTipo();

			if (tipoCasilla != Constante.Ladrillo && tipoCasilla != Constante.Bloque) {
				posy = posy + velocidad;
				cycleDown();
				System.out.println("posicion y" + posy);
			} else {

			}

			break;
		case 2:
			tipoCasilla = miTablero.getTablero()[(posx + 5 - velocidad) / 10][(posy + 8) / 10].getTipo();

			if (tipoCasilla != Constante.Ladrillo && tipoCasilla != Constante.Bloque) {
				posx = posx - velocidad;
				cycleLeft();

			} else {
			}
			break;
		case 3:
			tipoCasilla = miTablero.getTablero()[(posx + 5 + velocidad) / 10][(posy + 8) / 10].getTipo();

			if (tipoCasilla != Constante.Ladrillo && tipoCasilla != Constante.Bloque) {
				posx = posx + velocidad;
				cycleRight();
				System.out.println("posicion x" + posx);

			} else {
			}
			break;
		default:
			break;
		}
	}

	private void cycleRight() {
		switch (state) {
		case 0:
			imagen = getRIGHT_IMAGES()[1];
			state = 1;
			break;
		case 1:
			imagen = getRIGHT_IMAGES()[2];
			state = 2;
			break;
		case 2:
			imagen = getRIGHT_IMAGES()[3];
			state = 3;
			break;
		case 3:
			imagen = getRIGHT_IMAGES()[4];
			state = 4;
			break;
		case 4:
			imagen = getRIGHT_IMAGES()[0];
			state = 0;
			break;
		}
	}

	private void cycleLeft() {
		switch (state) {
		case 0:
			imagen = getLEFT_IMAGES()[1];
			state = 1;
			break;
		case 1:
			imagen = getLEFT_IMAGES()[2];
			state = 2;
			break;
		case 2:
			imagen = getLEFT_IMAGES()[3];
			state = 3;
			break;
		case 3:
			imagen = getLEFT_IMAGES()[4];
			state = 4;
			break;
		case 4:
			imagen = getLEFT_IMAGES()[0];
			state = 0;
			break;
		}
	}

	private void cycleUp() {
		switch (state) {
		case 0:
			imagen = getUP_IMAGES()[1];
			state = 1;
			break;
		case 1:
			imagen = getUP_IMAGES()[2];
			state = 2;
			break;
		case 2:
			imagen = getUP_IMAGES()[3];
			state = 3;
			break;
		case 3:
			imagen = getUP_IMAGES()[4];
			state = 4;
			break;
		case 4:
			imagen = getUP_IMAGES()[0];
			state = 0;
			break;
		}
	}

	private void cycleDown() {
		switch (state) {
		case 0:
			imagen = getDOWN_IMAGES()[1];
			state = 1;
			break;
		case 1:
			imagen = getDOWN_IMAGES()[2];
			state = 2;
			break;
		case 2:
			imagen = getDOWN_IMAGES()[3];
			state = 3;
			break;
		case 3:
			imagen = getDOWN_IMAGES()[4];
			state = 4;
			break;
		case 4:
			imagen = getDOWN_IMAGES()[0];
			state = 0;
			break;
		}
	}

	public int getVida() {
		return vida;
	}

	public String[] getUP_IMAGES() {
		return UP_IMAGES;
	}

	public String[] getDOWN_IMAGES() {
		return DOWN_IMAGES;
	}

	public String[] getLEFT_IMAGES() {
		return LEFT_IMAGES;
	}

	public String[] getRIGHT_IMAGES() {
		return RIGHT_IMAGES;
	}

	public String[] getDIE() {
		return DIE;
	}

	public int getPosx() {
		return this.posx;
	}

	public int getPosy() {
		return this.posy;
	}

public void RestarVidaEXpl(int XBomba, int YBomba) {
	if(XBomba == getPosx() && YBomba== getPosy()){
		vida-=20;
	}
}
		
	

}
