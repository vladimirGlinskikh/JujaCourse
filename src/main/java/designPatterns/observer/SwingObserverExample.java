package designPatterns.observer;

import javax.swing.*;
import java.awt.*;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");
        button.addActionListener(event ->
                System.out.println("Don't do it, you might regret it!"));
        button.addActionListener(event ->
                System.out.println("Come on, do it!"));

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("слушатель кнопки");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);

        frame.setPreferredSize(new Dimension(200, 100));

        frame.pack();
        frame.setVisible(true);
    }
}
