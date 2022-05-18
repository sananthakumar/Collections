
public class multiarraymaxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][]a= {{10,3,5},{2,6,11 },{8,9,1}};
		int min=a[0][0];
		int max=a[0][0];
		System.out.println(a[1].length);
		for(int i=0;i<a[1].length;i++) {
			
			for(int j=0;j<a[1].length;j++) {
			if(a[i][j]<min) {
				min=a[i][j];
			}
			if(a[i][j]>max) {
				max=a[i][j];
			}
			}
			
		}
		System.out.println("Min ="+min);
		System.out.println("Max ="+max);
	}

}
