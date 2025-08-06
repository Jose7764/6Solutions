package view;
import org.w3c.dom.css.RGBColor;

import java.awt.*;
import javax.swing.*;



public class Visual {


    public void telaInicial(){


        JFrame telaJogo = new JFrame("Tela");
        telaJogo.setVisible(true);
        telaJogo.setSize(800 ,600);
        telaJogo.setExtendedState(Frame.MAXIMIZED_BOTH);
        telaJogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaJogo.setLayout(null);

        JPanel panelMain = new JPanel();
        panelMain.setSize(800 ,600);
        panelMain.setBackground(new Color(255, 255, 255));
        panelMain.setVisible(true);
        telaJogo.add(panelMain);
        panelMain.setLayout(null);

        panelMain.setBounds(0,0,1920,1080);

        JPanel panelJogo = new JPanel();
        panelJogo.setSize(800 ,600);
        panelJogo.setBackground(new Color(0, 119, 115));
        panelJogo.setVisible(true);


        panelJogo.setBounds(580,170 , 700, 700);

        panelMain.add(panelJogo);

    }
}
