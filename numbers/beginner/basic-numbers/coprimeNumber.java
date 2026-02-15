class CoprimeNumber
{
    boolean isCoprime(int nums1, int nums2)
    {
        if(nums1==0 || nums2==0)
            return false;
        int min=Math.min(nums1,nums2);
        for(int i=2;i<min;i++)
        {
            if(nums1%i==0 && nums2%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        CoprimeNumber coprime=new CoprimeNumber();
        System.out.println((coprime.isCoprime(15,28))?"15 and 28 are Coprime numbers":"15 and 28 are not Coprime numbers");
        System.out.println((coprime.isCoprime(12,15))?"12 and 15 are Coprime numbers":"12 and 15 are not Coprime numbers");
        System.out.println((coprime.isCoprime(17,19))?"17 and 19 are Coprime numbers":"17 and 19 are not Coprime numbers");
    }
}
