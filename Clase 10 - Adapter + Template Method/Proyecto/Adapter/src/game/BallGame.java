package game;

import java.awt.Point;
import adapters.Platform;
import platform.*;

/* Esta clase/paquete ser�a el c�digo del videojuego, el cual se quiere reutilizar
 * en las distintas plataformas 
 */

public class BallGame {
	 private Platform platform;
	 
	 public BallGame(Platform platform) {
		 this.platform=platform;
	 }

	public void play() {
		Image2D image = platform.loadImage("Bola.jpg");

		// L�gica principal del juego
		for (int i = 0; i < 10; i++) {
			Point point = platform.getPosition();
			// Comprobar colisiones...
			// Imprimir marcador...
			// Otra l�gica del juego...
			platform.drawBall(image, point);
		}
	}

}
