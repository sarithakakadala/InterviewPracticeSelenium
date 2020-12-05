import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.println("Double loop"+Arrays.toString(a));
		
	}

}
