package ballGame;

import java.awt.Point;

import platform.Image2D;
import platform.playstation.Playstation5API;

public class Playstation5BallGame extends BallGame{
	
	private Playstation5API api;
	
	public Playstation5BallGame() {
		api=new Playstation5API();
	}

	@Override
	public Image2D loadImage(String file) {
		return api.loadGraphics(file);
	}

	@Override
	public void drawBall(Image2D image, Point point) {
		api.render(point.x, point.y, image);
	}

	@Override
	public Point getPosition() {
		return api.getJoystick();
	}

}