import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Frame extends JFrame {
    Frame() {
        super("Dungeon Killer");
        setUndecorated(true);
        setResizable(false);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);

    }

    public void StartMenu() {
        JLabel background = new JLabel(new ImageIcon("images/BackgroundMenu.png"));
        JLabel start = new JLabel(new ImageIcon("images/ButtonStart.png"));
        JLabel exid = new JLabel(new ImageIcon("images/ButtonExid.png"));

        background.setBounds(0, 0, 1366, 768);
        start.setBounds(50, 50, 382, 72);
        exid.setBounds(50, 100, 280, 74);

        start.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });

        add(background);
        add(start);
        add(exid);
        repaint();
    }
}

