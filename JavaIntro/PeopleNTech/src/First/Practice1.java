package First;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//English=80; Math=60; Science=70
		/*English=E
		 * Math=M
		 * Science=S
		 */
		
		int E=50;
		int M=55;
		int S=80;
		
		int total=E+M+S;
		
		int avg = total/3;
		
		System.out.println("The average of John is="+avg);
		System.out.println(avg);
		
		
		if	(avg>=90 && avg<100)	{
			System.out.println("The grade of John is A");
		}else if (avg>=80 && avg<89)	{
			System.out.println("The grade of John is B");
		}else if (avg>=70 && avg<79)	{
			System.out.println("The grade of John is C");
		}else if (avg>=60 && avg<69)	{
			System.out.println("Have Fun");
		}
			
			
			
			
	}

}
