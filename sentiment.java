import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.*;

import javax.swing.JOptionPane;
import java.util.*;
import java.io.*;
import java.awt.Toolkit;
import java.awt.*;
import java.awt.Color;

public class sentiment  extends JApplet  {
	
  private String[] description = { "A statement","A file","Twitter data"};

  private JTextField t = new JTextField(15);

  private JComboBox c = new JComboBox();

  //private JButton b = new JButton("Get more topics");
  private JButton b1 = new JButton("Next");

  private int count = 0;
  boolean firstime=true;
  

  public void init() {
	 
    for (int i = 0; i < 3; i++)
      c.addItem(description[count++]);
    t.setEditable(false);
	
	b1.addActionListener(new ActionListener() {
		
      public void actionPerformed(ActionEvent e) {
		  
		  
		
	   
        int n = JOptionPane.showConfirmDialog(null, "Are you sure you want to continue",

                                         "Confirmation", JOptionPane.YES_NO_OPTION);

    if (n == JOptionPane.YES_OPTION) {
		try{
			if(firstime==true)
			{
JOptionPane.showMessageDialog(null , "Welcome to the sentiment Analyser" , " Sentiment Analyser " , JOptionPane.PLAIN_MESSAGE);
firstime=false;
			}
int v=c.getSelectedIndex();
		  if(v==0 )
		  {    try{
			  pro1.main(description);
		  }catch(Exception e2)
		  {
			  JOptionPane.showMessageDialog(null, "OOPS SOMETHING WENT WRONG ,PLEASE TRY AGAIN ", "ERROR", JOptionPane.ERROR_MESSAGE);
		  }
		  }
		  else if(v==1)
		  {
			 filetest2.main(description);
		  }
			  
		  
		  

			  
		  
		  
		  

		
		else if(v==2 )
			  ComboBoxes2.main(description);
		  else
			  JOptionPane.showMessageDialog(null, "OOPS SOMETHING WENT WRONG ,PLEASE TRY AGAIN ", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e1){
			JOptionPane.showMessageDialog(null, "OOPS SOMETHING WENT WRONG ,PLEASE TRY AGAIN ", "ERROR", JOptionPane.ERROR_MESSAGE);
	
			
		}
	}

 else{

    JOptionPane.showMessageDialog(null, "Please choose your topic once again ", "alert", JOptionPane.INFORMATION_MESSAGE);

    
      }
	  }
    });
	
   
	
	
    c.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
		  
 
		  
        t.setText( "Selected option:  "+
             ((JComboBox) e.getSource()).getSelectedItem().toString());
      }
    });
  
    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());
    cp.add(t);
    cp.add(c);
	cp.add(b1);
   // cp.add(b);
	}
	
  
  public static void main(String[] args) {
    run(new sentiment(), 200, 200);
  }

  public static void run(JApplet applet, int width, int height) {
    JFrame frame = new JFrame();
	
	frame.setIconImage(Toolkit.getDefaultToolkit().getImage("smile.png"));
	
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(applet);
    frame.setSize(width, height);
	
	//frame.add(a);
	//frame.setOpaque(true);
    applet.init();
    applet.start();
	frame.setTitle("Select the topic");
    frame.setVisible(true);
	frame.getContentPane().setBackground(Color.red);
  }
  
   

  
} 


       
         
    
  











