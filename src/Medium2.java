import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Medium2 implements ActionListener {
    private JFrame mainFrame;
    private JPanel borderPanel;
    private int WIDTH=800;
    private int HEIGHT=700;


    public Medium2() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Medium2 medium2 = new Medium2();
        medium2.showEventDemo();
    }

    private void prepareGUI() {


        mainFrame = new JFrame("Henry Ladd Learing SWING");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(3,3));





        borderPanel = new JPanel();
        borderPanel.setLayout(new BorderLayout());


        mainFrame.setVisible(true);





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
        JButton button6Button = new JButton("button4");
        JButton button7Button = new JButton("button5");
        JButton button8Button = new JButton("button4");
        JButton button9Button = new JButton("button5");
        JLabel lable1 = new JLabel("label1", JLabel.CENTER);



        mainFrame.add(okButton);
        mainFrame.add(submitButton);
        mainFrame.add(cancelButton);
        mainFrame.add(button4Button);
        mainFrame.add(borderPanel);
        mainFrame.add(button5Button);
        mainFrame.add(button6Button);
        mainFrame.add(button7Button);



        borderPanel.add(button8Button, BorderLayout.SOUTH);
        borderPanel.add(button9Button, BorderLayout.EAST);
        borderPanel.add(lable1, BorderLayout.WEST);






        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }




}



