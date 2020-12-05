import java.util.Arrays;

public class ReverseArraywithsingleloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7};
		int temp=0;
		//First method with single loop
		/*for(int i=0;i<a.length/2;i++)
		{
			temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		}
		System.out.println(Arrays.toString(a));*/
		
		//second method
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
		}
		System.out.println(Arrays.toString(a));
	}

}
