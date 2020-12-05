package PrivateModifiers;

//import DefaultMofifies.B;
//import PublicModifires.C;

public class Simple extends A{  
 public static void main(String args[]){  
   A obj=new A();  //private class
   System.out.println(obj.data);//Compile Time Error  
   obj.msg();//Compile Time Error 
   
   //	PrivateConstructor obj2=new PrivateConstructor();//constructor is define as private
   /*	B obj3=new B();//default B class is defined in other package and cannot create object as access modifier id default
   	obj3.msg();
   	C obj4=new C();//public class in another package 
  	obj4.msg();*/
   }  
} 