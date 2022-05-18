
public class pyramidstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=6;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		//Reverse printing pyramid
		System.out.println("Reverse");
		for(int i=n;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
