package net.awiede.test;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;


public class BoardKeyListener implements KeyListener {


	public void keyPressed(KeyEvent e) {
		System.out.println("Inside keyPressed");
		int keyCode = e.getKeyCode();
		switch (keyCode) {
		case KeyEvent.VK_UP:
			//handle up key
			for (int i=0; i<Game.BOXESACROSS; i++) {
				for (int j=Game.BOXESVERTICAL-1; j>0; j--) {
					if (Game.tiles[i][j] != null) {
						for (int k=j-1; k>0; k--) {
							/*if (Game.tiles[i][k] != null) {
								Game.tiles[i][k+1] = Game.tiles[i][j];
								Game.tiles[i][j] = null;
							}*/
							Game.tiles[i][j].Move(keyCode);
						}
					} else {
						break;
					}
				}
			}
			//Game.tiles[0][0] = Game.tiles[3][3];
			//Game.tiles[3][3] = null;
			Game.board.repaint();
			System.out.println("Up key pressed");
			break;
		case KeyEvent.VK_DOWN:
			//handle down key
			break;
		case KeyEvent.VK_LEFT:
			//handle left key
			break;
		case KeyEvent.VK_RIGHT:
			//handle right key
			break;
		}
		
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent e) {
		System.out.println("Inside keyTyped");
	}

}
