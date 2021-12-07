package First;

public class Nonstaticn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//How to creat object of the class -- ClassName NameOfObject = new ConstructorOFThatClass
	Nonstaticn obj=new Nonstaticn("PeopleNTech");
	obj.Addition();
	
	}
	public void Addition() {
		int Income=100000;
		int Expense=60000;
		int Profit=Income-Expense;
		System.out.println(Profit);
	}
	public void ProfitOfMonth(int Income,int Expense,String Name)	{
		int Profit=Income-Expense;
		System.out.println("Profit of "+Name+" = "+Profit);
		
	}
	public int ProfitOfMonthTax(int Income,int Expense,String Name)	{
		int Profit=Income-Expense;
		System.out.println("Profit of "+Name+" = "+Profit);
		return Profit;
	}
	
	public Nonstaticn(String message) {
		System.out.println(message);
		
	}

}

