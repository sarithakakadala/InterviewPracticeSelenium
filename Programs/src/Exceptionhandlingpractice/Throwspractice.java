package Exceptionhandlingpractice;

import java.io.PrintWriter;

public class Throwspractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		dostuff();
		//Thread.sleep(3000);
		//System.out.println("Hello");
		//PrintWriter pw=new PrintWriter("bc.txt");
		//pw.println("Helo");
	}
	public static void dostuff() throws InterruptedException
	{
		domorestuff();
	}
	
	public static void domorestuff() throws InterruptedException
	{
		Thread.sleep(3000);
	}

}
