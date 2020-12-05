package Exceptionhandlingpractice;

public class Exceptionwiththrow extends RuntimeException{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//case2:
		/*throw new ArithmeticException("/ by zero saritha");
		System.out.println("Hello");*/
		//case3:
		throw new Exceptionwiththrow();
		
		/*Result:
			Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
				No excep*tion of type Exceptionwiththrow can be thrown; an exception type must be a subclass of Throwable
			*/
			
	}

}
