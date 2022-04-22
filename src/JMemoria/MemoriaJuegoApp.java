package JMemoria;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 * @author Maria Alvarez
 * Memoria Juego
 * @version 2021.3.2
 */
public class MemoriaJuegoApp extends JFrame {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    JuegoFrame game = new JuegoFrame();
                    game.setVisible(True);
                } catch (Exception e){
                    e.printStackTrace();
                }

            }
        });
    }
}
