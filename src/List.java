import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> names=new ArrayList();
		names.add("Ananth");
		names.add("Kumar");
		names.add("Ranjith");
		names.add("Surya");
		names.add("Muthu");
		names.add("Yuvanesh");
		
		ListIterator it=names.listIterator();
		while(it.hasNext()) {
			String a=it.next().toString();
			
			if(a.equalsIgnoreCase("kumar")) {
				it.set("Ananthakumar");
			}
			System.out.println(a);
		
		}
		System.out.println("For each");
		names.forEach(name->System.out.println(name));
		names.stream().filter(s->s.startsWith("R")).forEach(s->System.out.println(s));
		
		System.out.println(names);

	}

}
