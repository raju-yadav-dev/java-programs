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
    public static void main(String[] args) {
        ArmstrongNumber Armstrong=new ArmstrongNumber();
        System.out.println((Armstrong.isArmstrong(153))?"153 is an Armstrong number":"153 is not an Armstrong number");
        System.out.println((Armstrong.isArmstrong(375))?"375 is an Armstrong number":"375 is not an Armstrong number");
        System.out.println((Armstrong.isArmstrong(371))?"371 is an Armstrong number":"371 is not an Armstrong number");
    }
}