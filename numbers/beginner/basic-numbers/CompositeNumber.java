class CompositeNumber
{
    boolean isComposite(int number)
    {
        if(number<1)
            return false;
        for(int i=2;i<number;i++)
        {
            if(number%i==0)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        CompositeNumber Composite=new CompositeNumber();
        System.out.println((Composite.isComposite(1))?"1 is a Composite number":"1 is not a Composite number");
        System.out.println((Composite.isComposite(2))?"2 is a Composite number":"2 is not a Composite number");
        System.out.println((Composite.isComposite(3))?"3 is a Composite number":"3 is not a Composite number");
        System.out.println((Composite.isComposite(4))?"4 is a Composite number":"4 is not a Composite number");
        System.out.println((Composite.isComposite(5))?"5 is a Composite number":"5 is not a Composite number");
        System.out.println((Composite.isComposite(6))?"6 is a Composite number":"6 is not a Composite number");
        System.out.println((Composite.isComposite(7))?"7 is a Composite number":"7 is not a Composite number");
        System.out.println((Composite.isComposite(8))?"8 is a Composite number":"8 is not a Composite number");
        System.out.println((Composite.isComposite(9))?"9 is a Composite number":"9 is not a Composite number");
    }
}