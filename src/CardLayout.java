import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayout implements ActionListener {
    private JFrame mainFrame;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta;
    private JPanel topPanel;
    private JPanel bottomPanel;
    private JPanel topLeft;
    private JPanel topRight;
    private JPanel bottomLong;
    private int WIDTH=800;
    private int HEIGHT=700;


    public CardLayout() {
        prepareGUI();
    }

    public static void main(String[] args) {
        CardLayout cardLayout = new CardLayout();
        cardLayout.showEventDemo();
    }

    private void prepareGUI() {


        mainFrame = new JFrame("Henry Ladd Learing SWING");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new java.awt.CardLayout());



        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        mb.add(file);
        mb.add(edit);
        mb.add(help);
        //end menu at top

        ta = new JTextArea();
        ta.setBounds(50, 5, WIDTH-100, HEIGHT-50);
        mainFrame.add(mb);  //add menu bar
        mainFrame.setJMenuBar(mb); //set menu bar



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
        JLabel top01 = new JLabel("top 0", JLabel.CENTER);
        JLabel top02 = new JLabel("top 0", JLabel.CENTER);
        JLabel top03 = new JLabel("top 0", JLabel.CENTER);
        JLabel top04 = new JLabel("top 0", JLabel.CENTER);
        JLabel top05 = new JLabel("top 0", JLabel.CENTER);


        JButton topRig = new JButton("topRight");
        JButton one1 = new JButton("1");
        JButton one2 = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");

        JLabel topRi = new JLabel("topRight", JLabel.CENTER);
        JLabel zero = new JLabel("0", JLabel.CENTER);
        JLabel zero1 = new JLabel("0", JLabel.CENTER);
        JLabel zero2 = new JLabel("0", JLabel.CENTER);
        JLabel zero3 = new JLabel("0", JLabel.CENTER);
        JLabel zero4 = new JLabel("0", JLabel.CENTER);
        JLabel zero5 = new JLabel("0", JLabel.CENTER);


        mainFrame.add(topPanel);
        topPanel.add(topLeft);
        topLeft.add(top01);
        topLeft.add(top1);
        topLeft.add(top02);
        topLeft.add(top2);
        topLeft.add(top03);
        topLeft.add(top3);
        topLeft.add(top04);
        topLeft.add(top4);
        topLeft.add(top05);

        topPanel.add(topRight);
        topRight.add(topRi);
        topRight.add(one1);


        mainFrame.add(bottomPanel);



        bottomPanel.add(bottomLong, BorderLayout.SOUTH);
        bottomPanel.add(ta, BorderLayout.CENTER);

        bottomLong.add(zero);
        bottomLong.add(one2);
        bottomLong.add(zero1);
        bottomLong.add(two);
        bottomLong.add(zero2);
        bottomLong.add(three);
        bottomLong.add(zero3);
        bottomLong.add(four);
        bottomLong.add(zero4);










        mainFrame.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut)
            ta.cut();
        if (e.getSource() == paste)
            ta.paste();
        if (e.getSource() == copy)
            ta.copy();
        if (e.getSource() == selectAll)
            ta.selectAll();
    }




}




