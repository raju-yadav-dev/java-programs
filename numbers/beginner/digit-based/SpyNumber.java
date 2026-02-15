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
    public static void main(String[] args) {
        SpyNumber Spy=new SpyNumber();
        System.out.println((Spy.isSpy(123))?"123 is a Spy number":"123 is not a Spy number");
        System.out.println((Spy.isSpy(124))?"124 is a Spy number":"1124 is not a Spy number");
        System.out.println((Spy.isSpy(132))?"132 is a Spy number":"132 is not a Spy number");
    }
}