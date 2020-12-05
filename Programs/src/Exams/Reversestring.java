package Exams;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="saritha";
		String temp="";
		char [] b=a.toCharArray();
		for(int i=0;i<b.length;i++)
		{
			
			temp=b[i]+temp;
			
		}
		System.out.println("fits Method: "+temp);
		//second method
		System.out.println("Secong Method");
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.println(a.charAt(i));
		}
		//Third method
		StringBuilder d=new StringBuilder();
		d.append(a);
		System.out.println("Third Method: "+d.reverse());
		
	}

}
