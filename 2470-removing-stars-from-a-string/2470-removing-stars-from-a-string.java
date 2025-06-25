class Solution {
    public String removeStars(String s) {
        Stack <Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                stack.push(s.charAt(i));
            }
            else{
                stack.pop();
            }
        }
        StringBuilder ans=new StringBuilder();
    while(!stack.isEmpty()){
        ans.append(stack.pop());
    }
    return ans.reverse().toString();
    }
}