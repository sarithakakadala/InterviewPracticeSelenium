import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Readfilespractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String TestFile = "F:\\Sample.log";
		//Created object of java File class.

		  File FC = new File(TestFile);
		 // FC.createNewFile();//Create file.
		  
		  //Writing In to file.
		  //Create Object of java FileWriter and BufferedWriter class.
		  /*FileWriter FW = new FileWriter(TestFile);
		  BufferedWriter BW = new BufferedWriter(FW);
		  BW.write("This Is First Line."); //Writing In To File.
		  BW.newLine();//To write next string on new line.
		  BW.write("This Is Second Line."); //Writing In To File.
		  BW.close();*/
		  
		  //Reading from file.
		  //Create Object of java FileReader and BufferedReader class.
		  FileReader FR = new FileReader(TestFile);
		  ///BufferedReader BR = new BufferedReader(FR);
		  String Content = "";
		  
		  //Loop to read all lines one by one from file and print It.
		 /* while((Content = BR.readLine())!= null){
			  if(Content.contains("saritha"))
			  {
				  System.out.println("text found");
			  }
		  }
		  FileInputStream fis = new FileInputStream("F:\\Sample.log"); 
		  int b = fis.read(); 
		  while(b != -1)
		  {
			  System.out.print(b);
			  b = fis.read(); 
			  System.out.println(b);
		  }*/
		  InputStream in = new FileInputStream("F:\\Sample.log");
		  InputStreamReader r=new InputStreamReader(in);   
		  //sr.read()
		    BufferedReader br=new BufferedReader(r); 
		    while((Content = br.readLine())!= null){
				  if(Content.contains("saritha"))
				  {
					  System.out.println("text found");
				  }
			  }
		    String s="dsfdsf3423(*";
		    TreeSet <String> s1=new TreeSet();
		    char [] a=s.toCharArray();
		  for(int i=0;i<a.length;i++)
		  {
			  s1.add(a);
		  }
		    //String name=br.readLine();    
		    //System.out.println("Welcome "+name);   

		  //Read more: https://www.java67.com/2016/03/difference-between-filereader-vs.html#ixzz6dGksO4cE

	}

}
