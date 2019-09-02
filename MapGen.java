import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGen {
	public int map[][];
	public int brickWidth;
	public int brickHeight;
	
	public MapGen(int row, int col) {
		map = new int[row][col];
		for(int a=0; a < map.length; a++) {
			for(int b = 0; b < map[0].length;b++) {
				map[a][b] = 1;                    // 1 indicates the brick is still there
			}
		}
		brickWidth = 540/col;
		brickHeight = 150/row;
	}
	public void draw(Graphics2D g) {
		for(int a=0; a < map.length; a++) {
			for(int b = 0; b < map[0].length;b++) {
				if(map[a][b] > 0) {
					g.setColor(Color.WHITE);
					g.fillRect(b*brickWidth + 80, a*brickHeight + 50, brickWidth, brickHeight);
				
					g.setStroke(new BasicStroke(3));
					g.setColor(Color.BLACK);
					g.drawRect(b*brickWidth + 80, a*brickHeight + 50, brickWidth, brickHeight);
				}
			}
		}		
	}
	public void setBrickValue(int value, int row, int col) {
		map[row][col] = value;
	}
}
