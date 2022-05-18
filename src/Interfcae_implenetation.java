
public class Interfcae_implenetation implements interface_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Ananth";
		Interfcae_implenetation a=new Interfcae_implenetation();
		a.interface1();
		a.interface2();
		String e=a.interface3(s);
		System.out.println(e);

	}

	@Override
	public void interface1() {
		// TODO Auto-generated method stub
		System.out.println("Interface 1");
	}

	@Override
	public void interface2() {
		// TODO Auto-generated method stub
		System.out.println("Interface 2");
	}

	@Override
	public String interface3(String a) {
		// TODO Auto-generated method stub
		return a;
	}

}
