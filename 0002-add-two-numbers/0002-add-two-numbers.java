/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode head,tail;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0,digit;
        while(l1!=null ||l2!=null||carry!=0){
            int sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            
            carry=sum/10;
            digit=sum%10;
            create(digit);
        }
        return head;
    }
    
    public void create(int data){
        
        ListNode newNode=new ListNode(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
        
    }
}