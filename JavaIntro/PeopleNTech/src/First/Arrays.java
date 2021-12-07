package First;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]	id=new int[10];
		
		id [0]=1000;
		id [1]=2000;
		id [2]=3000;
		id [3]=4000;
		id [4]=5000;
		id [5]=6000;
		id [6]=7000;
		id [7]=8000;
		id [8]=9000;
		id [9]=10000;
		System.out.println(id[9]);
		System.out.println(id[0]);
		System.out.println(id[1]);
		System.out.println(id[2]);
		System.out.println(id[3]);
		System.out.println(id[4]);
		System.out.println(id [5]);
		System.out.println(id [6]);
		System.out.println(id[7]);
		System.out.println(id[8]);
		
		System.out.println(id.length);
		for(int i=0;i<id.length;i++) {
			System.out.println("id["+i+"]="+id[i]);
		} 
	
for(int jtr : id) {
	System.out.println(jtr);
}


int[][] countries=new int [6][2];
countries [0][0]=6000;
countries [1][0]=60000;
countries [3][1]=6;
System.out.println(countries[3][1]);
	} 

}
