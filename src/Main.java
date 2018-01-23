
public class Sums {

	public static void sumit(int number)
	{
		if(number==1)
		{
			System.out.print("1");
			
		} else {
			
			
			for(int i=1;i<number;i++)
			{
			
				System.out.print(i + " + "); 
				sumit(number-i);
				System.out.print("   ");
			}
			
			
			
		}
		
			
	}
	
	
	public static void main(String[] args)
	{
		sumit(4);
	}
}
