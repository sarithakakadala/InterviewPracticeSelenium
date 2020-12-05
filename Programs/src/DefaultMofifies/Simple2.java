package DefaultMofifies;

public class Simple2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();  //private class
		   System.out.println(obj.data);//Compile Time Error  
		   obj.msg();//Compile Time Error 

	}

}
