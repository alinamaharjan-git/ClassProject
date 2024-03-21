

import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class QuizGameDemo extends JFrame implements ActionListener {
    JButton start;
    JButton exit;

    QuizGameDemo(){

        setLayout(null);
        setSize(200,200);
        setVisible(true);

        ImageIcon ii=new ImageIcon("C:\\Users\\HP\\Desktop\\11.jfif");
        JLabel image=new JLabel(ii);
        image.setBounds(0,0,1000,1000);
        add(image);

        JLabel name=new JLabel("Enter your name");
        name.setSize(300,300);
        name.setBounds(1200,200,600,600);
        name.setFont(new Font("Viner Hand ITC",Font.BOLD,35));
        name.setForeground(new Color(30,144,254));
        add(name);

        JTextField jtf=new JTextField();
        jtf.setBounds(1200,550,300,25);
        add(jtf);

        start=new JButton("Start");
        start.setBounds(1200,600,100,100);
        start.addActionListener(this);
        add(start);


        exit=new JButton("Exit");
        exit.setBounds(1350,600,100,100);
        exit.addActionListener(this);
        add(exit);






        }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== start){


        }else if(e.getSource()==exit){

            setVisible(false);

        }

    }

    public static void main(String [] args){

        new QuizGameDemo();
    }




}