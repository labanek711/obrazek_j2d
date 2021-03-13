package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Surface extends JPanel implements ActionListener {

    private Image logo;

    public Surface() {

        loadImage();
    }

    private void loadImage() {

        logo = new ImageIcon("./images/logo2.png").getImage();
    }

    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
                //dodanie zdjecia
        g2d.drawImage(logo, 0, 0, null);
               //dodanie zdjecia
        //zmiana koloru tla
        setBackground(Color.black);
        //zmiana koloru dla tekstu zeby byl on widoczny
        g2d.setPaint(Color.white);
        // dodanie wielkosci i pogrubienie czcionki oraz dodanie tekstu
        Font life = new Font("Serif", Font.ITALIC, 36);
        Font score = new Font("score", Font.BOLD, 35);
        g2d.setFont(score);
        g2d.drawString("Score: 9999", 680, 820);

        g2d.setFont(life);
        g2d.drawString("Life:", 25, 820);


        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        rh.put(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setRenderingHints(rh);
        //dodajemy wszystkie elementy ktore chcemy miec na żółto oraz zmieniamy kolor
        //w ponizszych linijkach dodalem ciało pac-man'a
        g2d.setPaint(Color.yellow);
        g2d.fillArc(20, 300, 310, 300, 30, 300);



        //life- czyli ile mamy żyć
        g2d.fillArc(95, 800, 25, 25, 30, 300);
        g2d.fillArc(125, 800, 25, 25, 30, 300);


        g2d.setPaint(Color.red.darker());
        g2d.setStroke(new BasicStroke(10));

        //dodanie wisienek

        g2d.fillOval(620, 720, 45, 45);
        g2d.fillOval(650, 730, 45, 45);



        g2d.setPaint(Color.black);
        g2d.setStroke(new BasicStroke(2));
        g2d.drawOval(650, 730, 45, 45);
        //dodanie linijek do wisienek
        g2d.setPaint(Color.green.darker());
        g2d.setStroke(new BasicStroke(2));
        g2d.drawLine(645, 720,685,680);
        g2d.drawLine(675, 730,685,680);

        //tutaj dodajemy oko dla naszego potwora
        g2d.setPaint(Color.black.darker());
        g2d.fillOval(115, 350, 50, 50);

    //duszki
        g2d.setPaint(Color.cyan);
        //cialo duszka niebieskiego
        g2d.fillOval(320, 425, 80, 100);
        //uciecie duszka
        g2d.setPaint(Color.black.darker());
        g2d.fillRect(320, 490, 80, 35);
        g2d.fillRect(335, 475, 14, 20);
        g2d.fillRect(373, 475, 14, 20);
        //galki oczne
        g2d.setPaint(Color.white);
        g2d.fillOval(343, 440, 14, 14);
        g2d.fillOval(373, 440, 14, 14);

        g2d.setPaint(Color.black);
        g2d.drawOval(343, 440, 14, 14);
        g2d.drawOval(373, 440, 14, 14);
        g2d.drawOval(350, 444, 4, 4);
        g2d.drawOval(380, 444, 4, 4);

        //cialo duszka pomaranczowego
        g2d.setPaint(Color.orange);
        g2d.fillOval(440, 425, 80, 100);
        //uciecie duszka
        g2d.setPaint(Color.black.darker());
        g2d.fillRect(440, 490, 80, 35);
        g2d.fillRect(455, 475, 14, 20);
        g2d.fillRect(493, 475, 14, 20);
        //galki oczne
        g2d.setPaint(Color.white);
        g2d.fillOval(463, 440, 14, 14);
        g2d.fillOval(493, 440, 14, 14);

        g2d.setPaint(Color.black);
        g2d.drawOval(463, 440, 14, 14);
        g2d.drawOval(493, 440, 14, 14);
        g2d.drawOval(470, 444, 4, 4);
        g2d.drawOval(500, 444, 4, 4);

    //cialo duszka czerwonego
        g2d.setPaint(Color.red);
        g2d.fillOval(560, 425, 80, 100);
        //uciecie duszka
        g2d.setPaint(Color.black.darker());
        g2d.fillRect(560, 490, 80, 35);
        g2d.fillRect(575, 475, 14, 20);
        g2d.fillRect(613, 475, 14, 20);
        //galki oczne
        g2d.setPaint(Color.white);
        g2d.fillOval(583, 440, 14, 14);
        g2d.fillOval(613, 440, 14, 14);

        g2d.setPaint(Color.black);
        g2d.drawOval(583, 440, 14, 14);
        g2d.drawOval(613, 440, 14, 14);
        g2d.drawOval(590, 444, 4, 4);
        g2d.drawOval(620, 444, 4, 4);

        //cialo duszka rozowego
        g2d.setPaint(Color.pink);
        g2d.fillOval(680, 425, 80, 100);
        //uciecie duszka
        g2d.setPaint(Color.black.darker());
        g2d.fillRect(680, 490, 80, 35);
        g2d.fillRect(695, 475, 14, 20);
        g2d.fillRect(733, 475, 14, 20);
        //galki oczne
        g2d.setPaint(Color.white);
        g2d.fillOval(703, 440, 14, 14);
        g2d.fillOval(733, 440, 14, 14);

        g2d.setPaint(Color.black);
        g2d.drawOval(703, 440, 14, 14);
        g2d.drawOval(733, 440, 14, 14);
        g2d.drawOval(710, 443, 4, 4);
        g2d.drawOval(740, 443, 4, 4);


        //dodanie pomaranczy
        g2d.setPaint(Color.orange);
        g2d.fillOval(350,640,80,80);
        Color customcolor= new Color(139,69,19);


        g2d.setPaint(customcolor);
        g2d.setStroke(new BasicStroke(3));
        g2d.fillOval(365,646,13,16);
        g2d.drawLine(370, 650,365,630);
        //g2d.drawLine();
    }


    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}

class PacMan extends JFrame {

    public PacMan() {

        initUI();
    }

    private void initUI() {

        final Surface surface = new Surface();
        add(surface);


        setTitle("Pac-Man");
        setSize(900, 900);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {


        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                PacMan ex = new PacMan();
                ex.setVisible(true);
                new Muzyka();
                Muzyka.Muza();
            }
        });
    }


}
