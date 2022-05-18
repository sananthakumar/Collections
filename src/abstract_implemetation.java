
public class abstract_implemetation extends abstract_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstract_implemetation a= new abstract_implemetation();
		int sum=a.sum(4, 5);
		System.out.println(sum);
		a.print();
		

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("The sum is "+sum(2,3));
	}

}
