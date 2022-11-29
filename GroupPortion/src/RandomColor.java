import java.awt.*;

public class RandomColor {
    public RandomColor(Graphics g, int[][] map, int i, int j) {
        if (map[i][j] % 10 == 1) {
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
        }
    }
}