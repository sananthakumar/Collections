
public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//fibbonaci 1 2 3 5 8 13 21
		
		//0- a 
		//1- first-- next ietration thois will be a
		//1-- next ieration this will be first
		//2
		
		int n=8;
		int a=0;
		int first=1;
		int sum=0;
		System.out.print(a);
		for(int i=0;i<=n;i++) {
			
			
			sum=a+first;
			System.out.print(sum+"\t");
			a=first;
			first=sum;
			
			
			
		}

	}

}
