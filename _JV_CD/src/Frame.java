import javax.swing.*;

public class Frame extends JFrame {
    Frame() {
        super();
        setUndecorated(true);
        setResizable(false);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        System.out.println(this);
    }
}

