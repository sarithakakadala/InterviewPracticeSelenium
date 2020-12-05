import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Sortstring {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String a= "asgdfgstse///>*7$5#@89554";
		String alphabets=a.replaceAll("[0-9/*!@#$%&()<>]", "");
		String numbers=a.replaceAll("[a-z/*!@#$%&()<>]", "");
		String specialcharacters=a.replaceAll("[0-9a-z]", "");
		System.out.println(sortString(alphabets)+sortString(numbers)+specialcharacters);
		HashSet<Integer> hs =new HashSet<Integer>();
		hs.add(1);
		Iterator i=hs.iterator();
		
	}
	
    public static String sortString(String inputString) 
    { 
        // convert input string to char array 
        char tempArray[] = inputString.toCharArray(); 
          
        // sort tempArray 
        Arrays.sort(tempArray); 
          
        // return new sorted string 
        return new String(tempArray); 
        
    } 

}

