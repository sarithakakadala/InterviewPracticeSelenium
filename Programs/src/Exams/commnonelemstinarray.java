package Exams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class commnonelemstinarray {
	

	public static void main(String[] args) {
		//commnonelemstinarray.commonElements(array1, array2)
		
		
		// TODO Auto-generated method stub
		Integer [] a= {1,4,7, 9, 2};
		Integer [] b={1,7,3,4,5};
		ArrayList <Integer> c=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					if(!c.contains(a[i]))
					{
						c.add(a[i]);
						
					}
				}
			}
		}
		System.out.println("First Method : "+c);
		//second method
		List<Integer> arr1=Arrays.asList(a);
		List<Integer> arr2=Arrays.asList(b);
		HashSet<Integer> aset=new HashSet<>(arr1);
		aset.retainAll(arr2);
		System.out.println("Second Method: "+aset);
		
	}

}
