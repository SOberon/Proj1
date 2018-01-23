
public class Proj1 {

	public static void main(String[] args){
		int number = userPicksAnInt();		//User picks a number
		sumit(number);				//Tree is generated and printed
	}
	
	public static int userPicksAnInt(){
		Scanner sc = new Scanner(System.in); 	//Scanner for user entry
		int n;					//Number to be parsed or whatever the correct word is
				
		//Ask the user to input a number
		System.out.println("Please enter a positive integer");
		//TODO Add exception handling for user entry of a char, negative number, float, empty, null, etc...
		number = sc.nextInt();
	}
	
	public static void sumit(int number)
	{
		if(number == 1) //Base cases are good, but probably don't need
		{
			System.out.print("1");
			
		} else {
			
			
			for(int i = 1; i < number; i++)
			{
			
				System.out.print(i + " + "); 
				sumit(number - i);
				System.out.print("   ");
			}
			
			
			
		}
		
			
	}
	
	
	public static void main(String[] args)
	{
		sumit(4);
	}
}

//TODO Write unit tests. Maybe.
