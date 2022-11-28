import java.awt.*;

public class LevelMapGenerator extends MapGenerator {

    private int levels;

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
                    if (map[i][j] == 3) {
                        g.setColor(Color.red);
                    } if (map[i][j] == 2) {
                        g.setColor(Color.yellow);
                    }
                    if (map[i][j] == 1) {
                        g.setColor(Color.green);
                    }
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
