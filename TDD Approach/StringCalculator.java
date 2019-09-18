package primedemo;

public class StringCalculator {


	public int calculate(String input) 
	{
		if(input.isEmpty())
		{
		return 0;
		}
		else if(input.indexOf(",")!=-1)
		{
			String[] tokens = input.split(",");
			int sum=0;
			
			for(String token:tokens)
			{
				sum = sum + Integer.parseInt(token);
			}
			return sum;
		}
		else
		{
			return Integer.parseInt(input);
		}
	}

}
