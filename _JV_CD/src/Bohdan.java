import javax.swing.*;

public class Bohdan {
    JLabel frame;
    boolean isAlive;
    Bohdan(JLabel frame){
        this.frame=frame;
        isAlive=true;
        JLabel boy = new JLabel(new ImageIcon("images/boyBohdan.png"));
        boy.setBounds(50,300,75,75);
        Thread fallingThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){

                }
            }
        });
        frame.add(boy);
    }
}
