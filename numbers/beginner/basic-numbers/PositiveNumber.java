class PositiveNumber
{
    boolean isPositive(double number)
    {
        if(number>=0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        PositiveNumber Positive=new PositiveNumber();
        System.out.println((Positive.isPositive(3.0))?"3 is a Positive number":"3 is not a Positive number");
        System.out.println((Positive.isPositive(-5.0))?"-5 is a Positive number":"-5 is not a Positive number");
        System.out.println((Positive.isPositive(0.0))?"0 is a Positive number":"0 is not a Positive number");
    }
}