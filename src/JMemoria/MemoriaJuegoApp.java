package JMemoria;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 * @author Maria Alvarez
 * Memoria Juego
 * @version 2021.3.2
 */
public class MemoriaJuegoApp extends JFrame {

    private JPanel contePanel;
    private JPanel colum1;
    private JPanel colum4;
    private JPanel colum2;
    private JPanel colum3;
    private JPanel col11;
    private JPanel col13;
    private JPanel col12;
    private JPanel col41;
    private JPanel col43;
    private JPanel col42;
    private JPanel col21;
    private JPanel col23;
    private JPanel col22;
    private JPanel col31;
    private JPanel col32;
    private JPanel col33;

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

    public MemoriaJuegoApp (){
        setIconImage(Toolkit.getDefaultToolkit().getImage(MemoriaJuegoApp.class.getResource('/JMemoria/op2Fondo')));
        setSize(new Dimension(10,10));
        setFont(new Font('A JUGAR',Font.PLAIN,10));
        setTitle('JUEGO DE MEMORIA');
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,450,300);
        contePanel = new JPanel();
        contePanel.setBorder(new EmptyBorder(5,5,5,5));
    }

}
