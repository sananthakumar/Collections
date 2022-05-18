import java.util.ArrayList;
import java.util.Iterator;

public class Amazon_aray_question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] ar= {1,2,3,3,4,2,2,4,5,5,5,5,5,6,7,6,6,6,6,7,8,9,9,10};
		ArrayList<Integer>unique=new ArrayList<Integer>();
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		
		for(int i=0;i<ar.length;i++) {
			int count=0;
			if(!al.contains(ar[i])) {
				al.add(ar[i]);
				//count++;
				for(int j=0;j<ar.length;j++) {
					if(ar[i]==ar[j]) {
						count++;
						 
					}
				}
				System.out.println("the element  -"+ar[i]+" is present --"+count);
				if(count==1) {
				unique.add(ar[i]);	
				}
			}
		}
		
		Iterator <Integer>it=unique.iterator();
		while(it.hasNext()) {
System.out.println("The unique elements are "+it.next());		
		}

	}

}
