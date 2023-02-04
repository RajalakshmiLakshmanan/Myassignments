package assignment;

public class Mobile {
  
	public void makeCall() {
		System.out.println("Make a call to my friend");
		String mobileModel ="Vivo y28";
		float  mobileWeight = 100.5f;
		System.out.println("Mobile model is " +mobileModel);
		System.out.println("Weight of my mobile is "+mobileWeight);
	}
	public void sendMsg() {
		
		System.out.println("Hello my friend");
		boolean isFullcharged = true;
		int mobileCost = 19000;
		System.out.println("Is my mobile is fully charged " +isFullcharged);
		System.out.println("cost of my mobile is " +mobileCost);
	}
	
	
	
	public static void main(String[] args) {
		
		Mobile mobileDetails  =new Mobile();
		System.out.println("This is my mobile");
		mobileDetails.makeCall();
		mobileDetails.sendMsg();
		
	

	}

}
