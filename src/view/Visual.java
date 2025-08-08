package view;
import org.w3c.dom.css.RGBColor;

import java.awt.*;
import javax.swing.*;
import service.logica;



public class Visual {

    logica service = new logica();

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

        JButton reiniciar = new JButton("Reiniciar");
        reiniciar.setBackground(new Color(0, 119, 115));
        reiniciar.setVisible(true);
        reiniciar.setLayout(null);
        reiniciar.setBounds(1330,60 , 140, 140);

        JPanel panelSoma1 = new JPanel();
        panelSoma1.setBackground(new Color(0, 119, 115));
        panelSoma1.setVisible(true);
        panelSoma1.setLayout(null);
        panelSoma1.setBounds(580,60 , 700, 140);

        JPanel r1 = new JPanel();
        r1.setLayout(null);
        r1.setBackground(new Color(236, 236, 236));
        r1.setBounds(21, 20, 205, 100);

        String resp1 = service.resposta1();
        String resp2 = service.resposta2();
        String resp3 = service.resposta3();
        String resp4 = service.resposta4();
        String resp5 = service.resposta5();
        String resp6 = service.resposta6();


        JLabel resposta1 = new JLabel();
        resposta1.setText(resp1);
        resposta1.setFont(new Font("Arial", Font.PLAIN, 50));
        resposta1.setBounds(72,12,1100,80);
        r1.add(resposta1);


        JPanel r2 = new JPanel();
        r2.setLayout(null);
        r2.setBackground(new Color(236, 236, 236));
        r2.setBounds(247,20 , 205, 100);

        Label resposta2 = new Label();
        resposta2.setText(resp2);
        resposta2.setFont(new Font("Arial", Font.PLAIN, 50));
        resposta2.setBounds(72,12,1100,80);
        r2.add(resposta2);

        JPanel r3 = new JPanel();
        r3.setLayout(null);
        r3.setBackground(new Color(236, 236, 236));
        r3.setBounds(473,20 , 205, 100);

        Label resposta3 = new Label("bh");
        resposta3.setText(resp3);
        resposta3.setFont(new Font("Arial", Font.PLAIN, 50));
        resposta3.setBounds(72,12,1100,80);
        r3.add(resposta3);

        panelSoma1.add(r1);
        panelSoma1.add(r2);
        panelSoma1.add(r3);

        JPanel panelSoma2 = new JPanel();
        panelSoma2.setBackground(new Color(0, 119, 115));
        panelSoma2.setVisible(true);
        panelSoma2.setLayout(null);
        panelSoma2.setBounds(1330,240 , 140, 700);

        JPanel r4 = new JPanel();
        r4.setLayout(null);
        r4.setBackground(new Color(236, 236, 236));
        r4.setBounds(20,21 , 100, 205);

        JLabel resposta4 = new JLabel();
        resposta1.setText(resp4);
        resposta4.setFont(new Font("Arial", Font.PLAIN, 50));
        resposta4.setBounds(22,65,1100,80);
        r4.add(resposta4);

        JPanel r5 = new JPanel();
        r5.setLayout(null);
        r5.setBackground(new Color(236, 236, 236));
        r5.setBounds(20,247 , 100, 205);

        Label resposta5 = new Label();
        resposta5.setText(resp5);
        resposta5.setFont(new Font("Arial", Font.PLAIN, 50));
        resposta5.setBounds(22,65,1100,80);
        r5.add(resposta5);

        JPanel r6 = new JPanel();
        r6.setLayout(null);
        r6.setBackground(new Color(236, 236, 236));
        r6.setBounds(20,473 , 100, 205);

        Label resposta6 = new Label();
        resposta6.setText(resp6);
        resposta6.setFont(new Font("Arial", Font.PLAIN, 50));
        resposta6.setBounds(22,65,1100,80);
        r6.add(resposta6);

        panelSoma2.add(r4);
        panelSoma2.add(r5);
        panelSoma2.add(r6);

        JPanel panelJogo = new JPanel();
        panelJogo.setSize(800 ,600);
        panelJogo.setBackground(new Color(0, 119, 115));
        panelJogo.setVisible(true);
        panelJogo.setLayout(null);
        panelJogo.setBounds(580,240 , 700, 700);

        panelMain.add(panelJogo);
        panelMain.add(panelSoma1);
        panelMain.add(panelSoma2);

