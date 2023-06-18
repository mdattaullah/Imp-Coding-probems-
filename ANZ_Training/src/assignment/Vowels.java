class Vowels
{
	public static void main(String args[])
	{
		String name="sahid";
		String vowels="aeiou";
		char[] n=name.toCharArray();
		for(int i=0;i<n.length;i++)
		{
			if(vowels.contains(String.valueOf(n[i])))
				System.out.print(n[i]+",");
		}
	}
}