package pkkp;

import javax.swing.*;
import java.awt.*;

public class SplashScreenDemo {
    JFrame frame;
    JLabel image=new JLabel(new ImageIcon("src/img/boy.png"));
    JLabel text=new JLabel("APLIKASI PKKP");
    JLabel text2=new JLabel("Program Pengembangan Kepedulian dan Kepeloporan Pemuda JATENG");
    JLabel text3=new JLabel("Copyright 2022 Widho Faisal - RODYWORKS");
    JProgressBar progressBar=new JProgressBar();
    JLabel message=new JLabel();
    SplashScreenDemo()
    {
        createGUI();
        addImage();
        addText();
        addProgressBar();
        addMessage();
        runningPBar();
    }
    public void createGUI(){
        frame=new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setUndecorated(true);
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new java.awt.Color(250, 234, 72));
        frame.setVisible(true);

    }
    public void addImage(){
        image.setSize(600,200);
        frame.add(image);
    }
    public void addText()
    {
        text.setFont(new Font("arial",Font.BOLD,30));
        text.setBounds(185,220,600,40);
        text.setForeground(Color.BLUE);
        frame.add(text);
        ////////////////////////
        text2.setFont(new Font("arial",Font.ITALIC,12));
        text2.setBounds(100,248,600,40);
        text2.setForeground(Color.BLUE);
        frame.add(text2);
        ////////////////////////
        text3.setFont(new Font("arial",Font.ITALIC,12));
        text3.setBounds(183,348,600,40);
        text3.setForeground(Color.BLACK);
        frame.add(text3);
    }
    public void addMessage()
    {
        message.setBounds(250,320,200,40);
        message.setForeground(Color.black);
        message.setFont(new Font("arial",Font.BOLD,15));
        frame.add(message);
    }
    public void addProgressBar(){
        progressBar.setBounds(100,300,400,30);
        progressBar.setBorderPainted(true);
        progressBar.setStringPainted(true);
        progressBar.setBackground(Color.WHITE);
        progressBar.setForeground(Color.BLACK);
        progressBar.setValue(0);
        frame.add(progressBar);
    }
    public void runningPBar(){
        int i=0;

        while( i<=100)
        {
            try{
                Thread.sleep(30);
                progressBar.setValue(i);
//                message.setText("LOADING "+Integer.toString(i)+"%");
                i++;
                if(i==100)
                    frame.dispose();
            }catch(Exception e){
                e.printStackTrace();
            }



        }
    }
}
