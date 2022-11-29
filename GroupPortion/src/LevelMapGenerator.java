import java.awt.*;
import java.util.Random;

public class LevelMapGenerator extends MapGenerator {

    private int levels;
    private RandomColor randomColor;

    public LevelMapGenerator(int row, int column, int level) {
        super(row, column);
        this.levels =  level;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = this.levels;
            }
        }
    }

    public void draw(Graphics2D g) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] > 0) {
                    randomColor = new RandomColor(g, map, i, j);
                    /*if (map[i][j] % 10 == 1) {
                        g.setColor(Color.green);
                    }
                    else if (map[i][j] % 10 == 2) {
                        g.setColor(Color.yellow);
                    }
                    else if (map[i][j] % 10 == 3) {
                        g.setColor(Color.red);
                    }
                    else if (map[i][j] % 10 == 4) {
                        g.setColor(Color.magenta);
                    }
                    else if (map[i][j] % 10 == 5) {
                        g.setColor(Color.cyan);
                    }
                    else if (map[i][j] % 10 == 6) {
                        g.setColor(Color.white);
                    }
                    else if (map[i][j] % 10 == 7) {
                        g.setColor(Color.orange);
                    }
                    else if (map[i][j] % 10 == 8) {
                        g.setColor(Color.blue);
                    }
                    else if (map[i][j] % 10 == 9) {
                        g.setColor(Color.pink);
                    }
                    else {
                        g.setColor(Color.gray);
                    }*/
                    g.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
                }
            }
        }
    }

    public void reduceBrickValue(int row, int column) {
        if (map[row][column] > 0)
            map[row][column] -= 1;
    }
}