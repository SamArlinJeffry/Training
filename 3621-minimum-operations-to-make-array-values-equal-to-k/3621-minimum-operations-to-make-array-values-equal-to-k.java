class Solution {
    public int minOperations(int[] nums, int k) {
       HashSet<Integer> set = new HashSet<>();
       for(int i:nums){
        if(i<k) return -1;
        else{
            set.add(i);
        }
       }
       int count =0;
       for(int i:set){
        if(i>k) count++;
       }
       return count;
    }
}