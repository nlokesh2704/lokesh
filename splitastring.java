public class splitastring 
{ 
	public static void main(String args[]) 
	{ 
		String str = "lokesh@for@gmail"; 
		String[] arrOfStr = str.split("@", 2); 

		for (String a : arrOfStr) 
			System.out.println(a); 
	} 
} 
