
public class Primenumber {

	
	public String findPrime(int a) {
		boolean flag=true;
		String msg=null;
		
		if(a==0||a==1) {
			flag=false;
		}
		else {
			for(int i=2;i<=a/2;i++) {
				if(a%i==0) {
					flag=false;
					break;
				}
			}
		}
		if(flag) {
			msg=a+" is a prime number";
					
		}
		else {
			msg=a+" is not a prime number";
		}
		return msg;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Primenumber p= new Primenumber();
		int n=7;
		boolean flag=true;
		if(n==0||n==1) {
			flag=false;
		}
		else {
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				
				flag=false;
				break;
			}
			
		}
		
		}
		if(flag) {

		System.out.println(n+" is a prime number");
	
	}
		else {
			System.out.println(n+" is not a prime number");
		}
System.out.println(p.findPrime(13));
}
}