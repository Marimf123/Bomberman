package juego;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Tablero tablero1[] = new Tablero[Constante.Niveles];
		int currentLevel = Constante.currentLevel;
		tablero1[currentLevel] = new Tablero();

		Bonus b1= new Bonus();
		Bomba[] bombas1 = new Bomba[1000000];
		//Enemigo en1= new Enemigo(10,20);

		Enemigo[] en1 = new Enemigo[10];
		int contadorEnemigo = 0;

		int contadorBomb = 0; 

		Random aleat= new Random();
		Jugador bomberman = new Jugador(10, 10, null);
	
		int EnemyAL=aleat.nextInt(10);

		

		Color color1 = new Color();

		
		color1.pintarBonusBomba(tablero1[currentLevel], b1);
		
		boolean continuar = true;

		color1.pintarTablero(tablero1[currentLevel], bomberman);
		color1.pintarPersonaje(bomberman);
		
		for (int i = 0; i <= EnemyAL; i++) {
			Enemigo enemy1 = new Enemigo(tablero1[currentLevel]);
			
			en1[i] = enemy1;
		}
		color1.pintarEnemy(en1, tablero1[currentLevel]);
		//color1.pintarEnemigo(en1);
		
		do {

			String movimiento = color1.getLastAction(); // ver accion

			if (movimiento.equals("up")) {
				bomberman.move(0, tablero1[currentLevel]);
			} else if (movimiento.equals("down")) {
				bomberman.move(1, tablero1[currentLevel]);

			} else if (movimiento.equals("left")) {
				bomberman.move(2, tablero1[currentLevel]);
			} else if (movimiento.equals("right")) {
				bomberman.move(3, tablero1[currentLevel]);
			} else if (movimiento.equals("space")) {
			if(Constante.ContadorBombas< Constante.TotalBombas) {
				Bomba bombax = new Bomba(Constante.ContadorBombas);
				bombas1[Constante.ContadorBombas++] = bombax;

						bombax.setActive(true); 
						bombax.setBombX((bomberman.getPosx() + 5) / 10);
						bombax.setBombY((bomberman.getPosy() + 5) / 10);
						color1.pintarbomba(bombas1, tablero1[currentLevel]);
					
						
					}
			}

			for (int i = 0; i <= EnemyAL; i++) {
				if(en1[i]!=null) {
				en1[i].movimiento(tablero1[currentLevel]); 
				}
			}
			

			 //en1[i].movimiento(tablero1[currentLevel]);
	
			
			
			if (color1.Aparecer()) {
				color1.PintarFuego_Derecha(bombas1,tablero1[currentLevel], bomberman ); 
				color1.actualizarFuego_Derecha(bombas1,tablero1[currentLevel]);
				color1.PintarFuego_Izquierda(bombas1, tablero1[currentLevel],bomberman); 
				color1.actualizarFuego_Izquierda(bombas1, tablero1[currentLevel]);
				color1.PintarFuego_Arriba(bombas1, tablero1[currentLevel],bomberman);
				color1.actualizarFuego_Arriba(bombas1, tablero1[currentLevel]);
				color1.PintarFuego_Abajo(bombas1, tablero1[currentLevel],bomberman);
				color1.actualizarFuego_Abajo(bombas1,tablero1[currentLevel]);
			}
			
			Constante.Contador++;
			color1.actualizarTablero(tablero1[currentLevel], bomberman);
			color1.actualizarPersonaje(bomberman);
			if(Constante.ContadorBombas<=Constante.TotalBombas) {
			color1.actualizarBomba(bombas1); }
			color1.actualizarEnemy(en1, tablero1[currentLevel]);
			
		

			try {
				Thread.sleep(1200 / 30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} while (continuar);

	}
}
