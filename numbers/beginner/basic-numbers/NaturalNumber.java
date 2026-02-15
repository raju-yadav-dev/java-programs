class NaturalNumber
{
    boolean isNatural(int number)
    {
        if(number>0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        NaturalNumber Natural=new NaturalNumber();
        System.out.println((Natural.isNatural(5))?"5 is a Natural number":"5 is not a Natural number");
        System.out.println((Natural.isNatural(-3))?"-3 is a Natural number":"-3 is not a Natural number");
        System.out.println((Natural.isNatural(0))?"0 is a Natural number":"0 is not a Natural number");
    }
}