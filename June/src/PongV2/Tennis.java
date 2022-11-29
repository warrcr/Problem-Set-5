package PongV2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Tennis extends JFrame implements Runnable, KeyListener {
    static final int WIDTH = 700, HEIGHT = 500;
    Thread thread;
    HumanPaddle p1;
    AIPaddle p2;
    Ball b1;
    boolean gameStarted;

    public Tennis(){
        this.setSize(WIDTH, HEIGHT);

        gameStarted = false;
        this.addKeyListener(this);
        p1 = new HumanPaddle(1);
        b1 = new Ball();
        p2 = new AIPaddle(2, b1);
        this.setVisible(true);
        thread = new Thread(this);
        thread.start();

    }
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        if(b1.getX() <-10 || b1.getX() >710){
            g.setColor(Color.red);
            g.drawString("Game over", 350, 250);
        }
        else {
            p1.draw(g);
            b1.draw(g);
            p2.draw(g);
        }
        if(!gameStarted){
            g.setColor(Color.white);
            g.drawString("Tennis", 340, 100);
            g.drawString("Press Enter to Begin", 310, 130);
        }
    }
    public void update(Graphics g){
        paint(g);
    }

    @Override
    public void run() {
        for(;;){
            if(gameStarted) {
                p1.move();
                b1.move();
                p2.move();
                b1.checkPaddleCollision(p1, p2);
            }
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

        }

    }
//NEED TO CHANGE THIS?
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP){
            p1.setRightAccel(true);
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN){
            p1.setLeftAccel(true);
        }
        else if(e.getKeyCode() == KeyEvent.VK_ENTER){
            gameStarted = true;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP){
            p1.setUpAccel(false);
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN){
            p1.setDownAccel(false);
        }

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    public static void main(String[] args) {
        Tennis tennis = new Tennis();
        tennis.setSize(WIDTH,HEIGHT);

    }


}
