class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicate elements
            }
            
            int j = i + 1;
            int k = nums.length - 1;
            
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                
                if (sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++; // Skip duplicate elements
                    }
                    
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--; // Skip duplicate elements
                    }
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        
        return new ArrayList<>(set);
    }
}


// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Set<ArrayList<Integer>> set = new HashSet<>();

//  #Test case failing for input "0P" in this code

//         for(int i=0;i<nums.length-2;i++){
//             if (i > 0 && nums[i] == nums[i - 1]) {
//                 continue; // Skip duplicate elements
//             }
//             HashSet<Integer> temp = new HashSet<>();
//             int j=i+1;
//             int k=nums.length-1;
//             while(j<=k){
//                 int third = -(nums[j]+nums[k]);
//                 if(temp.contains(third)){
//                     ArrayList<Integer> list = new ArrayList<>(Arrays.asList(third,nums[j],nums[k]));
//                     Collections.sort(list);
//                     set.add(list);
//                 }
//                 temp.add(nums[j]);
//                 j++;k--;
//             } 
//         }
//         List<List<Integer>> ans = new ArrayList<>(set);
//         return ans;
//     }
// }



