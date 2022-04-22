package JMemoria;

import java.awt.BorderLayout;


public class PanelJuego {

    private static final long serialVersionUID = 9015733702178123438L;

    GridPanel gridPanel;
    WinPanel winPanel;

    PanelJuego(){
        setLayout(new BorderLayout(0,0));
        gridPanel = new GridPanel();
        add(gridPanel,BorderLayout.CENTER);

        winPanel = new WinPanel();
        add(winPanel,BorderLayout.NORTH);
        winPanel.setVisible(false);

    }


}
