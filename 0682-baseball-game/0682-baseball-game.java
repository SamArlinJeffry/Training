class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st=new Stack<>();
        int ans=0;
        for(int i=0;i<operations.length;i++){
            String ch=operations[i];
            if(ch.equals("C"))st.pop();
            else if(ch.equals("D"))st.push((st.peek())*2);
            else if(ch.equals("+")){
                int temp=st.pop();
                int val=st.peek()+temp;
                st.push(temp);
                st.push(val);
            }
            else{
                int a=Integer.parseInt(ch);
                st.push(a);
            }


        }
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}