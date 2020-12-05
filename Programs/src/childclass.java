
class childclass extends parentclass {
	int i=1;
	childclass()
	{
		System.out.println("child class");
	}
	
	childclass(int a)
	{
		int i=2;
		System.out.println("parent class value :" +super.i);
		System.out.println("this class value :" +this.i);
		System.out.println("child class");
	}
	
	public void getdata(int a)
	{
		System.out.println("int overload");
	}
	
	private void getdata(float a)
	{
		System.out.println("float overload");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childclass b= new childclass(3);
		b.getdata(2.1f);
		System.out.println("i value in parent "+b.i);
	}

}
