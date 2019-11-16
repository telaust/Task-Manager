package com.company.Model;

import javax.swing.*;

import static javax.swing.SwingConstants.CENTER;

public final class Frame {

    private final JFrame frame;
    public Frame()
    {
        frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setBounds(500, 500, 500,500);

        JLabel label = new JLabel("label");
        label.setHorizontalAlignment(CENTER);
        label.setSize(400, 100);

//        JCheckBox ch1 = new JCheckBox("goal1");
//        ch1.setBounds(150,100, 100, 50);
//
//        JCheckBox ch2 = new JCheckBox("goal2");
//        ch2.setBounds(150,100, 100, 50);
//
//        JCheckBox ch3 = new JCheckBox("goal3");
//        ch3.setBounds(150,100, 100, 50);

        JCheckBox[] boxes = new JCheckBox[6];

        for (int i = 0; i < 6; i++)
        {
            boxes[i] = new JCheckBox("goal");
            boxes[i].setVisible(true);
            frame.add(boxes[i]);
        }

        frame.add(label);

        frame.setLayout(null);

        frame.getContentPane().setLayout(null);
        frame.setVisible(true);


    }
//
//    public void setBounds(int x, int y, int width, int height)
//    {
//        frame.setBounds();
//    }


}
