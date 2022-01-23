package First;

import Sixth.C;
public class Getters_Seters {
	private int d;
	private int k;

	public int getd() {
		return d;
	}

	public void setd(int d) {
		this.d = d;
	}

	public int getk() {
		return k;
	}

	public void setk(int k) {
		this.k = k;
	}

	public static void main(String[] args) {
		Object object = null;
// TODO Auto-generated method stub
		A obj= new A();
		((A) object).addition();
		C object1= new C();
		
object1.getD();
int t=object1.getD();
System.out.println("This is T = "+t);


		
	}

}
