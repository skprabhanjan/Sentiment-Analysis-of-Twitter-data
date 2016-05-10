import java.io.File;
import javax.swing.JOptionPane;

import java.io.*;
import java.util.*;

import javax.swing.JFileChooser;

public class JFile {
	static String  path;
	
	static int slength=0;
	static String sentences[]={""};
	//static String array [] =new String[20];
	static String arr[]=new String[20];

  public static String[] main(String[] a) {
	  
	 String filepath= choose();
	 int len=read(filepath);
	 
	 return sentences;

	 
  }
	  public static String choose()
	  {
	  
    JFileChooser fileChooser = new JFileChooser(".");
    int status = fileChooser.showOpenDialog(null);

    if (status == JFileChooser.APPROVE_OPTION) {
      File selectedFile = fileChooser.getSelectedFile();
	  path=fileChooser.getSelectedFile().getAbsolutePath();
	 
    } else if (status == JFileChooser.CANCEL_OPTION) {
     JOptionPane.showMessageDialog(null, "OOPS SOMETHING WENT WRONG ,PLEASE TRY AGAIN ", "ERROR", JOptionPane.ERROR_MESSAGE);
	
    }
	
	return path;
  }
  
  public static int read(String filepath)
  {
	  try {
BufferedReader b = new BufferedReader(new FileReader(filepath));
    StringBuilder str = new StringBuilder();
    String li = b.readLine();

    while (li != null) {
        str.append(li);
        str.append(System.lineSeparator());
        li = b.readLine();
    }
    String read = str.toString();
	 sentences=read.split("\n");
	 slength=sentences.length;
}
catch(Exception p){
	JOptionPane.showMessageDialog(null, "ERROR...PLEASE TRY AGAIN...", "ERROR", JOptionPane.ERROR_MESSAGE);
}


return slength;
  }
  
	  
  


}