import java.util.ArrayList;
import java.util.Iterator;

public class arayunique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a= {1,1,2,3,2,4,5,6,7,8,8,8,9,9,9,9,10,10,10,3,4,5,6 };
		ArrayList<Integer>a1=new ArrayList<Integer>();
		ArrayList<Integer>uniq=new ArrayList<Integer>();
		
		//adding elements to a1 list
		for(int i=0;i<a.length;i++) {
			int count=0;
			if(! a1.contains(a[i])) {
				a1.add(a[i]);
				//after adding element to a1 list now check the 
				//remaining elements in array using another for loop
				for(int j=0;j<a.length;j++) {
					if(a[i]==a[j]) {
						count++;
					}
					
				}
				System.out.println("The element "+a[i]+" present "+count+" times");
				if(count==1) {
					uniq.add(a[i]);
				}
			}
			
		}
		System.out.println("***********************************************");
		Iterator<Integer> it=uniq.iterator();
		while(it.hasNext()) {
			System.out.println("Unique element "+it.next());
		}
	}

}
