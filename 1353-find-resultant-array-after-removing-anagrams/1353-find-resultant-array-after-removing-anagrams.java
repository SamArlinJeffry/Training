class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> list=new ArrayList<>();
        // int n=words.length;
        for(String word:words)list.add(word);
        for(int i=1;i<list.size();i++){
            char[] st1=list.get(i).toCharArray();
            char[] st2=list.get(i-1).toCharArray();
            Arrays.sort(st1);
            Arrays.sort(st2);
            if(Arrays.equals(st1,st2)){
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}