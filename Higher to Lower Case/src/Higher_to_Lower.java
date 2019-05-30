import java.io.*;
import java.util.*;


public class Higher_to_Lower 
{
	public static void main (String[] args) 
	{
		try
	    {
			FileReader fr = new FileReader("English.txt");
			BufferedReader br = new BufferedReader(fr);
		    PrintWriter out = (new PrintWriter(new FileWriter("English2.txt")));
		    String s="";
		     
		   while((s = br.readLine()) != null) 
		   {
		      out.println(s.replaceAll("[^a-zA-Z0-9]","").toLowerCase()+"\n");
		   }
		   out.close();
		   br.close();
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
   }
}


