
package juego;

import java.util.Scanner;

import edu.uc3m.game.GameBoardGUI;

public class Color {

	GameBoardGUI gui = new GameBoardGUI(Constante.Ancho, Constante.Largo);
	int contador = 0;
	boolean a;
	boolean bomb = true;

	public Color() {
		gui.setVisible(true);
		

	}

	static int tiempo = 0;
	int time = 0;
	
	public void pintarTablero(Tablero mitablero, Jugador bomberman) {
		gui.gb_setValueHealthMax(100);
		gui.gb_setValueHealthCurrent(bomberman.getVida()); 
		Casilla[][] array = mitablero.getTablero();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j].getDibujo().length() > 0) {
					gui.gb_setSquareImage(i, j, array[i][j].getDibujo());
				}
				// gui.gb_setSquareColor(i, j, 233, 255, 146);
			}
		}
	}

	

	public String getLastAction() {
		return gui.gb_getLastAction();
	}

	public void pintarbomba(Bomba[] bombas, Tablero miTablero) {
		for (int i = 0; i < bombas.length; i++) {
			if (bombas[i] != null) {
				if (bombas[i].isActive()) {
					gui.gb_addSprite(100 + i, bombas[i].getImagen(), true);
					gui.gb_moveSprite(100 + i, bombas[i].getBombX(), bombas[i].getBombY());
					gui.gb_setSpriteVisible(100 + i, true);
				} else {
					gui.gb_setSpriteVisible(100 + i, false);
				}
			}
		}

	}

	public void PintarFuego_Derecha(Bomba[] bombas, Tablero miTablero, Jugador bomberman) {
		for (int i = 0; i < bombas.length; i++) {
			if (bombas[i] != null) {
				int tipoCasilla = miTablero.getTablero()[bombas[i].getBombX() + 1][bombas[i].getBombY()].getTipo();
				if ( bombas[i].Explotar()) {
					if (tipoCasilla != Constante.Bloque) {
					if (bombas[i].isActive()) {
						gui.gb_addSprite(100000 + i, bombas[i].getImagenDerecha(), true);
						gui.gb_moveSprite(100000 + i, bombas[i].getBombX() + 1, bombas[i].getBombY());
						gui.gb_setSpriteVisible(100000 + i, true);
						miTablero.getTablero()[(bombas[i].getBombX() + 1)][(bombas[i].getBombY())].setTipo(Constante.Vacio);
						bomberman.RestarVidaEXpl(bombas[i].getBombX() + 1, bombas[i].getBombY() );
					} else {
						gui.gb_setSpriteVisible(100000 + i, false);
					}
				} else {

				}
			}
			}
		}
	}
	
	
	public void PintarFuego_Izquierda(Bomba[] bombas, Tablero miTablero, Jugador bomberman) {
		for (int i = 0; i < bombas.length; i++) {
			if (bombas[i] != null) {
				int tipoCasilla = miTablero.getTablero()[bombas[i].getBombX() - 1][bombas[i].getBombY()].getTipo();
				if ( bombas[i].Explotar()) {
					if (tipoCasilla != Constante.Bloque) {
					if (bombas[i].isActive()) {
						gui.gb_addSprite(200000 + i, bombas[i].getImagenIzquierda(), true);
						gui.gb_moveSprite(200000 + i, bombas[i].getBombX() - 1, bombas[i].getBombY());
						gui.gb_setSpriteVisible(200000 + i, true);
						miTablero.getTablero()[(bombas[i].getBombX() - 1)][(bombas[i].getBombY())].setTipo(Constante.Vacio);
						bomberman.RestarVidaEXpl(bombas[i].getBombX() - 1, bombas[i].getBombY() );
					} else {
						gui.gb_setSpriteVisible(200000 + i, false);
					}
				} else {

				}
			}
			}
		}
	}
	
	public void PintarFuego_Arriba(Bomba[] bombas, Tablero miTablero, Jugador bomberman) {
		for (int i = 0; i < bombas.length; i++) {
			if (bombas[i] != null) {
				int tipoCasilla = miTablero.getTablero()[bombas[i].getBombX()][bombas[i].getBombY()-1].getTipo();
				if ( bombas[i].Explotar()) {
					if (tipoCasilla != Constante.Bloque) {
					if (bombas[i].isActive()) {
						gui.gb_addSprite(400000 + i, bombas[i].getImagenArriba(), true);
						gui.gb_moveSprite(400000 + i, bombas[i].getBombX(), bombas[i].getBombY());
						gui.gb_setSpriteVisible(400000 + i, true);
						miTablero.getTablero()[(bombas[i].getBombX())][(bombas[i].getBombY()-1)].setTipo(Constante.Vacio);
						bomberman.RestarVidaEXpl(bombas[i].getBombX(), bombas[i].getBombY()-1 );
					} else {
						gui.gb_setSpriteVisible(400000 + i, false);
					}
				} else {

				}
			}
			}
		}
	}
	public void PintarFuego_Abajo(Bomba[] bombas, Tablero miTablero, Jugador bomberman) {
		for (int i = 0; i < bombas.length; i++) {
			if (bombas[i] != null) {
				int tipoCasilla = miTablero.getTablero()[bombas[i].getBombX()][bombas[i].getBombY()+1].getTipo();
				if ( bombas[i].Explotar()) {
					if (tipoCasilla != Constante.Bloque) {
					if (bombas[i].isActive()) {
						gui.gb_addSprite(300000 + i, bombas[i].getImagenAbajo(), true);
						gui.gb_moveSprite(300000 + i, bombas[i].getBombX(), bombas[i].getBombY());
						gui.gb_setSpriteVisible(300000 + i, true);
						miTablero.getTablero()[(bombas[i].getBombX())][(bombas[i].getBombY()+1)].setTipo(Constante.Vacio);
						bomberman.RestarVidaEXpl(bombas[i].getBombX(), bombas[i].getBombY()+1 );
					} else {
						gui.gb_setSpriteVisible(300000 + i, false);
					}
				} else {

				}
			}
			}
		}
	}

	public void pintarEnemy(Enemigo[] enemy, Tablero miTablero) {
		for (int i = 0; i < enemy.length; i++) {

			if (enemy[i] != null) {
				gui.gb_addSprite(1000 + i, enemy[i].getImagen(), true);
				gui.gb_moveSpriteCoord(1000 + i, enemy[i].getEnemyX(), enemy[i].getEnemyY());
				gui.gb_setSpriteVisible(1000 + i, true);

			}

		}
	}

	public void pintarPersonaje(Jugador bomberman) {

		gui.gb_addSprite(Constante.Bomber, bomberman.getImagen(), true);
		gui.gb_moveSprite(Constante.Bomber, bomberman.getPosx(), bomberman.getPosy());
		gui.gb_setSpriteVisible(Constante.Bomber, true);

	}
	
	public void pintarBonusBomba(Tablero miTablero, Bonus b1) {
		int tipoCasilla = miTablero.getTablero()[b1.getX()][b1.getY()].getTipo();
			if (tipoCasilla == Constante.Ladrillo) {
		gui.gb_addSprite(Constante.BONUS_BOMB, b1.getImagenBomba() , true);
		gui.gb_moveSprite(Constante.BONUS_BOMB,b1.getX(),b1.getY());
		gui.gb_setSpriteVisible(Constante.BONUS_BOMB, true);
	}

	}
	public void actualizarBomba(Bomba[] bombas) {
		for (int i = 0; i < bombas.length; i++) {
			if (bombas[i] != null) {
				if (bombas[i].isActive()) {
					gui.gb_setSpriteImage(100 + i, bombas[i].getImagen());
					gui.gb_moveSprite(100 + i, bombas[i].getBombX(), bombas[i].getBombY());
				} else {
					gui.gb_setSpriteVisible(100 + i, false);
					Constante.ContadorBombas = 0;
				}

			}

		}
	}
	static boolean show=false;
	public boolean Aparecer() {
		return show;
		
	}

	public void actualizarFuego_Derecha(Bomba[] bombas, Tablero miTablero) {
		for (int i = 0; i < bombas.length; i++) {
			if (bombas[i] != null) {
				int tipoCasilla = miTablero.getTablero()[bombas[i].getBombX() + 1][bombas[i].getBombY()].getTipo();
				if (tipoCasilla != Constante.Bloque) {
					if (bombas[i].Explotar()) {
						if(bombas[i].isActive()) {
						gui.gb_setSpriteImage(100000 + i, bombas[i].getImagenDerecha());
						gui.gb_moveSprite(100000 + i, bombas[i].getBombX() + 1, bombas[i].getBombY());
					} else {
						gui.gb_setSpriteVisible(100000 + i, false);
					}
				} else {

				}
			}
			}
		}
	}
	
	public void actualizarFuego_Izquierda(Bomba[] bombas, Tablero miTablero) {
		for (int i = 0; i < bombas.length; i++) {
			if (bombas[i] != null) {
				int tipoCasilla = miTablero.getTablero()[bombas[i].getBombX() - 1][bombas[i].getBombY()].getTipo();
				if (tipoCasilla != Constante.Bloque) {
					if (bombas[i].Explotar()) {
						if(bombas[i].isActive()) {
						gui.gb_setSpriteImage(200000 + i, bombas[i].getImagenIzquierda());
						gui.gb_moveSprite(200000 + i, bombas[i].getBombX() - 1, bombas[i].getBombY());
					} else {
						gui.gb_setSpriteVisible(200000 + i, false);
					}
				} else {

				}
			}
			}
		}
	}
	
	public void actualizarFuego_Arriba(Bomba[] bombas, Tablero miTablero) {
		for (int i = 0; i < bombas.length; i++) {
			if (bombas[i] != null) {
				int tipoCasilla = miTablero.getTablero()[bombas[i].getBombX()][bombas[i].getBombY()-1].getTipo();
				if (tipoCasilla != Constante.Bloque) {
					if (bombas[i].Explotar()) {
						if(bombas[i].isActive()) {
						gui.gb_setSpriteImage(400000 + i, bombas[i].getImagenArriba());
						gui.gb_moveSprite(400000 + i, bombas[i].getBombX(), bombas[i].getBombY()-1);
					} else {
						gui.gb_setSpriteVisible(400000 + i, false);
					}
				} else {

				}
			}
			}
		}
	}
	
	public void actualizarFuego_Abajo(Bomba[] bombas, Tablero miTablero) {
		for (int i = 0; i < bombas.length; i++) {
			if (bombas[i] != null) {
				int tipoCasilla = miTablero.getTablero()[bombas[i].getBombX()][bombas[i].getBombY()+1].getTipo();
				if (tipoCasilla != Constante.Bloque) {
					if (bombas[i].Explotar()) {
						if(bombas[i].isActive()) {
						gui.gb_setSpriteImage(300000 + i, bombas[i].getImagenAbajo());
						gui.gb_moveSprite(300000 + i, bombas[i].getBombX(), bombas[i].getBombY()+1);
					} else {
						gui.gb_setSpriteVisible(300000 + i, false);
					}
				} else {

				}
			}
			}
		}
	}

	public void actualizarPersonaje(Jugador bomberman) {
		gui.gb_setSpriteImage(Constante.Bomber, bomberman.getImagen());
		gui.gb_moveSpriteCoord(Constante.Bomber, bomberman.getPosx(), bomberman.getPosy());

	}

	public void actualizarEnemy(Enemigo[] enemy, Tablero miTablero) {
		for (int i = 0; i < enemy.length; i++) {
			if (enemy[i] != null) {
				gui.gb_setSpriteImage(1000 + i, enemy[i].getImagen());
				gui.gb_moveSpriteCoord(1000 + i, enemy[i].getEnemyX(), enemy[i].getEnemyY());

			}

		}
	}
	public void actualizarTablero(Tablero mitablero, Jugador bomberman) {
		gui.gb_setValueHealthMax(100);
		gui.gb_setValueLevel((Constante.currentLevel+1));
		gui.gb_setValueHealthCurrent(bomberman.getVida()); 
		Casilla[][] array = mitablero.getTablero();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j].getDibujo().length() > 0) {

					gui.gb_setSquareImage(i, j, array[i][j].getDibujo());
				}
				// gui.gb_setSquareColor(i, j, 233, 255, 146); } }
			}
		}
	}
	

}
