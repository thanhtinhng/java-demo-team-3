package org.example.java_core.lambda;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class LambdaSwingEvent {
    public static void main(String[] args) {
        // Tạo cửa sổ
        JFrame frame = new JFrame("Lambda Event Example");
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo nút
        JButton button = new JButton("Click me!");

        // Thêm sự kiện bằng lambda
        button.addActionListener(e -> System.out.println("Button clicked!"));

        frame.add(button);
        frame.setVisible(true);
    }
}
