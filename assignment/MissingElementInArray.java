package week1day2.assignment;

public class MissingElementInArray {

	public static void main(String[] args) {
		
		int[] numArray = {1,2,3,4,7,6,8};
		
		int length = numArray.length;
		
		for(int i= numArray[0],j=0;j < length; i++,j++) {
			
			if(i!= numArray[j]) {
				
				System.out.println(" the missing element in the given array is "+i);
				break;
				
			}
		}
		

	}

}
