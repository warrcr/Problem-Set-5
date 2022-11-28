import java.awt.*;

public class MapGenerator2 {

    public int map[][];
    public int brickWidth;
    public int brickHeight;

    public MapGenerator2(int row, int column) {
        map = new int[row][column];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = 2;
            }
        }
        brickWidth = 540 / column;
        brickHeight = 150 / row;
    }

    public void draw(Graphics2D g) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] > 0) {
                    if (map[i][j] == 2) {
                        g.setColor(Color.white);
                    } else if (map[i][j] == 1) {
                        g.setColor(Color.yellow);
                    }
                    g.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
                }
            }
        }
    }

    public void setBrickValue(int value, int row, int column) {
        map[row][column] = value;
    }

    public void reduceBrickValue(int row, int column) {
        if (map[row][column] > 0)
            map[row][column] -= 1;
    }
}





