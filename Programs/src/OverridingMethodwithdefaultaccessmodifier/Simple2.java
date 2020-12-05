package OverridingMethodwithdefaultaccessmodifier;

import ProtectedModifier.D;

public class Simple2 extends D{

	void msg1(){System.out.println("Hello java");}//C.T.Error  
	 public static void main(String args[]){  
	   Simple2 obj=new Simple2();  
	   obj.msg(); 
	   }  

}
