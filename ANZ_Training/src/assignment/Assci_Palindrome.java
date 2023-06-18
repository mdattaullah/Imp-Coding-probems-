package assignment;

class Assci_Palindrome
{
    public static void main(String args[])
    {
        int ch1='a', ch2='O';
        String sum=(ch1+""+ch2), rev="";
        System.out.println(sum);
        for(int i=sum.length()-1;i>=0;i--)
        {
            rev=rev+sum.charAt(i);
        }
        if(sum.equals(rev))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}