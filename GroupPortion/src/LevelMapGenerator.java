/**********************************************************************
 * @file LevelMapGenerator.java
 * @brief
 * @author June Bernstein, Jack Dawson, Carly Warren
 * @date: November 30, 2022
 * @acknowledgement: n/a
 ***********************************************************************/


import java.awt.*;

public class LevelMapGenerator extends MapGenerator {

    public int levels;
    public RandomColor randomColor;

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