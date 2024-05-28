import java.awt.EventQueue;
import javax.swing.JFrame;

public class SetCaterpillar extends JFrame {
    private static int inputvalue;


    public SetCaterpillar() {



        initUI();


    }

    public static void setInput(int inputValue) {
        inputvalue = inputValue;
    }

    private void initUI( ) {



        add(new SetGame());

        SetGame.setInte(inputvalue);


        setResizable(false);
        SetGame.setInte(inputvalue);
        pack();
        SetGame.setInte(inputvalue);

        setTitle("Set Caterpillar");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SetGame.setInte(inputvalue);
    }


    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            JFrame ex = new SetCaterpillar();
            ex.setVisible(true);
        });
    }
}



