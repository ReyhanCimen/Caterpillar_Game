import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputFrame extends JFrame {

    private JTextField inputField;
    private JButton submitButton;

    public InputFrame() {
        setTitle("Integer Input Frame");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

     
        inputField = new JTextField(20);

    
        submitButton = new JButton("Submit");

 
        setLayout(new FlowLayout());

       
        add(inputField);
        add(submitButton);

                submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String inputText = inputField.getText();

                try {
                  
                    int inputValue = Integer.parseInt(inputText);

                    if (inputValue < 0) {
                      
                        JOptionPane.showMessageDialog(InputFrame.this, "Invalid input. Please enter a positive integer.");
                    } else {
                        SetCaterpillar setcaterpillar = new SetCaterpillar();
                        setcaterpillar.setVisible(true);
                        dispose();
                        SetCaterpillar.setInput(inputValue);
                        SetGame.setInte(inputValue);
                    }
                } catch (NumberFormatException ex) {
                   
                    JOptionPane.showMessageDialog(InputFrame.this, "Invalid input. Please enter an integer.");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                InputFrame frame = new InputFrame();
                frame.setVisible(true);
            }
        });
    }
}
