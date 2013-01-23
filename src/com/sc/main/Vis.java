package com.sc.main;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;


import javax.swing.JPanel;

import com.sc.db.DISPLAY;


public class Vis extends JPanel {

	public Vis() {
		super();
	}

	@Override
	public void paintComponent(Graphics g1) {
		Graphics2D g = (Graphics2D)g1;
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());

		//render visualization
		g.setColor(Color.BLACK);
		
	}

}
