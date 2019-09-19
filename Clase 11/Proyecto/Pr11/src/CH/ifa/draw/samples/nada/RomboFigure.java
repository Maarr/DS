package CH.ifa.draw.samples.nada;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Vector;

import CH.ifa.draw.standard.AbstractFigure;

public class RomboFigure extends AbstractFigure{
	
	//Está modo Rectangulo, ojo que es un Rombo, arreglarlo
	
	private Rectangle r;

	public RomboFigure() {
		this(new Point(0,0), new Point(0,0));
	}

	public RomboFigure(Point origin, Point corner) {
		basicDisplayBox(origin,corner);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(r.x,r.y,r.width,r.height);
		
	}

	@Override
	protected void basicMoveBy(int dx, int dy) {
		r.translate(dx, dy);
	}

	@Override
	public void basicDisplayBox(Point origin, Point corner) {
		r=new Rectangle(origin);
		r.add(corner);
		
	}

	@Override
	public Rectangle displayBox() {
		return new Rectangle(r.x,r.y,r.width,r.height);
	}

	@Override
	public Vector handles() {
		return new Vector();
	}

}
