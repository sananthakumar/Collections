
public class stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String reve="";
		String a="Madam";int k=0;
		char[]a1=a.toCharArray();
		char[]rev=new char[a1.length];
//		for(int i=a1.length-1;i>=0;i--) {
//		
//		rev[k]=a1[i];
//		k++;
//		} 
		
		for(int i=a.length()-1;i>=0;i--) {
			reve=reve+a.charAt(i);
		}
		System.out.println(String.valueOf(reve));
		//if(a.equalsIgnoreCase(String.valueOf(reve))) {
		if(a.equalsIgnoreCase(reve)) {
			System.out.println("Given string "+a+" is plaindrome");
		}
		else {
			System.out.println("Given string is non palindrome");
		}
	}


}
