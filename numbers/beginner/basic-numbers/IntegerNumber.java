class IntegerNumber
{
    boolean isInteger(double number)
    {
        if(number==(int)number)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        IntegerNumber Integer=new IntegerNumber();
        System.out.println((Integer.isInteger(5.0))?"5 is an Integer number":"5 is not an Integer number");
        System.out.println((Integer.isInteger(-3.0))?"-3 is an Integer number":"-3 is not an Integer number");
        System.out.println((Integer.isInteger(2.5))?"2.5 is an Integer number":"2.5 is not an Integer number");
    }
}