class BuzzNumber
{
    boolean isBuzz(int number)
    {
        if(number%10==7 ||number%7==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        BuzzNumber Buzz = new BuzzNumber();
        System.out.println((Buzz.isBuzz(7))?"7 is a Buzz number":"7 is not a Buzz number");
        System.out.println((Buzz.isBuzz(17))?"17 is a Buzz number":"17 is not a Buzz number");
        System.out.println((Buzz.isBuzz(23))?"23 is a Buzz number":"23 is not a Buzz number");
    }
}