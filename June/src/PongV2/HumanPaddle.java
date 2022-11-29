/*package PongV2;

import java.awt.*;

public class HumanPaddle implements Paddle {
    double y, yVel;
    boolean upAccel, downAccel;
    final double GRAVITY = 0.7;
    int player, x;

    public HumanPaddle(int player){
        upAccel = false; downAccel = true;
        y = 210; yVel = 0;
        if(player == 1){
            x=20;
        }
        else {
            x = 660;
        }
    }

    public void draw(Graphics g){
        g.setColor(Color.white);
        g.fillRect(x, (int)y, 20, 80);
    }
    public void move() {
        if(upAccel){
            yVel -= 2;
        }
        else if(downAccel){
            yVel += 2;
        }
        else if(!upAccel && !downAccel) {
            yVel *= GRAVITY;
        }
        if(yVel>=5){
            yVel = 5;
        }
        else if(yVel<=-5){
            yVel = -5;
        }
        y += yVel;
        if (y<0){
            y = 0;
        }
        if (y> 420){
            y = 420;
        }
    }

    public void setUpAccel(boolean input){
        upAccel = input;
    }
    public void setDownAccel(boolean input){
        downAccel = input;
    }
    public int getY(){
        return (int)y;
    }

}


 */


import java.awt.*;

public class HumanPaddle implements Paddle {
    //add playerX
    double x, xVel;
    boolean rightAccel, leftAccel;
    double y = 550;
    //int player, x;

    public HumanPaddle(int player){
        rightAccel = false; leftAccel = true;
        x = 310; xVel = 0;


    public void draw(Graphics g){
        g.setColor(Color.white);
        g.fillRect(x, (int)y, 20, 80);
    }
    public void move() {
        if(rightAccel){
            xVel -= 2;
        }
        else if(leftAccel){
            xVel += 2;
        }
        else if(!rightAccel && !leftAccel) {
            xVel *= 0;
        }
        if(xVel>=5){
            xVel = 5;
        }
        else if(xVel<=-5){
            xVel = -5;
        }
        x += xVel;
        if (x<0){
            x = 0;
        }
        if (x> 700){
            x = 700;
        }
    }

    public void setRightAccel(boolean input){
        rightAccel = input;
    }
    public void setLeftAccel(boolean input){
        leftAccel = input;
    }
    public int getX(){
        return (int)x;
    }
