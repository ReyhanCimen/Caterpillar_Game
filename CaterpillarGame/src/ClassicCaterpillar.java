import java.awt.EventQueue;
import javax.swing.JFrame;

public class ClassicCaterpillar extends JFrame {

    public ClassicCaterpillar() {

        initUI();
    }

    private void initUI() {

        add(new ClassicGame());

        setResizable(false);
        pack();

        setTitle("Classic Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            JFrame ex = new ClassicCaterpillar();
            ex.setVisible(true);
        });
        
        
    }
}
