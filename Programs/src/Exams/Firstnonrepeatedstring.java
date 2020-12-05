package Exams;

import java.util.ArrayList;
import java.util.Arrays;

public class Firstnonrepeatedstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="ariirtthhhayr";
		char [] c=a.toCharArray();
		int k=0;
		for(int i=0;i<a.length();i++)
		{
			for(int j=0;j<a.length();j++)
			{
				if(c[i]==c[j] && i!=j)
				{
					k++;
				}
			}
			if(k==0)
			{
				System.out.println("First Non repeated number :"+c[i]);
				break;
			}
			k=0;
			
		}
		//second method
		

	}

}
