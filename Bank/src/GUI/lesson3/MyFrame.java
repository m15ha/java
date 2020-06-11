package GUI.lesson3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MyFrame extends JFrame implements ActionListener {
    private JTextField nameTF;
    private JTextField emailTF;
    private JCheckBox news;

    public MyFrame() {
        super("Моя программа");
        this.setBounds(600, 400, 850, 400);
        this.setDefaultCloseOperation(3);
        this.setLayout(new BorderLayout());
        JPanel top = new JPanel();
        top.setBorder(new EmptyBorder(20, 0, 0, 0));
        JLabel labelTitle = new JLabel("Моя форма");
        labelTitle.setFont(new Font("Arial", 1, 22));
        top.add(labelTitle);
        JPanel form = new JPanel();
        form.setLayout(new GridBagLayout());
        JLabel nameL = new JLabel("Имя: ");
        this.nameTF = new JTextField();
        JLabel emailL = new JLabel("E-mail: ");
        this.emailTF = new JTextField();
        nameL.setHorizontalAlignment(4);
        emailL.setHorizontalAlignment(4);
        this.nameTF.setPreferredSize(new Dimension(200, 40));
        this.emailTF.setPreferredSize(new Dimension(200, 40));
        GridBagConstraints c = new GridBagConstraints();
        c.fill = 1;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(0, 0, 10, 5);
        form.add(nameL, c);
        c.gridx = 1;
        form.add(this.nameTF, c);
        c.gridx = 0;
        c.gridy = 1;
        form.add(emailL, c);
        c.gridx = 1;
        form.add(this.emailTF, c);
        JPanel bottom = new JPanel();
        this.news = new JCheckBox("Подписаться на новости");
        JButton button = new JButton("Отправить");
        button.setPreferredSize(new Dimension(200, 50));
        bottom.add(this.news);
        bottom.add(button, "South");
        bottom.setBorder(new EmptyBorder(0, 0, 20, 0));
        this.add(top, "North");
        this.add(form, "Center");
        this.add(bottom, "South");
        button.addActionListener(this);
        this.news.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Подписаться на новости")) {
            System.out.println("Нажат чекбокс");
        } else if (ae.getActionCommand().equals("Отправить")) {
            System.out.println("Нажата кнопка");
            String name = this.nameTF.getText();
            String email = this.emailTF.getText();
            boolean bNews = this.news.isSelected();

            try {
                User user = new User(name, email, bNews);
                User.add(user);
                User.printAllUsers();
            } catch (UserException var6) {
                if (var6.getCode() == 1) {
                    this.showError("Вы не ввели имя!");
                } else if (var6.getCode() == 2) {
                    this.showError("Вы не ввели e-mail!");
                }
            }
        }

    }

    private void showError(String text) {
        JOptionPane.showMessageDialog(this, text, "Ошибка", 0);
    }
}