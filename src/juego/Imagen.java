package juego;


public class Imagen {
	// constantes
	static int playerHeight = 64;
	static int playerWidth = 32;
	static int BOMBSIZE = 40;
	// Jugador
	static String Parado = "bomberman111.gif";
	static String[] Arriba_teclado = { "bomberman101.gif", "bomberman102.gif", "bomberman103.gif", "bomberman104.gif", "bomberman105.gif" };

	public static int getPlayerHeight() {
		return playerHeight;
	}
	public static int getPlayerWidth() {
		return playerWidth;
	}
	public static int getBOMBSIZE() {
		return BOMBSIZE;
	}
	public static String getParado() {
		return Parado;
	}
	public static String[] getArriba_teclado() {
		return Arriba_teclado;
	}
	public static String[] getAbajo_teclado() {
		return Abajo_teclado;
	}
	public static String[] getIzquierda_Teclado() {
		return Izquierda_Teclado;
	}
	public static String[] getDerecha_Teclado() {
		return Derecha_Teclado;
	}
	public static String[] getMuerte() {
		return Muerte;
	}
	public static String getENEMY_NARANJA() {
		return ENEMY_NARANJA;
	}
	public static String[] getENEMY_Derecha() {
		return ENEMY_Derecha;
	}
	public static String[] getENEMY_Izquierda() {
		return ENEMY_Izquierda;
	}
	public static String getENEMY_AZUL() {
		return ENEMY_AZUL;
	}
	public static String[] getENEMY_DerechaAZUL() {
		return ENEMY_DerechaAZUL;
	}
	public static String[] getENEMY_IzquierdaAZUL() {
		return ENEMY_IzquierdaAZUL;
	}

	public static String[] getFUEGO_CENTRO() {
		return FUEGO_CENTRO;
	}
	public static String[] getFUEGO_ARRIBA() {
		return FUEGO_ARRIBA;
	}
	public static String[] getFUEGO_ABAJO() {
		return FUEGO_ABAJO;
	}
	public static String[] getFUEGO_DERECHA() {
		return FUEGO_DERECHA;
	}
	public static String[] getFUEGO_IZQUIERDA() {
		return FUEGO_IZQUIERDA;
	}
	public static void setPlayerHeight(int playerHeight) {
		Imagen.playerHeight = playerHeight;
	}
	public static void setPlayerWidth(int playerWidth) {
		Imagen.playerWidth = playerWidth;
	}
	public static void setBOMBSIZE(int bOMBSIZE) {
		BOMBSIZE = bOMBSIZE;
	}
	public static void setParado(String parado) {
		Parado = parado;
	}
	public static void setArriba_teclado(String[] arriba_teclado) {
		Arriba_teclado = arriba_teclado;
	}
	public static void setAbajo_teclado(String[] abajo_teclado) {
		Abajo_teclado = abajo_teclado;
	}
	public static void setIzquierda_Teclado(String[] izquierda_Teclado) {
		Izquierda_Teclado = izquierda_Teclado;
	}
	public static void setDerecha_Teclado(String[] derecha_Teclado) {
		Derecha_Teclado = derecha_Teclado;
	}
	public static void setMuerte(String[] muerte) {
		Muerte = muerte;
	}
	public static void setENEMY_NARANJA(String eNEMY_NARANJA) {
		ENEMY_NARANJA = eNEMY_NARANJA;
	}
	public static void setENEMY_Derecha(String[] eNEMY_Derecha) {
		ENEMY_Derecha = eNEMY_Derecha;
	}
	public static void setENEMY_Izquierda(String[] eNEMY_Izquierda) {
		ENEMY_Izquierda = eNEMY_Izquierda;
	}
	public static void setENEMY_AZUL(String eNEMY_AZUL) {
		ENEMY_AZUL = eNEMY_AZUL;
	}
	public static void setENEMY_DerechaAZUL(String[] eNEMY_DerechaAZUL) {
		ENEMY_DerechaAZUL = eNEMY_DerechaAZUL;
	}
	public static void setENEMY_IzquierdaAZUL(String[] eNEMY_IzquierdaAZUL) {
		ENEMY_IzquierdaAZUL = eNEMY_IzquierdaAZUL;
	}
	
	public static void setFUEGO_CENTRO(String[] fUEGO_CENTRO) {
		FUEGO_CENTRO = fUEGO_CENTRO;
	}
	public static void setFUEGO_ARRIBA(String[] fUEGO_ARRIBA) {
		FUEGO_ARRIBA = fUEGO_ARRIBA;
	}
	public static void setFUEGO_ABAJO(String[] fUEGO_ABAJO) {
		FUEGO_ABAJO = fUEGO_ABAJO;
	}
	public static void setFUEGO_DERECHA(String[] fUEGO_DERECHA) {
		FUEGO_DERECHA = fUEGO_DERECHA;
	}
	public static void setFUEGO_IZQUIERDA(String[] fUEGO_IZQUIERDA) {
		FUEGO_IZQUIERDA = fUEGO_IZQUIERDA;
	}
	static String[] Abajo_teclado = { "bomberman111.gif", "bomberman112.gif", "bomberman113.gif", "bomberman114.gif", "bomberman115.gif" };

	static String[] Izquierda_Teclado = { "bomberman121.gif", "bomberman122.gif", "bomberman123.gif", "bomberman124.gif", "bomberman125.gif" };

	static String[] Derecha_Teclado = { "bomberman131.gif", "bomberman132.gif", "bomberman133.gif", "bomberman134.gif", "bomberman135.gif" };


	static String[] Muerte = { "bomberman141.gif", "bomberman142.gif", "bomberman143.gif", "bomberman144.gif", "bomberman145.gif", "bomberman146.gif" };

	// enemigo naranja
	static String ENEMY_NARANJA = "enemy121.png";
	static String[] ENEMY_Derecha = { "enemy121.png", "enemy122.png", "enemy123.png", };
	static String[] ENEMY_Izquierda = { "enemy111.png", "enemy112.png", "enemy113.png" };

	// enemigo azul
	static String ENEMY_AZUL = "enemy221.png";
	static String[] ENEMY_DerechaAZUL = { "enemy221.png", "enemy222.png", "enemy223.png", };
	static String[] ENEMY_IzquierdaAZUL = { "enemy211.png", "enemy212.png", "enemy213.png",

	};

	// Bombas
	static String [] BOMBA= {"bomb2.gif","bomb1.gif"};

	public static String[] getBOMBA() {
		return BOMBA;
	}
	public static void setBOMBA(String[] bOMBA) {
		BOMBA = bOMBA;
	}
	// Fuego
	static String [] FUEGO_CENTRO = {"explosion_C1.gif","explosion_C2.gif","explosion_C3.gif","explosion_C4.gif"};
	static String [] FUEGO_ABAJO = {"explosion_S1.gif","explosion_S2.gif","explosion_S3.gif","explosion_S4.gif"};
	static String []FUEGO_ARRIBA  =  {"explosion_N1.gif","explosion_N2.gif","explosion_N3.gif","explosion_N4.gif"};
	static String [] FUEGO_DERECHA = {"explosion_E1.gif","explosion_E2.gif","explosion_E3.gif","explosion_E4.gif"};
	static String [] FUEGO_IZQUIERDA = {"explosion_W1.gif","explosion_W2.gif","explosion_W3.gif","explosion_W4.gif"};

}
