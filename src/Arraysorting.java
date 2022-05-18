import java.util.Arrays;

public class Arraysorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {23,54,68,98,75,45,200,800,1000};
		int temp;
		//int _=10;
//		Arrays.sort(a);
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
        for (int i=0;i<a.length;i++) {
        	
        	for(int j=i+1;j<a.length;j++) {
        		if(a[i]>a[j]) {
        			temp=a[i];
        			a[i]=a[j];
        			a[j]=temp;
        		}
        	}
        	
        }
        for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
