class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            String s=Integer.toBinaryString(i);
            int x=Integer.bitCount(i);
            if(x==k){
                sum+=nums.get(i);
            }
            
        }
        return sum;
    }
    
}