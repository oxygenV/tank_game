package com.pazhu.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {

      public TankFrame() {
          setSize(800,600);
          setVisible(true);
          setResizable(false);
          setTitle("tank game");
          addWindowListener(new WindowAdapter() {
              @Override
              public void windowClosing(WindowEvent e) {
                  System.exit(0);
              }
          });
      }

    @Override
    public void paint(Graphics g) {
          g.fillRect(200,200,35,35);
    }

}
