class coprimeNumber
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
}
