package PrivateModifiers;

public class PrivateConstructor {
	private PrivateConstructor(){}//private constructor  
	void msg(){System.out.println("Hello java");}  
	/*public static void main(String args[]){  
		   PrivateConstructor obj=new PrivateConstructor();  //no compile errorprivate class
		   obj.msg();//Compile Time Error 
		   //	PrivateConstructor obj2=new PrivateConstructor();//constructor is define as private
		   	B obj3=new B();//default B class is defined in other package and cannot create object as access modifier id default
		   	obj3.msg();
		   	C obj4=new C();//public class in another package 
		  	obj4.msg();
		   } */ 
}
