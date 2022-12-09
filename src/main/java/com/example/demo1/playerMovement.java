package com.example.demo1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class playerMovement {
    public static float moveX = 200;
    public float moveY;
    public double move(){
        while(true){
            KeyListener key = new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {

                }

                @Override
                public void keyPressed(KeyEvent e) {
                    if(e.isActionKey()){
                        moveX = moveX - 20;
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
            };
        }
    }
}
