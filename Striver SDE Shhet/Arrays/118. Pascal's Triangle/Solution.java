import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> rows = new ArrayList<>();
            int ans=1;
            if(i==1){
                rows.add(ans);
                list.add(rows);
                continue;
            }
            else if(i==2){
                rows.add(ans);
                rows.add(ans);
                list.add(rows);
                continue;
            }else{
                for(int j=1;j<=i;j++){
                    if(j==1 || j==i){
                        rows.add(1);
                    }
                    else{
                      ans=findNcR(i-1,j-1);
                      rows.add(ans);
                    }
                }
                list.add(rows);
            }            
        }
        return list;
    }
    public static int findNcR(int n, int r){
        int res=1;
        for(int i=0;i<r;i++){
            res*=(n-i);
            res/=(i+1);
        }
        return res;
    } 
}