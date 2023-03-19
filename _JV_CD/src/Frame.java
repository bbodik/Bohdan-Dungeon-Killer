import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

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
        JLabel effects = new JLabel(new ImageIcon("images/effects.gif"));

        background.setBounds(0, 0, 1366, 768);
        start.setBounds(50, 50, 382, 72);
        exid.setBounds(50, 144, 280, 74);
        effects.setBounds(0,0,390,80);
        effects.setVisible(false);

        start.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("1");
            }
        });
        start.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                effects.setLocation(45,45);
                effects.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                effects.setVisible(false);
            }
        });
        exid.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });

        background.add(start);
        background.add(exid);
        background.add(effects);
        add(background);
        repaint();
    }
}

