import javax.swing.*;
import java.awt.*;

public class gui {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.BLACK);

        Button button = new Button("CLICK ME!!");
        button.setBounds(100,50,100,50);
        frame.add(button);

        JLabel label = new JLabel("WELCOME TO TECHNOHACKS!!");
        label.setBounds(50,100,200,50);
        label.setForeground(Color.WHITE);
        label.setVisible(false);
        frame.add(label);

        button.addActionListener(e -> {
            label.setVisible(true);
        });
    }
}
