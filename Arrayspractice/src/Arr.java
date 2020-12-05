import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet; 
class Arr {
	public int solution(int [] A)
	{
		int j;
		Arrays.sort(A);
		System.out.println(Arrays.toString(A));
		if(A[A.length-1]<0)
		{
			return 1;
		}
		else 
		{
			int size=A[A.length-1]+1;
			for(j=0;j<=size;j++)
			{
				int cnt=0;
				for(int i=0;i<A.length;i++)
				{
					if(A[i]==j)
					{
						cnt=cnt+1;
					}
					
				}
			if(cnt==0)
				{
					if(j!=0)
					{
						System.out.println(j);
						break;
					}
				}
			}
			return j;
		}
		
	}

	public static void main(String[] args) {
		Arr t=new Arr();
		//Input
		int[] A= {1, 3, 6, 4, 1, 2};
		int[] B= {1, 2, 3};
		int[] C= {-1,-3};
		int number=t.solution(A);
		System.out.println("missing no1:"+number);
		int number2=t.solution(B);
		System.out.println("missing no2:"+number2);
		int number3=t.solution(C);
		System.out.println("missing no3:"+number3);
		
		
		
		
		/*int cnt=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && i!=j)
				{
					System.out.print(a[j]);
				}
			}
		}*/
		/*for(int i=0;i<a.length/2;i++)
		{
			int temp=a[i];
				a[i]=a[a.length-i-1];
				a[a.length-i-1]=temp;
				
		}*/
		
		/*for(int i=0;i<a.length;i++)
		{
			if(a[i]<a[a.length-i-1])
			{
				int temp=a[i];
				a[i]=a[a.length-i-1];
				a[a.length-i-1]=temp;
			}
		}*/
		
		//System.out.print(Arrays.toString(a));
	}
		

}
