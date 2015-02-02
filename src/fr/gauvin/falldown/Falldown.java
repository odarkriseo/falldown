package fr.gauvin.falldown;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Falldown extends JFrame {

	public Falldown() {
		super("Falldown");
		//hello world$
		
		WindowListener l = new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		};
		
		JButton b = new JButton("toto");
		
		Canvas c = new Canvas() {
			@Override
			public void paint(Graphics g) {
				super.paint(g);
				
				g.drawLine(10, 10, 20, 20);
			}
		};
		
		c.setSize(200, 100);
		
		add(c);

		addWindowListener(l);
		setSize(200,100);
		setVisible(true);
	}

}
