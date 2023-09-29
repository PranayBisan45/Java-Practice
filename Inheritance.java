import java.util.Scanner;

class Colours {
	String Colour;
	public void getColour() {
	System.out.println("Colour is "+ this.Colour);
    }
}

class Triangle extends Colours {
	public void getArea(int b, int h) {
		System.out.println(0.5*b*h);
	}
}


public class Inheritance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangle T1 = new Triangle();
		T1.Colour = "Red";
		System.out.println("Enter beadth and height");
		int b = sc.nextInt();
		int h = sc.nextInt();
		T1.getArea(b, h);
		T1.getColour();
		sc.close();
	}
}