public class naturalnumbers   
{

    public static void main(String[] args) 
	{

       int num = 5, count = 1, total = 0;

       while(count <= num)
       {
           total = total + count;
           count++;
       }

       System.out.println("Sum of first 5 natural numbers is: "+total);
    }
}