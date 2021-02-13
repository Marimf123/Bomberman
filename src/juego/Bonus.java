package juego;

import java.util.Random;

public class Bonus {

	String imagenBomba= "Bombupsprite.png";

	public String getImagenBomba() {
		return imagenBomba;
	}

	public void setImagenBomba(String imagenBomba) {
		this.imagenBomba = imagenBomba;
	}

	Random aleat= new Random();
	int x;
	int y;
	
	public Bonus() {
		x=aleat.nextInt(16);
		y=aleat.nextInt(16);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	
	
	
}
