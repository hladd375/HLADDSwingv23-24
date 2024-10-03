import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Hard implements ActionListener {
    private JFrame mainFrame;
    private JPanel topPanel;
    private JPanel bottomPanel;
    private JPanel topLeft;
    private JPanel topRight;
    private JPanel bottomLong;
    private int WIDTH=800;
    private int HEIGHT=700;


    public Hard() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Hard hard = new Hard();
        hard.showEventDemo();
    }

    private void prepareGUI() {


        mainFrame = new JFrame("Henry Ladd Learing SWING");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(2,1));





        topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(1,2));

        topLeft = new JPanel();
        topLeft.setLayout(new GridLayout(3,3));

        topRight = new JPanel();
        topRight.setLayout(new GridLayout(2,1));

        bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());

        bottomLong = new JPanel();
        bottomLong.setLayout(new GridLayout(1,9));



        mainFrame.setVisible(true);





        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

    }

    private void showEventDemo() {




        JButton top1 = new JButton("top1");
        JButton top2 = new JButton("top2");
        JButton top3 = new JButton("top3");
        JButton top4 = new JButton("top4");
        JButton topRig = new JButton("topRight");
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JLabel top0 = new JLabel("top 0", JLabel.CENTER);
        JLabel topRi = new JLabel("topRight", JLabel.CENTER);
        JLabel zero = new JLabel("0", JLabel.CENTER);


        mainFrame.add(topPanel);
        topPanel.add(topLeft);
        topLeft.add(top0);
        topLeft.add(top1);
        topLeft.add(top0);
        topLeft.add(top2);
        topLeft.add(top0);
        topLeft.add(top3);
        topLeft.add(top0);
        topLeft.add(top4);
        topLeft.add(top0);

        topPanel.add(topRight);
        topRight.add(topRi);
        topRight.add(one);


        mainFrame.add(bottomPanel);



        bottomPanel.add(bottomLong, BorderLayout.SOUTH);

        bottomLong.add(zero);
        bottomLong.add(one);
        bottomLong.add(zero);
        bottomLong.add(two);
        bottomLong.add(zero);
        bottomLong.add(three);
        bottomLong.add(zero);
        bottomLong.add(four);
        bottomLong.add(zero);










        mainFrame.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }




}



