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
}