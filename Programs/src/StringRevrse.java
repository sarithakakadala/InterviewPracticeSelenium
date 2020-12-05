
public class StringRevrse {
	final void getdata(int a)
	{
		
	}
	public void getdata(int a ,int b)
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="saritha";
		
		char [] c=s.toCharArray();
		String rev="";
		for(int i=c.length-1;i>=0;i--)
		{
			rev=rev+c[i];
			
		}
		System.out.println("with loop: "+rev);
		
		 String str = "Automation";
         StringBuilder str2 = new StringBuilder();
         str2.append(str);
         str2 = str2.reverse();     // used string builder to reverse
        System.out.println("string builder : "+str2);
        System.out.println("================="+str2/w);
       
	}

}
