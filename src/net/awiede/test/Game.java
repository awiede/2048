package net.awiede.test;
import javax.swing.JFrame;


public class Game {

	public final static int BOXESACROSS = 4, BOXESVERTICAL = 4, WINDOWXY = 100, BOXSIZE = 200;
	public static Board board;
	public static Tile[][] tiles;
	
	public Game() {
		
		tiles = new Tile[BOXESACROSS][BOXESVERTICAL];
		
		tiles[BOXESACROSS-1][BOXESVERTICAL-1] = new T2();
		
		JFrame window = new JFrame("2048");
		window.setSize(BOXESACROSS*BOXSIZE, (BOXESVERTICAL+1)*BOXSIZE+20);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(null);
		board = new Board();
		window.add(board);
		board.setBounds(0, 0, BOXESACROSS*BOXSIZE, BOXESVERTICAL*BOXSIZE);
		BoardKeyListener listener = new BoardKeyListener();
		board.addKeyListener(listener);
		board.setFocusable(true);
		window.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Game();
	}

}
