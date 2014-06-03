import java.awt.Graphics;

import javax.swing.ImageIcon;


public abstract class Tile {
	
	public ImageIcon icon;

		public void Move(int direction) {
			
		}
	
		public void drawTile(Graphics g, int x, int y) {
			g.drawImage(icon.getImage(), x*Game.BOXSIZE, y*Game.BOXSIZE, Game.BOXSIZE, Game.BOXSIZE, null);
		}

}
