package PongV2.PongV2;

import java.awt.*;

public interface Paddle {
    public void draw(Graphics g);

    public void move();

    public int getY();

}
