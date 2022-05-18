
public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=153;
		int b,c=0;
		
		while(a>0) {
			b=a%10;
			c=c*10+b;
			a=a/10;
		}
		
		System.out.println("Reversed integer "+c);

	}

}
