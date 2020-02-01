import java.util.Arrays; 

public class arrayequal 
{ 
	public static void main(String[] args) 
	{ 
		int [] a1 = new int [] {1, 2, 3 }; 
		int [] b2 = new int [] {1, 2, 3 }; 
		int [] c3 = new int [] {1, 2, 0 }; 
		
		System.out.println("is a1 equals to b2 : " + 
								Arrays.equals(a1, b2)); 
		System.out.println("is a1 equals to c3 : " + 
								Arrays.equals(a1, c3)); 
	} 
} 
