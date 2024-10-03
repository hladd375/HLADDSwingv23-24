import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Easy1 implements ActionListener {
    private JFrame mainFrame;
    private int WIDTH=800;
    private int HEIGHT=700;


        public Easy1() {
            prepareGUI();
        }

        public static void main(String[] args) {
            Easy1 easy1 = new Easy1();
            easy1.showEventDemo();
        }

        private void prepareGUI() {


            mainFrame = new JFrame("Henry Ladd Learing SWING");
            mainFrame.setSize(WIDTH, HEIGHT);
            mainFrame.setLayout(new GridLayout(2, 3));





            mainFrame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent) {
                    System.exit(0);
                }
            });

        }

        private void showEventDemo() {

            JButton okButton = new JButton("button1");
            JButton submitButton = new JButton("button2");
            JButton cancelButton = new JButton("button3");
            JButton button4Button = new JButton("button4");
            JButton button5Button = new JButton("button5");


            mainFrame.add(okButton);
            mainFrame.add(submitButton);
            mainFrame.add(cancelButton);
            mainFrame.add(button4Button);
            mainFrame.add(button5Button);


            mainFrame.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }


}
