import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame extends JFrame {

    private JButton ClassicMode;
    private JButton SetMode;
    private JButton RandomMode;
    private JLabel label;

    public ButtonFrame() {
        setTitle("Button Frame");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        setLocationRelativeTo(null);

        
        ClassicMode = new JButton("Classic Mode");
        SetMode = new JButton("Set Mode");
        RandomMode = new JButton("Random Mode");

       
        label = new JLabel("Choose Your Mode");

       
        setLayout(new FlowLayout());
        
        label.setForeground(Color.magenta);

        ClassicMode.setBackground(Color.BLACK);
        ClassicMode.setForeground(Color.GREEN);
        
        SetMode.setBackground(Color.BLACK);
        SetMode.setForeground(Color.CYAN);
        
        RandomMode.setBackground(Color.BLACK);
        RandomMode.setForeground(Color.GREEN);
        
        getContentPane().setBackground(Color.BLACK);

       
        add(ClassicMode);
        add(SetMode);
        add(RandomMode);
        add(label);
        


      
        ClassicMode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame ex = new ClassicCaterpillar();
                ex.setVisible(true);
                dispose();
            }
        });

        RandomMode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame ex = new RandomCaterpillar();
                ex.setVisible(true);
                dispose();
            }
        });

        SetMode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	            	
                InputFrame inputFrame = new InputFrame();
                inputFrame.setVisible(true);
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ButtonFrame frame = new ButtonFrame();
                frame.setVisible(true);
            }
        }
        );
    }
}

