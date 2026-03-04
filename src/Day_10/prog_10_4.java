package Day_10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class prog_10_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RGB Color Picker");
        frame.setSize(300, 400);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel colorPanel = new JPanel();
        colorPanel.setPreferredSize(new Dimension(200, 100));
        colorPanel.setBackground(Color.BLACK);

        JLabel lblRed = new JLabel("Red:");
        JLabel lblGreen = new JLabel("Green:");
        JLabel lblBlue = new JLabel("Blue:");

        JComboBox<Integer> comboRed = new JComboBox<>();
        JComboBox<Integer> comboGreen = new JComboBox<>();
        JComboBox<Integer> comboBlue = new JComboBox<>();

        for (int i = 0; i <= 255; i++) {
            comboRed.addItem(i);
            comboGreen.addItem(i);
            comboBlue.addItem(i);
        }

        JButton btnShow = new JButton("Show Output");

        btnShow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int r = (int) comboRed.getSelectedItem();
                int g = (int) comboGreen.getSelectedItem();
                int b = (int) comboBlue.getSelectedItem();

                Color customColor = new Color(r, g, b);

                colorPanel.setBackground(customColor);
            }
        });

        frame.add(lblRed);
        frame.add(comboRed);
        frame.add(lblGreen);
        frame.add(comboGreen);
        frame.add(lblBlue);
        frame.add(comboBlue);
        frame.add(btnShow);
        frame.add(colorPanel);

        frame.setVisible(true);
    }
}