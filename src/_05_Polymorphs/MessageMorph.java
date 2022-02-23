package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class MessageMorph extends Polymorph{
	public MessageMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "YOU CLICKED THE MESSAGE SHAPE");
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.yellow);
		g.fillRect(x, y, width, height);
	}
}
