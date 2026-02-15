class EvenNumber
{
    boolean isEven(int number)
    {
        if(number%2==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        EvenNumber Even=new EvenNumber();
        System.out.println((Even.isEven(4))?"4 is an Even number":"4 is not an Even number");
        System.out.println((Even.isEven(7))?"7 is an Even number":"7 is not an Even number");
        System.out.println((Even.isEven(0))?"0 is an Even number":"0 is not an Even number");
    }
}