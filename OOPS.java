class pen {
	String Colour;
	String Brand;
	
	public void printColour() {
		System.out.println(this.Colour);
	}
	
	public void printBrand() {
		System.out.println(this.Brand);
	}
}

public class OOPS {
	public static void main(String[] args) {
		pen pen1 = new pen();
		pen1.Colour= "Blue";
		pen1.Brand = "Cello";
		
		pen pen2 = new pen();
		pen2.Colour = "Black";
		pen2.Brand = "Tata";
		
		pen1.printColour();
		pen1.printBrand();
		
		System.out.println();
		
		pen2.printColour();
		pen2.printBrand();
	}	
}