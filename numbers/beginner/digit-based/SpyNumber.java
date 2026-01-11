class SpyNumber
{
    boolean isSpy(int number)
    {
        int sum=0,prd=1;
        while(number!=0)
        {
            sum+=number%10;
            prd*=number%10;
            number/=10;
        }
        return sum==prd;
    }
}