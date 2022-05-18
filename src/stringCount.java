
public class stringCount {
	
	public int stringCount(String a,char b) {
		int count=0;
		a=a.toLowerCase();
		b=Character.toLowerCase(b);
		
		for(int i=0;i<a.length();i++) {
			if(b==a.charAt(i)) {
				count ++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Ananth";
		char b='A';
		stringCount s=new stringCount();
		System.out.println("The cahracter occured "+b+" "+s.stringCount(a, b));
		

	}

}
