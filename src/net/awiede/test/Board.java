package net.awiede.test;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;


/**
 * 
 * 
 * @author andreas.s.wiede
 * @since now
 */
public class Board extends JComponent {

	/**
	 *  This is a constructor for the board.
	 *  
	 *  And my first javadoc in this project!!! 
	 */
	public Board() {
		
	}

	public void paintComponent(Graphics g) {
		for (int i=0; i<Game.BOXESACROSS; i++) {
			for (int j=0; j<=Game.BOXESVERTICAL; j++) {
				g.setColor(new Color(218, 193, 157));
				g.fillRect(i*Game.BOXSIZE, j*Game.BOXSIZE, Game.BOXSIZE, Game.BOXSIZE);
				g.setColor(Color.black);
				g.drawRect(i*Game.BOXSIZE, j*Game.BOXSIZE, Game.BOXSIZE, Game.BOXSIZE);
			}
		}
		
		for (int i=0; i<Game.BOXESACROSS; i++)
		{
			for (int j=0; j<Game.BOXESVERTICAL; j++)
			{
				try
				{
					Game.tiles[i][j].drawTile(g, i, j);
					revalidate();
				}
				catch (NullPointerException e)
				{
					
				}
			}
		}
		
	}
	
}
