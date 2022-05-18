
public class For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int count=1,count1=1;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4-i;j++) {
				
				System.out.print(count);
				count++;
			
			}
			System.out.print("\n");
		}
		
		
		System.out.println("next for ");
		for(int i=0;i<4;i++) {
			System.out.println("Inside main fors");
			for(int j=0;j<=i;j++) {
				
			System.out.print(count1);
			count1++;
			}
			System.out.print("\n");
		}
		
		for(int i=10;i>0;i--) {
			for (int j=0;j<=10-i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("For  exercise 4------");
		for(int i=0;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				System.out.print ("\t");
				
			}
			System.out.print("\n");
		}
		int count_2=3;
		System.out.println("For  exercise 5------");
		for(int i=0;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count_2);
				System.out.print ("\t"); 
				count_2+=3;
				
			}
			System.out.print("\n");
		}
	}

}
