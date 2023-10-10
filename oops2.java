class mobile {
	String name;
	int ram;
	
	public void Brand () {
		System.out.print(this.name);
	}
	
	public void Specification () {
		System.out.println(" "+ this.ram);
	}
}

public class oops2 {
	public static void main(String[] args) {
		mobile mobile1 = new mobile();
		mobile1.name = "Poco";
		mobile1.ram = 6; 
		
		mobile mobile2 = new mobile();
		mobile2.name = "Realme";
		mobile2.ram  = 	4;
		
		mobile1.Brand();
		mobile1.Specification();
		
		mobile2.Brand();
		mobile2.Specification();
	}
}