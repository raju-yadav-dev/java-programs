class PrimeNumber
{
    boolean isPrime(int number)
    {
        if(number<1)
            return false;
        for(int i=2;i<number;i++)
        {
            if(number%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        PrimeNumber Prime=new PrimeNumber();
        System.out.println((Prime.isPrime(1))?"1 is a Prime number":"1 is not a Prime number");
        System.out.println((Prime.isPrime(2))?"2 is a Prime number":"2 is not a Prime number");
        System.out.println((Prime.isPrime(3))?"3 is a Prime number":"3 is not a Prime number");
        System.out.println((Prime.isPrime(4))?"4 is a Prime number":"4 is not a Prime number");
        System.out.println((Prime.isPrime(5))?"5 is a Prime number":"5 is not a Prime number");
    }
}