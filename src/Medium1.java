import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Medium1 implements ActionListener {
    private JFrame mainFrame;
    private JPanel gridPanel;
    private JLabel statusLabel;
    private int WIDTH=800;
    private int HEIGHT=700;


    public Medium1() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Medium1 medium1 = new Medium1();
        medium1.showEventDemo();
    }

    private void prepareGUI() {


        mainFrame = new JFrame("Henry Ladd Learing SWING");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new BorderLayout());





        gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(2,3));


        mainFrame.add(gridPanel);
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
        JLabel lable1 = new JLabel("label1", JLabel.CENTER);
        JLabel lable2 = new JLabel("lable2", JLabel.CENTER);


        mainFrame.add(okButton, BorderLayout.NORTH);
        gridPanel.add(submitButton);
        gridPanel.add(lable1);
        gridPanel.add(cancelButton);
        gridPanel.add(lable2);
        gridPanel.add(button4Button);



        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }




}

