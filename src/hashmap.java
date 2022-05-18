import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <String,String>m1=new HashMap<String,String>();
		m1.put("16SUCA009", "Ananthakumar");
		m1.put("16SUCA040", "Ranjithkumar");
		m1.put("16SUCA060", "Yuvaneshwaran");
		m1.put("16SUCA054", "Vairam");
		
		Set<Entry<String,String>> s1=m1.entrySet();
		Iterator<Entry<String,String>>  it=s1.iterator();
		while(it.hasNext()) {
			Map.Entry mp=(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
			
		}	
	   Hashtable<String,String>ht=new Hashtable<String,String>();
	   ht.put("16SUCA009", "Ananthakumar");
	   ht.put("16SUCA040", "Ranjithkumar");
	   ht.put("16SUCA060", "Yuvaneshwaran");
	   ht.put("16SUCA054", "VairaKameshwaran");
		
	   
	   
	   
		System.out.println(ht);
		
		
		
	}

}
