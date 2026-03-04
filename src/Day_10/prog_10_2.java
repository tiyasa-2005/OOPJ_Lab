package Day_10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class prog_10_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(250, 400);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Enter First Number:");
        JTextField text1 = new JTextField(15);

        JLabel label2 = new JLabel("Enter Second Number:");
        JTextField text2 = new JTextField(15);

        JLabel labelResult = new JLabel("Result:");
        JTextField textResult = new JTextField(15);
        textResult.setEditable(false);

        JButton addBtn = new JButton("Add");
        JButton subBtn = new JButton("Sub");
        JButton mulBtn = new JButton("Multiply");
        JButton resetBtn = new JButton("Reset");

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Reset Logic
                    if (e.getSource() == resetBtn) {
                        text1.setText("");
                        text2.setText("");
                        textResult.setText("");
                        return;
                    }
                    double n1 = Double.parseDouble(text1.getText());
                    double n2 = Double.parseDouble(text2.getText());
                    double res = 0;

                    if (e.getSource() == addBtn) res = n1 + n2;
                    else if (e.getSource() == subBtn) res = n1 - n2;
                    else if (e.getSource() == mulBtn) res = n1 * n2;

                    textResult.setText(String.valueOf(res));
                } catch (Exception ex) {
                    textResult.setText("Error: Enter Numbers");
                }
            }
        };

        addBtn.addActionListener(listener);
        subBtn.addActionListener(listener);
        mulBtn.addActionListener(listener);
        resetBtn.addActionListener(listener);

        frame.add(label1); frame.add(text1);
        frame.add(label2); frame.add(text2);
        frame.add(labelResult); frame.add(textResult);
        frame.add(addBtn); frame.add(subBtn);
        frame.add(mulBtn); frame.add(resetBtn);

        frame.setVisible(true);
    }
}
