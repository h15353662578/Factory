package com.hs.GongChang;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Huasheng
 * @Date 2021/05/09/19:28
 * @Description
 */
public class Egbutton implements Button{
    JPanel panel = new JPanel();
    JFrame jFrame = new JFrame();
    JButton jButton;

    public void render(){
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jLabel = new JLabel("Hello Huasheng");
        jLabel.setOpaque(true);
        jLabel.setBackground(new Color(235, 233, 126));
        jLabel.setFont(new Font("factory", Font.BOLD, 44));
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        jFrame.getContentPane().add(panel);
        panel.add(jLabel);
        onClick();
        panel.add(jButton);

        jLabel.setSize(320, 200);
        jFrame.setVisible(true);
        onClick();
    }

    public void onClick(){
        jButton = new JButton("Exit");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false);
                System.exit(0);
            }
        });
    }
}
