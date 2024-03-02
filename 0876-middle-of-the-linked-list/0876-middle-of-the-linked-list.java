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
    public ListNode middleNode(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode node = head;
        int count = 0;
        while(true) {
            count++;
            list.add(node.val);
            if(node.next!=null) {
                ListNode n = node.next;
                // System.out.println(node.val);
                
                node = node.next;
            }else{
                break;
            }
            
        }
        // System.out.println(count);
        ListNode answer = new ListNode();
        ListNode temp = new ListNode();
        if(count%2==0) {
            for(int i = count-1; i >= count/2; i--) {
                if(i==count-1){
                    temp = new ListNode(list.get(i));
                }else {
                    ListNode next = temp;
                    temp = new ListNode(list.get(i), next);
                }
            }
        }else {
            for(int i = count - 1; i >= count/2; i--) {
                if(i==count-1) {
                    temp = new ListNode(list.get(i));
                }else{
                    ListNode next = temp;
                    temp = new ListNode(list.get(i), next);
                }
            }
        }
        return temp;
    }
}