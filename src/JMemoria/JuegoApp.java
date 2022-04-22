package JMemoria;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.*;

/**
 * @author Maria Alvarez
 * Memoria Juego
 * @version 2021.3.2
 */

public class JuegoApp extends JFrame {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    JuegoFrame game = new JuegoFrame();
                    game.setVisible(true);
                } catch (Exception e){
                    e.printStackTrace();
                }

            }
        });
    }

}
