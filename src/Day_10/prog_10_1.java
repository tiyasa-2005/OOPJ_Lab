package Day_10;
import javax.swing.*;
import java.awt.*;

public class prog_10_1 {
    public static void main(String[] args){
        JFrame ob=new JFrame("Registration Form");
        ob.setSize(500,600);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setVisible(true);

        JLabel nameLabel = new JLabel("Full Name:");
        nameLabel.setBounds(50, 50, 100, 30);
        ob.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 50, 200, 30);
        ob.add(nameField);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 100, 100, 30);
        ob.add(genderLabel);

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        male.setBounds(150, 100, 70, 30);
        female.setBounds(220, 100, 70, 30);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        ob.add(male);
        ob.add(female);

        JCheckBox termsCheck = new JCheckBox("I accept the terms and conditions.");
        termsCheck.setBounds(150, 200, 250, 30);
        ob.add(termsCheck);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 250, 100, 30);
        ob.add(addressLabel);

        JButton submitButton = new JButton("Register Now");
        submitButton.setBounds(180, 380, 150, 40);
        ob.add(submitButton);
    }
}
