
public class Pyramidtraingle {
	public static void includespace(int i)
	{
		int j=0;
		for(j=0;j<i;j++)
		{
			System.out.print("\t");
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		for(int i=0;i<4;i++)
		{
			includespace(i);
			
			for(int j=0;j<4-i;j++)
			{
				k++;
				System.out.print(k);
				System.out.print("\t\t");
				
			}
		
			System.out.println("");
		}

	}

}
