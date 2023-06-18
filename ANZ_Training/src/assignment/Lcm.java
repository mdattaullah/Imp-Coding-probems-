class Lcm
{
	public static void main(String args[])
	{
		int n1=20,n2=12,lcm=0;
		lcm=(n1>n2)?n1:n2;
		while(true)
		{
			if(lcm%n1==0 && lcm%n2==0)
			{
				System.out.println(lcm);
				break;
			}	
			++lcm;
		}
	}
}
		