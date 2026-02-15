class NegativeNumber
{
    boolean isNegative(double number)
    {
        if(number<0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        NegativeNumber Negative=new NegativeNumber();
        System.out.println((Negative.isNegative(-5.0))?"-5 is a Negative number":"-5 is not a Negative number");
        System.out.println((Negative.isNegative(3.0))?"3 is a Negative number":"3 is not a Negative number");
        System.out.println((Negative.isNegative(0.0))?"0 is a Negative number":"0 is not a Negative number");
    }
}