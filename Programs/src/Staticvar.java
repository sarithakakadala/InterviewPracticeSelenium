
public class Staticvar {
	private String name;
	String address;
	static String city;
	int i=0;
	static int j;
	
	static
	{
		city="Banglore";
		j=1;
		
	}
	Staticvar(String name,String address)
	{
		this.name=name;
		i++;
		j++;
		System.out.println("i value :"+i);
		System.out.println("j value :"+j);
		this.address=address;
	}
	public void getaddress()
	{
		System.out.println(address +":"+city);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//======without static key word for variable for city
		/*Staticvar obj=new Staticvar("Bob","Marthali","Banglore");
		Staticvar obj1=new Staticvar("henry","Jaya","Banglore");*/
		//static key word for variable
		Staticvar obj=new Staticvar("Bob","Marthali");
		Staticvar obj1=new Staticvar("henry","Jaya");
		obj.getaddress();
		obj1.getaddress();
		

	}

}


