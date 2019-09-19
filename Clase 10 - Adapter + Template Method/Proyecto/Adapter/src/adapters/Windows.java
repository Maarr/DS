package adapters;

import java.awt.Point;

import platform.Image2D;
import platform.windows.WindowsAPI;

public class Windows implements Platform{
	
private WindowsAPI api;
	
	public Windows() {
		api=new WindowsAPI();
	}

	@Override
	public Image2D loadImage(String file) {
		return api.loadFile(file);
	}

	@Override
	public void drawBall(Image2D image, Point point) {
		api.paint(point.x, point.y, image);
	}

	@Override
	public Point getPosition() {
		return api.getMouseClick();
	}

}
