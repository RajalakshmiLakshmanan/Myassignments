package assignment;

public class Car {
	
	public void applyBreak() {
		System.out.println("Applied break");
		
	}
	
	public void soundHorn() {
		
		System.out.println("sound horn");
	}

	public static void main(String[] args) {
		
		System.out.println("car action details");

		Car carAction = new Car();
		carAction.applyBreak();
		carAction.soundHorn();
 
		
	}

}
