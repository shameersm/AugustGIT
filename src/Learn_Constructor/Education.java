package Learn_Constructor;

public class Education {
	
	public Education() {
		System.out.println("Sam Learned in ARLM School");

	}

	public Education(String College){
		System.out.println("Sam did his college in: "+College);
	
	}
	
	public static void main(String[] args) {
		
		Education ed = new Education();
		Education ed1 = new Education("AMS");
		
	}
}
