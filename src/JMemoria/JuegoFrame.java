package JMemoria;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * @author -Maria Alvarez
 * clase JuegoFrame o la ventana del juego donde salen las cartas
 * @version 2021.3.2
 */

public class JuegoFrame extends JFrame {
    public JuegoFrame(){
        setTitle("Memory Game");
        setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,200,1200,600);
        setIconImage(Toolkit.getDefaultToolkit()
                .getImage(JuegoFrame.class
                .getResource("/JMemoria/opFondo.png")));
    }
}
