
public class Anagramnumber {
	public int adddigits (int n,int temp)
	{
		
		while(n>0)
		{
			
			temp=(n%10)+temp;
			n=n/10;
		}
		System.out.println(temp);
		return temp;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2048;
		int b=402;
		int temp=0;
		Anagramnumber obj=new Anagramnumber();
		int firstno=obj.adddigits(a,temp);
		int second=obj.adddigits(b,temp);
		if(firstno==second)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
		
				
		

	}

}
