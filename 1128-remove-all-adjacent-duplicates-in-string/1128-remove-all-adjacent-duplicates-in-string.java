class Solution {
    public String removeDuplicates(String s) {
        Stack <Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if((!stack.isEmpty() && stack.peek()!=s.charAt(i))||stack.isEmpty()){
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