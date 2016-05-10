

import javax.swing.JOptionPane;
import java.util.*;
import java.io.*;
import java.util.*;
public  class filetest2
{
public static void main(String[] args) throws IOException
{ 

//System.out.println("Enter the statement");
String [] some={""};
String tempinput[]=JFile.main(some);
int z []=new int[20];
double cnt=0.0;
double percentage=0.0;
//Scanner sn=new Scanner(System.in);
//String input=sn.nextLine();
//System.out.println(input);
//texting t=new texting();
//String input=t.map();
//System.out.println(input);
for(int u=0;u<tempinput.length;u++)
{
int [] e =new int[10];
int [] n=new int[10];
double [] value=new double[10];
int flag=0;

int len=1;
double pvalue=0;
double nvalue=0;
int special=0;
String input=tempinput[u].trim();


String [] arr=input.split(" ");
int length=arr.length;

//System.out.println(arr[1]);
BufferedReader br=null;
BufferedReader br1=null;
BufferedReader br2=null;
int i=0;
int i1=0;
int i2=0;

do
{


try {
br = new BufferedReader(new FileReader("positive-words.txt"));
    StringBuilder sb = new StringBuilder();
    String line = br.readLine();

    while (line != null) {
        sb.append(line);
        sb.append(System.lineSeparator());
        line = br.readLine();
    }
    String read = sb.toString();
	String [] senti=read.split("\n");
	//JOptionPane.showMessageDialog(null, arr[0], "ERROR", JOptionPane.ERROR_MESSAGE);
	//JOptionPane.showMessageDialog(null, arr[0], "ERROR", JOptionPane.ERROR_MESSAGE);
	//JOptionPane.showMessageDialog(null, senti[0], "ERROR", JOptionPane.ERROR_MESSAGE);
	
	
	
	for(;i<arr.length;i++)
	{
		for(int j=0;j<senti.length;j++)
		{  
			if(arr[i].equals(senti[j].trim()))
			{
				e[i]=1; 
				//JOptionPane.showMessageDialog(null, "Sorry Something went wrong,please try again", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
}
catch(Exception e1)
{
	flag=1;
	JOptionPane.showMessageDialog(null, "Sorry Something went wrong,please try again", "ERROR", JOptionPane.ERROR_MESSAGE);
	//System.out.println(e1);
}
	
try
{
br1 = new BufferedReader(new FileReader("negative-words.txt"));




    StringBuilder sb1 = new StringBuilder();
    String line1 = br1.readLine();

    while (line1 != null) {
        sb1.append(line1);
        sb1.append(System.lineSeparator());
        line1 = br1.readLine();
    }
    String read1 = sb1.toString();
	String [] senti1=read1.split("\n");
	for(;i1<arr.length;i1++)
	{
		for(int j=0;j<senti1.length;j++)
		{
			if(arr[i1].equals(senti1[j].trim()))
			{
				e[i1]=1; 
				n[i1]=1;
			}
		}
	}
}
	

	
	catch(Exception e2)
	{ 
	 flag=1;
	JOptionPane.showMessageDialog(null, "Sorry Something went wrong,please try again", "ERROR", JOptionPane.ERROR_MESSAGE);
	//System.out.println(e2);
	}
	
try
{
br2 = new BufferedReader(new FileReader("negation-words.txt"));




    StringBuilder sb2 = new StringBuilder();
    String line2 = br2.readLine();

    while (line2 != null) {
        sb2.append(line2);
        sb2.append(System.lineSeparator());
        line2 = br2.readLine();
    }
    String read2 = sb2.toString();
	String [] senti2=read2.split("\n");
	for(;i2<arr.length;i2++)
	{
		for(int j=0;j<senti2.length;j++)
		{
			if(arr[i2].equals(senti2[j].trim()))
			{
				special++;
			}
		}
	}
}
	

	
	catch(Exception e3)
	{ 
	 flag=1;
	 JOptionPane.showMessageDialog(null, "Sorry Something went wrong,please try again", "ERROR", JOptionPane.ERROR_MESSAGE);
	//System.out.println(e2);
	  
	}	
	
	
	
	finally {
	 
	
	 if(br!=null && br1!=null)
	 {
		 br.close();
         br1.close();
	 }
}
   
	
	
	

	
	len++;
	
	
}
while(len==length);
if(flag==0)
	{
		for(int k=0;k<10;k++)
		{
	      value[k]=(Math.pow(-1,n[k]))*e[k];
//System.out.println(value[k]);
	    }
	}
	
	if(flag==0)
	{
	
	for(int p=0;p<10;p++)
	{
		 if(value[p]<0)
			 nvalue++;
		 else if(value[p]>0)
			 pvalue=1;
	}
	}
	//System.out.println(special);
	//System.out.println(pvalue);
if(flag==0)
	{
		//System.out.println(special +" "+pvalue+" "+nvalue);
		if(special==1 && pvalue==1)
		{  
			//System.out.println("Negative statment");
			//JOptionPane.showMessageDialog(null, "The statement has negative sentiment", "Result", JOptionPane.INFORMATION_MESSAGE);
			z[u]=-1;
			ref(z,tempinput);
			
		}
		if(special==1 && nvalue==0 && pvalue==0)
			z[u]=0;
		else if(((special==1 && nvalue==1)) || (pvalue==1 && (nvalue==0)|| nvalue==2))
			z[u]=1;
		else if(((special==1) && (pvalue==1||nvalue==2)) || (nvalue==1) && pvalue==0)
			z[u]=-1;
	else
z[u]=0;

	
	}
}
double length=tempinput.length;
//System.out.println(length);

for(int t=0;t<length;t++)
{
	if(z[t]==1)
		cnt++;
}

//System.out.println(cnt);
	percentage=(cnt/length)*100;
	
	
	//System.out.println("The file has "+percentage+" % positivity");
	JOptionPane.showMessageDialog(null,    "             The file has "+percentage+" % positivity  ", "RESULT", JOptionPane.PLAIN_MESSAGE);
}

public static void ref(int [] z,String [] tempinput)
{
	double percentage=0.0;
	double length=tempinput.length;
	double cnt=0;
//System.out.println(length);

for(int t=0;t<length;t++)
{
	if(z[t]==1)
		cnt++;
}

//System.out.println(cnt);
	percentage=(cnt/length)*100;
	JOptionPane.showMessageDialog(null,    "             The file has "+percentage+" % positivity  ", "RESULT", JOptionPane.PLAIN_MESSAGE);
	System.exit(0);
	
}
 


}
