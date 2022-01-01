package com.pazhu.tank;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("all")
public class TankFrame extends Frame {

    int x = 20,y=20;

    public TankFrame() {
      setSize(800,600);
      setVisible(true);
      setResizable(false);
      setTitle("tank game");

      addKeyListener(new MyKeylistener());
      addWindowListener(new WindowAdapter() {
          @Override
          public void windowClosing(WindowEvent e) {
              System.exit(0);
          }
      });
    }

    @Override
    public void paint(Graphics g) {
        System.out.println("paint ... ");
        g.fillRect(x,y,35,35);
         x += 15;
        // y += 15;
    }

    class MyKeylistener extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
//            x += 20;
//            repaint();
            System.out.println("key on");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("key up");
        }
    }

}
