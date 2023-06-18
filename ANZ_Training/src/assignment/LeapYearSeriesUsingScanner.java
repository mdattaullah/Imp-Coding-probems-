import java.util.*;
class LeapYearSeriesUsingScanner
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Begning of the Year");
		int BegningYear,EndYear,i;
		BegningYear=sc.nextInt();
		System.out.println("Enter End of the Year");
		EndYear=sc.nextInt();
		System.out.println("Leap year between "+BegningYear+" & "+EndYear+" is");
		for(i=BegningYear;i<=EndYear;i++)
		{
			if((i%4==0) && (i%100!=0) || (i%400==0))
				System.out.println("=>"+i);
		}
	}
}
		