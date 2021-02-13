package juego;

public class Casilla {

private int tipo= Constante.Vacio;
	

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getDibujo() {
		String dibujo = "";
		switch (this.tipo) {
		case Constante.Bloque:
			dibujo = "wall.gif";
			break;
		case Constante.Ladrillo:
			dibujo = "bricks.gif";
			break;
		case Constante.Vacio:
			dibujo= "floor.gif";
			break;
		case Constante.BONUS_VELOCIDAD:
            dibujo="Skatesprite.png";
            break;
		case Constante.BONUS_FIRE:
            dibujo="Fireupsprite.png";
            break;
		
		default:
			dibujo = "";
			break;
		}
		return dibujo;
	}
	
	
	
}
