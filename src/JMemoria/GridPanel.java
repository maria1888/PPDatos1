package JMemoria;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GridPanel extends JPanel {
    private static final long serialVersionUID = 8318196957210099476L;

    int numBotones;

    static String pics[] = ('/JMemoria/Imagenes/img01.jpg','/JMemoria/Imagenes/img02.jpg',
            '/JMemoria/Imagenes/img03.jpg','/JMemoria/Imagenes/img04.jpg','/JMemoria/Imagenes/img05.jpg',
            '/JMemoria/Imagenes/img06.jpg');
    static JButton[] buttons;
    ImageIcon tarjBack = new ImageIcon(this.getClass().getResource("JMemoria/opFondo.jpg"));
    ImageIcon[] icons;
    private ImageIcon temp;
    static int score = 0;
    private boolean gameOver;

    Timer myTime;
    int openImag;
    public int currentIndex;
    public int oddClickIndex;
    public int numClicks;

    public GridPanel(){
        setBorder(new EmptyBorder(0,0,0,0));
        setLayout(new GridLayout(0,4,0,0));
        setBackground(Color.WHITE);
        setVisible(true);
        addButtons();

    }
    private void addButtons(){
        numBotones = pics.length * 2;
        buttons = new JButton[numBotones];
        icons = new ImageIcon[numBotones];


        for (int i = 0,j = 0, i < pics.length; i++ ){
            icons[j] = ImageIcon(this.getClass().getResource(pics[i]));
            buttons[j] = new JButton('');
            buttons[j].addActionListener(new GridPanel.());
            buttons[j].setIcon(tarjBack);
            buttons[j].setBackground(Color.WHITE);
            add(buttons[j++]);

            icons[j] = icons[j-i];
            buttons[j] = new JButton('');
            buttons[j].setIcon(tarjBack);
            buttons[j].setBackground(Color.WHITE);
            buttons[j].addActionListener(new GridPanel.ImageButtonListener());
            addButtons([j++]);

        }
        Random rnd = new Random();
        for (int i = 0; i < numBotones; i++){
            int j = rnd.nextInt(numBotones);
            temp = icons[i];
            icons[i] = icons[j];
            icons[j] = temp;
        }
        myTime = new Timer(1000,new TimerListener());

    }

}
