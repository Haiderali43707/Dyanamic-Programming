class Solution {
    public int fib(int n) {
        int []dp=new int[n+1];
        
        if(n==0|| n==1)
        {
            return n;
        }
        int fibnm1=fib(n-1);
        int fibnm2=fib(n-2);
        int ans=fibnm1+fibnm2;
        return ans;
        
    }
}
