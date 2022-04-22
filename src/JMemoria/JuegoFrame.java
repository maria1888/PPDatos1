package JMemoria;

import java.awt.*;

import javax.swing.JFrame;

/**
 * @author -Maria Alvarez
 * clase JuegoFrame o la ventana del juego donde salen las cartas
 * @version 2021.3.2
 */

public class JuegoFrame extends JFrame {
    public JuegoFrame(){
        Tarjetas tarjetas = new Tarjetas();
        setTitle("Memory Game");
        setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,200,800,600);
        setIconImage(Toolkit.getDefaultToolkit()
                .getImage(JuegoFrame.class
                .getResource("/JMemoria/Imagenes/op2Fondo.jpg")));
        getContentPane().setLayout(new GridLayout(4,tarjetas.length));
    }
}
