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

public class ComboBoxes2  extends JApplet  {
  private String[] description = { "Sports", "Politics", "Entertaiment",
      "Physics", "Mathematics", "Gadgets", "Technology", "Science" };

  private JTextField t = new JTextField(15);

  private JComboBox c = new JComboBox();

  private JButton b = new JButton("Get more topics");
  private JButton b1 = new JButton("Continue");

  private int count = 0;
  

  public void init() {
	 
    for (int i = 0; i < 4; i++)
      c.addItem(description[count++]);
    t.setEditable(false);
	
	b1.addActionListener(new ActionListener() {
		
      public void actionPerformed(ActionEvent e) {
		  
		  
		  
       
	   
        int n = JOptionPane.showConfirmDialog(null, "Excellent!! Would you like to Continue to Twitter",

                                         "Confirmation", JOptionPane.YES_NO_OPTION);

    if (n == JOptionPane.YES_OPTION) {
		
JOptionPane.showMessageDialog(null , "Connecting to Twitter to gather data............" , " Sentiment Analyser " , JOptionPane.PLAIN_MESSAGE);
try{
//pro1.main(description);
JOptionPane.showMessageDialog(null, "Please run the test.py file first and then try again", "SORRY", JOptionPane.INFORMATION_MESSAGE);


} catch(Exception e1){
	 JOptionPane.showMessageDialog(null, "OOPS SOMETHING WENT WRONG ,PLEASE TRY AGAIN ", "ERROR", JOptionPane.ERROR_MESSAGE);
	
}

               }
 else{

    JOptionPane.showMessageDialog(null, "Please choose your topic once again ", "alert", JOptionPane.INFORMATION_MESSAGE);

    
      }
	  }
    });
	
    b.addActionListener(new ActionListener() {
		
      public void actionPerformed(ActionEvent e) {
        if (count < description.length)
		{
          c.addItem(description[count++]);
	  
	  t.setText("New topics Added");
		}
		else if(count==description.length)
			t.setText("All topics have been added");
      }
    });
	
	
	
	
    c.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        t.setText( "Selected option: "+
             ((JComboBox) e.getSource()).getSelectedItem().toString());
      }
    });
  
    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());
    cp.add(t);
    cp.add(c);
	cp.add(b1);
    cp.add(b);
	
  }
  public static void main(String[] args) {
    run(new ComboBoxes2(), 200, 200);
  }

  public static void run(JApplet applet, int width, int height) {
    JFrame frame = new JFrame();
	
	frame.setIconImage(Toolkit.getDefaultToolkit().getImage("smile.png"));
	
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.getContentPane().add(applet);
    frame.setSize(width, height);
	//frame.add(a);
    applet.init();
    applet.start();
	frame.setTitle("Choose the topic");
    frame.setVisible(true);
  }
  
   

  
} 


       
         
    
  











