class WholeNumber
{
    boolean isWholeNumber(int number)
    {
        if(number>=0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        WholeNumber Whole=new WholeNumber();
        System.out.println((Whole.isWholeNumber(0))?"0 is a Whole number":"0 is not a Whole number");
        System.out.println((Whole.isWholeNumber(5))?"5 is a Whole number":"5 is not a Whole number");
        System.out.println((Whole.isWholeNumber(-3))?"-3 is a Whole number":"-3 is not a Whole number");
    }
}