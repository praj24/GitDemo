class Cricket
{
	int runs;
}

public class Hello 
{

	public static void main(String[] args) 
	{
		
		Cricket c1 = new Cricket();
		c1.runs=250;
		Cricket c2;
		c2=c1;
		
		c2.runs=300;
		
		
		
		
		  System.out.println(c1.runs);
	}

}
