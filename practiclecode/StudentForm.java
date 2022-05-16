package practiclecode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentForm {
    JFrame jf;
    JLabel l1,l2,l3,l6,l4,l5,label;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton B1,B2;
    JComboBox c1,c2;

    StudentForm()
    {
        jf=new JFrame("Student Form");
        l1=new JLabel("Student name");
        l1.setBounds(50,50,100,15);
        l2=new JLabel("Student Id");
        l2.setBounds(50,100,100,15);
        l3=new JLabel("sub1");
        l3.setBounds(50,150,100,15);
        l4=new JLabel("sub2");
        l4.setBounds(50,200,100,15);
        l5=new JLabel("sub3");
        l5.setBounds(50,250,100,15);
        l6=new JLabel("sub4");
        l6.setBounds(50,300,100,15);

        t1=new JTextField(20);
        t1.setBounds(200,50,100,30);
        t2=new JTextField(20);
        t2.setBounds(200,100,100,30);
        t3=new JTextField(20);
        t3.setBounds(200,150,100,30);
        t3.setBounds(200,150,100,30);
        t4=new JTextField(20);
        t4.setBounds(200,200,100,30);
        t5=new JTextField(20);
        t5.setBounds(200,250,100,30);
        t6=new JTextField(20);
        t6.setBounds(200,300,100,30);
        t7=new JTextField(20);
        t7.setBounds(200,350,100,30);

        B1 =new JButton("Save");
        B1.setBounds(300,400,100,50);
        B2=new JButton("Close");
        B2.setBounds(400,400,100,50);
        B1.setVisible(true);
        jf.add(l1);
        jf.add(t1);
        jf.add(l2);
        jf.add(t2);
        jf.add(l3);
        jf.add(t3);
        jf.add(l4);
        jf.add(t4);
        jf.add(l5);
        jf.add(t5);
        jf.add(l6);
        jf.add(t6);
        jf.add(B1);
        jf.add(B2);
        jf.add(t7);

        label=new JLabel();
        label.setBounds(200,500,400,50);

        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(600,600);


        jf.setVisible(true);
        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double m,n,o,p,result;
                m=Double.parseDouble(t3.getText());
                n=Double.parseDouble(t4.getText());
                o=Double.parseDouble(t5.getText());
                p=Double.parseDouble(t6.getText());
                result=m+n+o+p;
                String s=String.valueOf(result);

                t7.setText(s);

                JOptionPane.showMessageDialog(jf,"Successfully Calculated ");
                jf.dispose();


            }
        });
        B2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.dispose();
            }
        });


    }

    public static void main(String[] args) {
        new StudentForm();
    }

}