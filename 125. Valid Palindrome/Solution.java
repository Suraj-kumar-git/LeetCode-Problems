class Solution {
    public boolean isPalindrome(String s) {
        if( s==null || s.length()==0){
            return true;
        }
        // s.replaceAll("//s+","");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            // if((c>=65 && c<=90) || (c>=97 && c<=122)){
                if(Character.isLetterOrDigit(c)){
                    if(Character.isUpperCase(c)){
                        c = Character.toLowerCase(c);
                        sb.append(c);
                    }else{
                        sb.append(c);
                    }
                }
            // }
        }
        for(int i=0,j=sb.length()-1;i<=j;i++,j--){
            if(sb.charAt(i) != sb.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
