import java.util.*;
class Second_High_Small
{
	public static void main(String args[])
	{	
		int[] a={5,6,4,2,3,1,8,7,9};
		Arrays.sort(a);
		System.out.println("Second higest\t"+a[a.length-2]);
		System.out.println("Second Smallest\t"+a[1]);
	}
}
			
		