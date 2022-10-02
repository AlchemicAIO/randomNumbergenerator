package randomnumber;
import java.util.Random;

public class practiceclass {
	
	public static void main(String[] args) {
		
		Random a = new Random();
		
		//int x = a.nextInt(6)+1;
		//double y = a.nextDouble();
		//boolean z = a.nextBoolean();
		int n1 = a.nextInt();
		
		System.out.println("Generated number is: " + n1);
		
		// This range is 0 through 20
		int n2 = a.nextInt(21);
		System.out.println("Generated number is: " + n2);
		
		// 5 to 35
		int n3 = a.nextInt(22-7) + 7;
		System.out.println("Generated number is: " + n3);
		
		// 1000-9999
		int n4 = 1000 + a.nextInt(10000 - 1000);
		System.out.println("Generated number is: " + n4);
		
		// using a function
		int n5 = aRange(1,3);
		System.out.println("Generated number is: " + n5);
		
		
	}
	
	public static int aRange(int start, int finish)
	{
		/*Random a = new Random();
		int aInt = start + a.nextInt(finish + 1 - start) + start;
		return aInt;*/
		  
		
		//Or use this line for more efficient coding practice
		
		return (
				new Random().nextInt(finish + 1 - start) + start
				);
				
			
		
		
	}
	
}
