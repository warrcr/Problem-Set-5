import javax.swing.*;
// This is the main method of Brick Breaker
/* Ideas to implement into code:
1. Extra balls after you win the first time
2. Add more bricks after they win the first time
3. Increase speed of ball
4. Power-Ups (extra balls, extra life, etc.)
5. Bricks need to be hit multiple times to break
6. Other
 */
public class Main {
    public static void main(String[] args) {
        JFrame obj = new JFrame();

        Game gamePlay = new Game();

        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Breakout Ball");
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
        obj.setVisible(true);

    }
}
