package Learn_Abstraction;

public class Abstraction2 extends Abstraction1{

	@Override
	public void price() {
		System.out.println("6,00,000");
	}
	
	public static void main(String[] args) {
	Abstraction2 a2 = new Abstraction2();
			a2.car();
			a2.model();
			a2.price();
	}
			
	
	

}
