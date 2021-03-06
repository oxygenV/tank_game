package com.pazhu.tank;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("all")
public class TankFrame extends Frame {

    int x = 20, y = 20, length = 10;

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
    }

    class MyKeylistener extends KeyAdapter{
        Boolean BL = false;
        Boolean BR = false;
        Boolean BU = false;
        Boolean BD = false;
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()){
                case KeyEvent.VK_LEFT:
                    BL = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    BR = true;
                    break;
                case KeyEvent.VK_UP:
                    BU = true;
                    break;
                case KeyEvent.VK_DOWN:
                    BD = true;
                    break;
            }
            System.out.println("key on");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            switch (e.getKeyCode()){
                case KeyEvent.VK_LEFT:
                    BL = false;
                    break;
                case KeyEvent.VK_RIGHT:
                    BR = false;
                    break;
                case KeyEvent.VK_UP:
                    BU = false;
                    break;
                case KeyEvent.VK_DOWN:
                    BD = false;
                    break;
            }
            System.out.println("key up");
        }

    }

}
