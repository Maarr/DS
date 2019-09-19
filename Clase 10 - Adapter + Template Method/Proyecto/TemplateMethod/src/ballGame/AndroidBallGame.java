package ballGame;

import java.awt.Point;

import platform.Image2D;
import platform.android.AndroidAPI;

public class AndroidBallGame extends BallGame{
	
	private AndroidAPI api;
	
	public AndroidBallGame() {
		api=new AndroidAPI();
	}

	@Override
	public Image2D loadImage(String file) {
		return api.loadResource(file);
	}

	@Override
	public void drawBall(Image2D image, Point point) {
		api.draw(point.x, point.y, image);
		
	}

	@Override
	public Point getPosition() {
		return api.getTouch();
	}

}