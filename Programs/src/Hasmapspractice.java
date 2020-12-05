import java.util.HashMap;
import java.util.Map;

public class Hasmapspractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Selenium");
		hm.put(2,"Java");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}
