package GUI.lesson1;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setBounds(400, 300, 800, 400);
        jframe.setLayout(new BorderLayout());

        JPanel top = new JPanel();
        top.setBorder(new EmptyBorder(20, 0, 0, 0));
        JLabel label = new JLabel("Program");
        label.setFont(new Font("Arial", Font.BOLD, 22));
        top.add(label);


        JPanel form = new JPanel();
        form.setLayout(new GridBagLayout());
        JLabel nameL = new JLabel("Name: ");
        JTextArea nameT = new JTextArea();
        JLabel emailL = new JLabel("Email: ");
        JTextArea emailT = new JTextArea();

        nameL.setHorizontalAlignment(SwingConstants.RIGHT);
        emailL.setHorizontalAlignment(SwingConstants.RIGHT);
        nameT.setPreferredSize(new Dimension(200, 20));
        emailT.setPreferredSize(new Dimension(200, 20));

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(0, 10, 10, 0);
        form.add(nameL, c);
        c.gridx = 1;
        form.add(nameT, c);
        c.gridx = 0;
        c.gridy = 1;
        form.add(emailL, c);
        c.gridx = 1;
        form.add(emailT, c);

        JPanel buttom = new JPanel();
        buttom.setBorder(new EmptyBorder(0, 0, 20, 0));
        JCheckBox check = new JCheckBox("Subscrybe to the news");
        JButton but = new JButton("Send");
        but.setPreferredSize(new Dimension(200, 50));

        buttom.add(check);
        buttom.add(but);

        jframe.add(top, BorderLayout.NORTH);
        jframe.add(form, BorderLayout.CENTER);
        jframe.add(buttom, BorderLayout.SOUTH);
        jframe.setVisible(true);
    }
}
