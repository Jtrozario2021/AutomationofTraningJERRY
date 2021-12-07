package First;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Addition();
	int ProfitBeforeTax=ProfitOfMonthTax(100000, 60000, "Jan");
	System.out.println("This is profit before tax =" +ProfitBeforeTax);
	ProfitOfMonth(140000, 25000, "Feb");
	ProfitOfMonth(178000, 70000, "Mar");
	
	}
	//Access-modifier static void NameOfMethod(){}
	public static void Addition() {
		int Income=100000;
		int Expense=60000;
		int Profit=Income-Expense;
		System.out.println(Profit);
	}
	public static void ProfitOfMonth(int Income,int Expense,String Name)	{
		int Profit=Income-Expense;
		System.out.println("Profit of "+Name+" = "+Profit);
		
	}
	public static int ProfitOfMonthTax(int Income,int Expense,String Name)	{
		int Profit=Income-Expense;
		System.out.println("Profit of "+Name+" = "+Profit);
		return Profit;
	}
}
