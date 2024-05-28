import java.awt.EventQueue;
import javax.swing.JFrame;

public class RandomCaterpillar extends JFrame {

    public RandomCaterpillar() {

        initUI();
    }

    private void initUI() {

        add(new RandomGame());

        setResizable(false);
        pack();

        setTitle("RandomSnake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            JFrame ex = new RandomCaterpillar();
            ex.setVisible(true);
        });
    }
}
