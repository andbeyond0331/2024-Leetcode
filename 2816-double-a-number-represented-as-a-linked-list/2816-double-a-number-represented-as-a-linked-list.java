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
    public ListNode doubleIt(ListNode head) {
        ListNode reversed = new ListNode();
        
        if(head.next == null) {
            if(head.val*2>9) {
                reversed = new ListNode(head.val*2-10);
                reversed = new ListNode(1, reversed);
                
            }else {
                reversed = new ListNode(head.val*2);
            }
            return reversed;
        }
        reversed = new ListNode(head.val*2);
        head = head.next;
        while(true) {
            
            // reversed = new ListNode(head.val*2, reversed);
            if(head.next==null) {
                if(reversed == null) {
                    reversed = new ListNode(head.val*2);
                }else {
                    reversed = new ListNode(head.val*2, reversed);
                }
                break;
            }
            // reversed = new ListNode(head.val*2);
            reversed = new ListNode(head.val*2, reversed);
            head = head.next;
        }
        int up = 0;
        ListNode answer = new ListNode(reversed.val);
        if(reversed.val>9) {
            up = 1;
            answer = new ListNode(reversed.val-10);
        }
        reversed = reversed.next;
        while(true) {
            System.out.println(reversed.val);
            System.out.println("up : " + up);
            if(reversed.next == null) {
                // System.out.println(":::"+reversed.val);
                if(reversed.val+up>9) {
                    answer = new ListNode(reversed.val+up-10, answer);
                    answer = new ListNode(1, answer);
                }else {
                    answer = new ListNode(reversed.val+up, answer);
                }
                return answer;
            }
            if(reversed.val + up > 9) {
                answer = new ListNode(reversed.val + up - 10, answer);
                up = 1;
            }else {
                answer = new ListNode(reversed.val + up, answer);
                up = 0;
            }
            reversed = reversed.next;
        }
        // ListNode answer = new ListNode();
        // int up = 0;
        // if(head.next == null) {
        //     if(head.val*2>9) {
        //         answer = new ListNode(head.val*2-10);
        //         answer = new ListNode(1, answer);
        //         return answer;
        //     }else {
        //         return new ListNode(head.val*2);
        //     }
        // }
        
        // else {
        //     if(head.val*2 > 9) {
        //         answer = new ListNode(head.val*2-10);
        //         up = 1;
        //         answer = new ListNode
        //     }
        // }
        
        // while(true) {
        //     System.out.println(head.val);
        //     if(head.val*2 + up>9) {
        //         answer = new ListNode(head.val*2+up-10, answer);
        //         up = 1;
        //     }else {
        //         answer = new ListNode(head.val*2+up, answer);
        //         up = 0;
        //     }
        //     head = head.next;
        //     if(head.next==null) {
        //         break;
        //     }
        // }
        // return reversed;
    }
}