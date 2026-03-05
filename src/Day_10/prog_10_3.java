package Day_10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class prog_10_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Changer");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE); // Default color

        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        JList<String> colorList = new JList(colors);
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollPane = new JScrollPane(colorList);

        JButton btn = new JButton("Change Color");

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = colorList.getSelectedValue();

                if (selected != null) {
                    if (selected.equals("Red")) panel.setBackground(Color.RED);
                    else if (selected.equals("Green")) panel.setBackground(Color.GREEN);
                    else if (selected.equals("Blue")) panel.setBackground(Color.BLUE);
                    else if (selected.equals("Yellow")) panel.setBackground(Color.YELLOW);
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Please select a color first!");
                }
            }
        });

        frame.add(scrollPane, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.add(btn, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
