class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            String s=Integer.toBinaryString(i);
            // System.out.println(i+"  " + s);
            if(iscorr(s,k)==true){
                sum+=nums.get(i);
            }
            
        }
        return sum;
    }
    public Boolean iscorr(String s,int k){
        int count=0,j=0;
            while(j<s.length()){
                if(s.charAt(j)=='1'){
                    count++;
                }
                j++;
            }
            if(count==k)return true;
            return false;
    }
}