package First;


public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		obj.addition();
		obj.subtraction();
		obj.multiply();
		obj.division();
			}
		public void addition ()	{
			System.out.println("This is Public");
			subtraction();
	}
private void subtraction()	{
		System.out.println("THis is private method");
		subtraction();
		
}
protected void multiply() {
	
}
void division()	{
	
}
}
