class Solution {
    public int reverse(int x) {
        long rev=0;
        if(x<0){
            x=-x;
            while(x>0){
                int rem=x%10;
                rev=rev*10+rem;
                x/=10;
            }
            if(rev>Integer.MAX_VALUE){
            return 0;
        }
            return (int)rev*-1;
        }else {
            while(x>0){
                int rem=x%10;
                rev=rev*10+rem;
                x/=10;
            }
            if(rev>Integer.MAX_VALUE){
                return 0;
            }
            return (int)rev;
        }
    }
}