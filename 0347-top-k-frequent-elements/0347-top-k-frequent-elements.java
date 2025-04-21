class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int arr[]=new int[k];
        int index=0;
        while(index<k){
        int max=0;
        int val=0;
        for(int i:map.keySet()){
            if(map.get(i)>max){
                max=map.get(i);
                val=i;
            }
        }
        arr[index++]=val;
        map.remove(val);
        }
        return arr;
    }
}