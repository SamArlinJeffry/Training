class Solution {
    public int findLucky(int[] arr) {
        int[] freq=new int[501];
        for(int i:arr){
            freq[i]++;
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(freq[arr[i]]==arr[i] && arr[i]>max)max=arr[i];
        }
        return max>0?max:-1;
    }
}