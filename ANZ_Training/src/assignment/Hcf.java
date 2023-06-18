class Hcf
{
	public static void main(String args[])
	{
		int n1=15,n2=20,hcf=0;
		hcf=(n1>n2)?n2:n1;
		while(true)
		{
			if(n1%hcf==0 && n2%hcf==0)
			{
				System.out.println(hcf);
				break;
			}
			--hcf;
		}
	}
}
		