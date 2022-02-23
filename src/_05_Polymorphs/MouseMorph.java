package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MouseMorph extends Polymorph {
	public MouseMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
		
	}
	
	public void mouseUpdate(int mouseX, int mouseY) {
		x = mouseX;
		y = mouseY;
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.CYAN);
		g.fillRect(x, y, width, height);
	}
}
