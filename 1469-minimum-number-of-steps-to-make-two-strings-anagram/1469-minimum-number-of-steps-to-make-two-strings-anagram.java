class Solution {
    public int minSteps(String s, String t) {
        int[]freq=new int[26];
        for(char ch:s.toCharArray() ){
            freq[ch-'a']++;
        }
        int[] fre=new int[26];
        for(char ch:t.toCharArray()){
            fre[ch-'a']++;
        }
        int sum=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]<fre[i]){
                sum+=Math.abs(freq[i]-fre[i]);
            }
        }
        return sum;
    }
}