// class Solution {
//     public boolean isPalindrome(int x) {
//         if(x<0 || (x%10 == 0 && x!=0)) return false;
//         int temp=0;
//         while(x!=0){
//             int rem = x%10;
//             temp =(temp*10)+rem;
//             x/=10;
//         } 
//         if(temp==x || x == temp/10 ) return true;
//         return false;
        
//     }
// }
class Solution{
public boolean isPalindrome(int x) {
        return (reverse(x)==x);
    }
    public int reverse(int x)
    {
        int rev=0;
        while(x>0)
        {
            rev*=10;
            rev+=(x%10);
            x/=10;
        }
        return rev;
    }
}