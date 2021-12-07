package First;

public class if_else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		
		//computer=90, linux=80, software=60
		//write the program that calculate the avg of marks
		
		
		
		int computer=90;
		int linux=80;
		int software=60;
		
		int total=computer+linux+software;
		
		int avg=total/3;
		
						
				System.out.println(avg);
		
		if(avg>=90 && avg<100)	{
			System.out.println("The grade for student A");
		}else if(avg>=80 && avg<89) {
			System.out.println("The grade for student B");
		}else if(avg>=60 && avg<79) {
			System.out.println("The grade for student C");
		}else if(avg>=60 && avg<69) {
			System.out.println("The grade for student D");
		}else	{
			System.out.println("Coffee with teacher");
		}
		
		
		
		
		
	}

}
