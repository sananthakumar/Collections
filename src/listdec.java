import java.util.*;
	
public class listdec {

	
	
	

	     public static void main(String []args){
	        System.out.println("Hello World");
	        HashSet<String> hs1=new HashSet<String>();
	        hs1.add("Ananth");
	        hs1.add("kumar");
	        hs1.add("Ananth");
	        
	        Iterator<String>it=hs1.iterator();
	        while(it.hasNext()){
	            System.out.println(it.next());
	        }
	       ArrayList<String>a1=new ArrayList<String>(hs1); 
	       a1.add("Ananth");
	        for(int i=0;i<a1.size();i++){
	            System.out.println(a1.get(i));
	        }
	        
	        HashSet<String>s1=new HashSet<String>(a1);
	        Iterator<String>it1=s1.iterator();
	        while(it1.hasNext()){
	            System.out.println(it1.next());
	        }
	        SortedSet<Integer>ss=new TreeSet<Integer>();
	        ss.add(5);
	        ss.add(3);
	        ss.add(1);
	        ss.add(7);
	        ss.add(6);
	        Iterator<Integer>it2=ss.iterator();
	        while(it2.hasNext()){
	            System.out.println(it2.next());
	        }
	     }
}
