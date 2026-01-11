class ArmstrongNumber
{
    boolean isArmstrong(int number)
    {
        int c=0,n=number,s=0;
        while(n!=0)
        {
            c++;
            n/=10;
        }
        n=number;
        while(n!=0)
        {
            s+=(int)Math.pow(n%10,c);
            n/=10;
        }
        if(s==number)
            return true;
        else
            return false;
    }
}