        JPanel b1 = new JPanel();
        b1.setLayout(null);
        b1.setBackground(new Color(236, 236, 236));
        b1.setBounds(21,21 , 205, 205);

        JPanel b2 = new JPanel();
        b2.setLayout(null);
        b2.setBackground(new Color(236, 236, 236));
        b2.setBounds(247,21 , 205, 205);

        JPanel b3 = new JPanel();
        b3.setLayout(null);
        b3.setBackground(new Color(236, 236, 236));
        b3.setBounds(473,21 , 205, 205);

        JPanel b4 = new JPanel();
        b4.setLayout(null);
        b4.setBackground(new Color(236, 236, 236));
        b4.setBounds(21,247 , 205, 205);

        JPanel b5 = new JPanel();
        b5.setLayout(null);
        b5.setBackground(new Color(236, 236, 236));
        b5.setBounds(247,247 , 205, 205);

        JPanel b6 = new JPanel();
        b6.setLayout(null);
        b6.setBackground(new Color(236, 236, 236));
        b6.setBounds(473,247 , 205, 205);

        JPanel b7 = new JPanel();
        b7.setLayout(null);
        b7.setBackground(new Color(236, 236, 236));
        b7.setBounds(21,473 , 205, 205);

        JPanel b8 = new JPanel();
        b8.setLayout(null);
        b8.setBackground(new Color(236, 236, 236));
        b8.setBounds(247,473 , 205, 205);

        JPanel b9 = new JPanel();
        b9.setLayout(null);
        b9.setBackground(new Color(236, 236, 236));
        b9.setBounds(473,473 , 205, 205);

        panelJogo.add(b1);
        panelJogo.add(b2);
        panelJogo.add(b3);
        panelJogo.add(b4);
        panelJogo.add(b5);
        panelJogo.add(b6);
        panelJogo.add(b7);
        panelJogo.add(b8);
        panelJogo.add(b9);


        JTextField b1Input = new JTextField(2)
                , b2Input = new JTextField(2)
                , b3Input = new JTextField(2)
                , b4Input = new JTextField(2)
                , b5Input = new JTextField(2)
                , b6Input = new JTextField(2)
                , b7Input = new JTextField(2)
                , b8Input = new JTextField(2)
                , b9Input = new JTextField(2);

        b1Input.setBounds(64,70 ,100,75);
        b1Input.setFont(new Font("Arial", Font.PLAIN, 75));
        b1Input.setOpaque(false);
        b1Input.setBorder(null);

        b2Input.setBounds(64,70 ,100,75);
        b2Input.setFont(new Font("Arial", Font.PLAIN, 75));
        b2Input.setOpaque(false);
        b2Input.setBorder(null);

        b3Input.setBounds(64,70 ,100,75);
        b3Input.setFont(new Font("Arial", Font.PLAIN, 75));
        b3Input.setOpaque(false);
        b3Input.setBorder(null);

        b4Input.setBounds(64,70 ,100,75);
        b4Input.setFont(new Font("Arial", Font.PLAIN, 75));
        b4Input.setOpaque(false);
        b4Input.setBorder(null);

        b5Input.setBounds(64,70 ,100,75);
        b5Input.setFont(new Font("Arial", Font.PLAIN, 75));
        b5Input.setOpaque(false);
        b5Input.setBorder(null);

        b6Input.setBounds(64,70 ,100,75);
        b6Input.setFont(new Font("Arial", Font.PLAIN, 75));
        b6Input.setOpaque(false);
        b6Input.setBorder(null);

        b7Input.setBounds(64,70 ,100,75);
        b7Input.setFont(new Font("Arial", Font.PLAIN, 75));
        b7Input.setOpaque(false);
        b7Input.setBorder(null);

        b8Input.setBounds(64,70 ,100,75);
        b8Input.setFont(new Font("Arial", Font.PLAIN, 75));
        b8Input.setOpaque(false);
        b8Input.setBorder(null);

        b9Input.setBounds(64,70 ,100,75);
        b9Input.setFont(new Font("Arial", Font.PLAIN, 75));
        b9Input.setOpaque(false);
        b9Input.setBorder(null);


        b1.add(b1Input);
        b2.add(b2Input);
        b3.add(b3Input);
        b4.add(b4Input);
        b5.add(b5Input);
        b6.add(b6Input);
        b7.add(b7Input);
        b8.add(b8Input);
        b9.add(b9Input);


        
        
    }


}
