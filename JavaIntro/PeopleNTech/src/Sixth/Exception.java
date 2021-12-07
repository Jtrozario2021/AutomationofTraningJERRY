package Sixth;

public class Exception {

	public static void main(String[] args)  {
		//Auto Generated method
				int[] numbers=new int[10];
		System.out.println("This is before exception");
		try{
			System.out.println(numbers[26]);
		} catch (Throwable e) {
			//handle exception
			System.out.println("The number index is not correct");
		}
		
				
				
				System.out.println("This is after exception");
		//Thread.sleep(6000);
		}

}
