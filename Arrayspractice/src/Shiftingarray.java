//A zero-indexed array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is also moved to the first place.
//eg:For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].
import java.util.Arrays;

public class Shiftingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A= {3, 8, 9, 7, 6};
		int temp=0,temp2=0;
		int k=3;
		for(int j=0;j<k;j++)
		{
			for(int i=0;i<A.length;i++)
			{
				if(i==0)
				{
					temp=A[0];
					A[0]=A[A.length-1];
					
				}
				else
				{
					temp2=A[i];
					A[i]=temp;
					temp=temp2;
					
				}
			}
		}
		
		System.out.println(Arrays.toString(A));
	}

}
