import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.*;

import Day5.arrays_binarysearchlowerbound;

public class LL {
    private Node head;
    private Node tail;

    private int size;
    

    public LL (){
        this.size = 0;
    }

    
// insert element at first position
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }
        size++;
    }

// insert element at last position
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        
        Node node = new Node(val);
        
        tail.next =  node;
        tail = node;
        size++;
    }

// insert element on a specific index
    public void insert (int val , int index){
        if(index == 0){
            insertFirst(val);
            return;
        }

        if (index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1 ; i<index ; i++){
            temp = temp.next;
        }

        Node node = new Node(val , temp.next);
        temp.next = node;
        size++;


    }


//delete element at first position
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }

        size--;
        return val;
    }



//delete last element

    public int deleteLast(){
        if(size <= 1) return deleteFirst();

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;

    }
    public Node get(int index){
        Node node = head;
        for(int i = 0 ; i<index ; i++){
            node = node.next;
        }
        return node;
    }

    public Node find (int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;

    }
// delete a particular index
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }

        if(index == size-1){
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;

    }
// print or display linked list
    public void display (){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

// insert using recursion
    public void insertRec(int val, int index){
        head = insertRec(val, index, head);

    }


    private Node insertRec(int val, int index, Node node){
        if (index == 0){
            Node temp = new Node(val , node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1 , node.next);
        return node;
    }



    //question 83 
    public void duplicates(){
        Node node = head;

        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }
            else{
                node = node.next;

            }
        }
        tail = node;
        tail.next = null;
    }


    // question 21
    public static LL merge (LL first , LL second){
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while(f!= null && s!= null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }else{
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while (f != null){
            ans.insertLast(f.value);
            f = f.next;
        }

        while (s != null){
            ans.insertLast(s.value);
            s = s.next;
        } 
    }

    //q21 leetcode version
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
// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode dummy = new ListNode();
//         ListNode tail = dummy;

//         while(list1 != null && list2 != null){
//             if(list1.val < list2.val){
//                 tail.next = list1;
//                 list1 = list1.next;
//                 tail = tail.next;
//             }else{
//                 tail.next = list2;
//                 list2 = list2.next;
//                 tail = tail.next;
//             }
//         }

//         while(list1 != null){
//             tail.next = list1;
//             list1 = list1.next;
//             tail = tail.next;
//         }

//         while(list2 != null){
//             tail.next = list2;
//             list2 = list2.next;
//             tail = tail.next;
//         }
//         return dummy.next;


//     }
// }



// q 141
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         ListNode fast = head;
//         ListNode slow = head;

//         while(fast != null && fast.next != null){
//             fast = fast.next.next;
//             slow = slow.next;
//             if(slow == fast){
//                 return true;
//             }
//         }
//         return false;
//     }
// }
    private class Node{
        private int value;
        private Node next;

        public Node (int value){
            this.value = value;
        }

        public Node (int value , Node next){
            this.value=value;
            this.next = next;
        }


    }
}
