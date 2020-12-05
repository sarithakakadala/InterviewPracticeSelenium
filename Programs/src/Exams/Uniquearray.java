package Exams;

import java.util.Arrays;
import java.util.HashSet;

public class Uniquearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,4,5,6,3,7,6,2,4,2};
		//single loop 
		HashSet<Integer> h=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			h.add(a[i]);
		}
		System.out.println(h);
		
	}

}
