package JMemoria;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class WinPanel extends JPanel {
    private static final long serialVersionUID = -8574749493137028299L;
    ImageIcon tarjBack = new ImageIcon(this.getClass().getResource("JMemoria/opFondo.jpg"));
    JButton winner = new JButton();

    public WinPanel(){
        setBorder(new EmptyBorder(0,0,0,0));
        setLayout(new GridLayout(0,1,0,0));
        setBackground(Color.WHITE);

        winner.setIcon(tarjBack);
        add(winner)
    }
}
