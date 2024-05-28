import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class LunaMoth extends JPanel {

    private final int SCREEN_WIDTH = 300;
    private final int SCREEN_HEIGHT = 300;
    private Image background1;
    private Image background2;
    private boolean isBackground1Visible;
    private JLabel label;

    public LunaMoth() {
        background1 = new ImageIcon("img/background.png").getImage();
        background2 = new ImageIcon("img/background2.png").getImage();
        isBackground1Visible = true;

        Timer timer = new Timer(300, e -> {
            isBackground1Visible = !isBackground1Visible;
            repaint();
        });
        timer.start();

        label = new JLabel("Congratulations, You won");
        label.setForeground(Color.WHITE);
        int labelWidth = 120;
        int labelHeight = 20;
        int labelX = (SCREEN_WIDTH - labelWidth) / 2;
        int labelY = 10;
        label.setBounds(labelX, labelY, labelWidth, labelHeight);
        add(label);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (isBackground1Visible) {
            g.drawImage(background1, 0, 0, getWidth(), getHeight(), null);
        } else {
            g.drawImage(background2, 0, 0, getWidth(), getHeight(), null);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT);
    }

    public void startAnimation() {
  
    }
}
