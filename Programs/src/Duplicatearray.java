import java.util.ArrayList;

public class Duplicatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={4,5,5,5,4,6,7,0,6,9,4,7};
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				cnt++;
				for(int j=0;j<a.length;j++)
				{
					if(a[i]==a[j] && j!=i)
					{
						cnt++;
					}
				}
				System.out.println("value and count"+a[i]+":"+cnt);
				if(cnt==1)
				{
					System.out.println("unique"+a[i]);
				}
			}
			
		}
		
		

	}

}
