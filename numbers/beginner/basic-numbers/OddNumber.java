class OddNumber
{
    boolean isOdd(int number)
    {
        if(number%2!=0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        OddNumber Odd=new OddNumber();
        System.out.println((Odd.isOdd(4))?"4 is an Odd number":"4 is not an Odd number");
        System.out.println((Odd.isOdd(7))?"7 is an Odd number":"7 is not an Odd number");
        System.out.println((Odd.isOdd(0))?"0 is an Odd number":"0 is not an Odd number");
    }
}