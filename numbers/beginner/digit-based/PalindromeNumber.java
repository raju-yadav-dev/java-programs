class PalindromeNumber
{
    boolean isPalindrome(int number)
    {
        if(number<0)
            return false;
        else if(number<10)
            return true;
        int n=number,s=0;
        while(n!=0)
        {
            s=s*10+n%10;
            n/=10;
        }
        if(s==number)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        PalindromeNumber Palindrome=new PalindromeNumber();
        System.out.println((Palindrome.isPalindrome(121))?"121 is a Palindrome number":"121 is not a Palindrome number");
        System.out.println((Palindrome.isPalindrome(-121))?"-121 is a Palindrome number":"-121 is not a Palindrome number");
        System.out.println((Palindrome.isPalindrome(10))?"10 is a Palindrome number":"10 is not a Palindrome number");
    }
}